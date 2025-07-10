<template>
    <div class="playground">
        <div class="pillTabs">
            <button
                v-for="tab in tabs"
                :key="tab.name"
                type="button"
                :class="[{activeTab: tab.name === activeTab}, tab.name]"
                @click="activeTab = tab.name"
            >
                {{ tab.label }}
            </button>
        </div>
        <div class="content">
            {{ activeTab }}
        </div>
    </div>
</template>

<script setup lang="ts">
    import {ref} from "vue";

    const tabs = [{
                      name: "logs",
                      label: "Logs",
                  },{
                      name: "gantt",
                      label: "Gantt",
                  },
                  {
                      name: "outputs",
                      label: "Outputs",
                  },
                  {
                      name: "metrics",
                      label: "Metrics",
                  }
    ]

    const activeTab = ref("logs");
</script>

<style lang="scss" scoped>
    @import "@kestra-io/ui-libs/src/scss/_color-palette";

    .playground {
        height: 100%;
        color: var(--ks-color-text-secondary);
        background-color: var(--ks-background-panel);
    }

    .pillTabs {
        display: inline-flex;
        padding: 4px;
        background-color:var(--ks-background-card) ;
        margin: 1rem;
        border-radius: 6px;
        gap: 2px;
        button{
            padding: 0.2rem .5rem;
            font-size: 14px;
            color: var(--ks-content-tertiary);
            background-color: transparent;
            border: none;
            border-radius: 4px;
            &.activeTab {
                color: var(--ks-content-primary);
                background-color: $base-blue-500;
            }
        }
    }
</style>