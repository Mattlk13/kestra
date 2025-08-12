#!/usr/bin/env bash
#===============================================================================
# SCRIPT: release-plugins.sh
#
# DESCRIPTION:
#   Runs Gradle release for one or multiple Kestra plugin repositories.
#   - If $GITHUB_PAT is set, HTTPS cloning via PAT is used.
#   - Otherwise, SSH cloning is used (requires SSH key configured on runner).
#
# USAGE:
#   ./release-plugins.sh [options] [plugin-repositories...]
#
# OPTIONS:
#   --release-version <version>   Specify the release version (required).
#   --next-version    <version>   Specify the next (development) version (required).
#   --plugin-file     <path>      File containing the plugin list (default: ../.plugins).
#   --dry-run                     Run in DRY_RUN mode (no publish, no changes pushed).
#   --only-changed                Skip repositories with no commits since last tag (or --since-tag).
#   --since-tag      <tag>        Use this tag as base for change detection (default: last tag).
#   -y, --yes                     Automatically confirm prompts (non-interactive).
#   -h, --help                    Show this help message and exit.
#
# EXAMPLES:
#   # Release all plugins from .plugins:
#   ./release-plugins.sh --release-version=1.0.0 --next-version=1.1.0-SNAPSHOT
#
#   # Release a specific plugin:
#   ./release-plugins.sh --release-version=1.0.0 --next-version=1.1.0-SNAPSHOT plugin-kubernetes
#
#   # Release specific plugins from file:
#   ./release-plugins.sh --release-version=1.0.0 --next-version=1.1.0-SNAPSHOT --plugin-file .plugins
#
#   # Release only plugins that have changed since the last tag:
#   ./release-plugins.sh --release-version=1.0.0 --next-version=1.1.0-SNAPSHOT --only-changed --yes
#===============================================================================

set -euo pipefail

###############################################################
# Globals
###############################################################
BASEDIR=$(dirname "$(readlink -f "$0")")
WORKING_DIR="/tmp/kestra-release-plugins-$(date +%s)"
PLUGIN_FILE="$BASEDIR/../.plugins"
GIT_BRANCH="master"   # Fallback if default branch cannot be detected

###############################################################
# Functions
###############################################################

usage() {
  echo "Usage: $0 --release-version <version> --next-version <version> [options] [plugin-repositories...]"
  echo
  echo "Options:"
  echo "  --release-version <version>   Specify the release version (required)."
  echo "  --next-version    <version>   Specify the next version (required)."
  echo "  --plugin-file     <path>      File containing the plugin list (default: ../.plugins)."
  echo "  --dry-run                     Run in DRY_RUN mode."
  echo "  --only-changed                Skip repositories with no commits since last tag (or --since-tag)."
  echo "  --since-tag      <tag>        Use this tag as base for change detection (default: last tag)."
  echo "  -y, --yes                     Automatically confirm prompts (non-interactive)."
  echo "  -h, --help                    Show this help message and exit."
  exit 1
}

askToContinue() {
  read -r -p "Are you sure you want to continue? [y/N] " confirm
  [[ "$confirm" =~ ^[Yy]$ ]] || { echo "Operation cancelled."; exit 1; }
}

# Detect default branch from remote; fallback to $GIT_BRANCH if unknown
detect_default_branch() {
  local default_branch
  default_branch=$(git remote show origin | sed -n '/HEAD branch/s/.*: //p' || true)
  if [[ -z "${default_branch:-}" ]]; then
    default_branch="$GIT_BRANCH"
  fi
  echo "$default_branch"
}

# Return last tag that matches v* or any tag if v* not found; empty if none
last_tag_or_empty() {
  local tag
  tag=$(git tag --list 'v*' --sort=-v:refname | head -n1 || true)
  if [[ -z "${tag:-}" ]]; then
    tag=$(git tag --sort=-creatordate | head -n1 || true)
  fi
  echo "$tag"
}

# True (0) if there are commits since tag on branch, False (1) otherwise.
has_changes_since_tag() {
  local tag="$1"
  local branch="$2"
  if [[ -z "$tag" ]]; then
    # No tag => consider it as changed (first release)
    return 0
  fi
  git fetch --tags --quiet
  git fetch origin "$branch" --quiet
  local count
  count=$(git rev-list --count "${tag}..origin/${branch}" || echo "0")
  [[ "${count}" -gt 0 ]]
}

###############################################################
# Options parsing
###############################################################

PLUGINS_ARGS=()
AUTO_YES=false
DRY_RUN=false
ONLY_CHANGED=false
SINCE_TAG=""

RELEASE_VERSION=""
NEXT_VERSION=""

while [[ "$#" -gt 0 ]]; do
  case "$1" in
    --release-version)
      RELEASE_VERSION="$2"; shift 2 ;;
    --release-version=*)
      RELEASE_VERSION="${1#*=}"; shift ;;
    --next-version)
      NEXT_VERSION="$2"; shift 2 ;;
    --next-version=*)
      NEXT_VERSION="${1#*=}"; shift ;;
    --plugin-file)
      PLUGIN_FILE="$2"; shift 2 ;;
    --plugin-file=*)
      PLUGIN_FILE="${1#*=}"; shift ;;
    --dry-run)
      DRY_RUN=true; shift ;;
    --only-changed)
      ONLY_CHANGED=true; shift ;;
    --since-tag)
      SINCE_TAG="$2"; shift 2 ;;
    --since-tag=*)
      SINCE_TAG="${1#*=}"; shift ;;
    -y|--yes)
      AUTO_YES=true; shift ;;
    -h|--help)
      usage ;;
    *)
      PLUGINS_ARGS+=("$1"); shift ;;
  esac
done

# Required options
if [[ -z "$RELEASE_VERSION" ]]; then
  echo -e "Missing required argument: --release-version\n"; usage
fi
if [[ -z "$NEXT_VERSION" ]]; then
  echo -e "Missing required argument: --next-version\n"; usage
fi

###############################################################
# Build plugin list (from args or from .plugins)
###############################################################
PLUGINS_ARRAY=()
PLUGINS_COUNT=0

if [[ "${#PLUGINS_ARGS[@]}" -eq 0 ]]; then
  if [[ -f "$PLUGIN_FILE" ]]; then
    # Keep only uncommented lines, then keep the first column (repo name)
    mapfile -t PLUGINS_ARRAY < <(
      grep -E '^\s*[^#]' "$PLUGIN_FILE" 2>/dev/null \
      | grep "io\.kestra\." \
      | cut -d':' -f1 \
      | uniq | sort
    )
    PLUGINS_COUNT="${#PLUGINS_ARRAY[@]}"
  else
    echo "Plugin file not found: $PLUGIN_FILE"
    exit 1
  fi
else
  PLUGINS_ARRAY=("${PLUGINS_ARGS[@]}")
  PLUGINS_COUNT="${#PLUGINS_ARGS[@]}"
fi

# Extract major.minor (e.g. 0.21) to build the release branch name
BASE_VERSION=$(echo "$RELEASE_VERSION" | sed -E 's/^([0-9]+\.[0-9]+)\..*/\1/')
PUSH_RELEASE_BRANCH="releases/v${BASE_VERSION}.x"

echo "RELEASE_VERSION=$RELEASE_VERSION"
echo "NEXT_VERSION=$NEXT_VERSION"
echo "PUSH_RELEASE_BRANCH=$PUSH_RELEASE_BRANCH"
echo "GIT_BRANCH=$GIT_BRANCH (fallback)"
echo "DRY_RUN=$DRY_RUN"
echo "ONLY_CHANGED=$ONLY_CHANGED"
echo "SINCE_TAG=${SINCE_TAG:-<auto>}"
echo "Found ($PLUGINS_COUNT) plugin repositories:"
for PLUGIN in "${PLUGINS_ARRAY[@]}"; do
  echo " - $PLUGIN"
done

if [[ "$AUTO_YES" == false ]]; then
  askToContinue
fi

###############################################################
# Main
###############################################################
mkdir -p "$WORKING_DIR"

COUNTER=1
for PLUGIN in "${PLUGINS_ARRAY[@]}"; do
  cd "$WORKING_DIR"

  echo "---------------------------------------------------------------------------------------"
  echo "[$COUNTER/$PLUGINS_COUNT] Release Plugin: $PLUGIN"
  echo "---------------------------------------------------------------------------------------"

  # Clone the repo using SSH, otherwise PAT if provided
  if [[ -z "${GITHUB_PAT:-}" ]]; then
    git clone "git@github.com:kestra-io/${PLUGIN}.git"
  else
    echo "Clone git repository using GITHUB PAT"
    git clone "https://${GITHUB_PAT}@github.com/kestra-io/${PLUGIN}.git"
  fi

  cd "$PLUGIN"

  # Determine the default branch dynamically to avoid hardcoding "master"/"main"
  DEFAULT_BRANCH=$(detect_default_branch)
  git checkout "$DEFAULT_BRANCH"

  # Skip if the release tag already exists on remote (check both with and without 'v' prefix)
  TAG_EXISTS=$(
    { git ls-remote --tags origin "refs/tags/v${RELEASE_VERSION}" \
      && git ls-remote --tags origin "refs/tags/${RELEASE_VERSION}"; } | wc -l
  )
  if [[ "$TAG_EXISTS" -ne 0 ]]; then
    echo "Tag ${RELEASE_VERSION} already exists for $PLUGIN. Skipping..."
    COUNTER=$(( COUNTER + 1 ))
    continue
  fi

  # Change detection (if requested)
  if [[ "$ONLY_CHANGED" == true ]]; then
    git fetch --tags --quiet
    git fetch origin "$DEFAULT_BRANCH" --quiet
    BASE_TAG="$SINCE_TAG"
    if [[ -z "$BASE_TAG" ]]; then
      BASE_TAG=$(last_tag_or_empty)
    fi

    if has_changes_since_tag "$BASE_TAG" "$DEFAULT_BRANCH"; then
      echo "Changes detected since ${BASE_TAG:-<no-tag>} on ${DEFAULT_BRANCH}, proceeding."
    else
      echo "No changes since ${BASE_TAG:-<no-tag>} on ${DEFAULT_BRANCH} for $PLUGIN. Skipping..."
      COUNTER=$(( COUNTER + 1 ))
      continue
    fi
  fi

  if [[ "$DRY_RUN" == false ]]; then
    CURRENT_BRANCH=$(git branch --show-current)
    echo "Run gradle release for plugin: $PLUGIN"
    echo "Branch: $CURRENT_BRANCH"

    if [[ "$AUTO_YES" == false ]]; then
      askToContinue
    fi

    # Create and push the release branch (branch that will hold the release versions)
    git checkout -b "$PUSH_RELEASE_BRANCH"
    git push -u origin "$PUSH_RELEASE_BRANCH"

    # Switch back to the working branch to run the gradle release
    git checkout "$CURRENT_BRANCH"

    # Run Gradle release with snapshot tolerance if releaseVersion contains -SNAPSHOT
    if [[ "$RELEASE_VERSION" == *"-SNAPSHOT" ]]; then
      ./gradlew release -Prelease.useAutomaticVersion=true \
        -Prelease.releaseVersion="${RELEASE_VERSION}" \
        -Prelease.newVersion="${NEXT_VERSION}" \
        -Prelease.pushReleaseVersionBranch="${PUSH_RELEASE_BRANCH}" \
        -Prelease.failOnSnapshotDependencies=false
    else
      ./gradlew release -Prelease.useAutomaticVersion=true \
        -Prelease.releaseVersion="${RELEASE_VERSION}" \
        -Prelease.newVersion="${NEXT_VERSION}" \
        -Prelease.pushReleaseVersionBranch="${PUSH_RELEASE_BRANCH}"
    fi

    # Push new commits/tags created by the release plugin
    git push --follow-tags

    # Update the upper bound version of Kestra on the release branch (e.g., [0.21,))
    PLUGIN_KESTRA_VERSION="[${BASE_VERSION},)"
    git checkout "$PUSH_RELEASE_BRANCH" && git pull --ff-only
    sed -i "s/^kestraVersion=.*/kestraVersion=${PLUGIN_KESTRA_VERSION}/" ./gradle.properties
    git add ./gradle.properties

    # Commit only if there are actual changes staged
    if ! git diff --cached --quiet; then
      git commit -m "chore(deps): update kestraVersion to ${PLUGIN_KESTRA_VERSION}."
      git push
    fi

    # Small delay to avoid hammering Maven Central
    sleep 5
  else
    echo "Skip gradle release [DRY_RUN=true]"
  fi

  COUNTER=$(( COUNTER + 1 ))
done

exit 0
