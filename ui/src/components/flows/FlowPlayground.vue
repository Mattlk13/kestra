<template>
    <div class="playground">
        <h2>
            <ChartTimelineIcon class="tab-icon" />
            {{ t("playground.title") }}
        </h2>
        <div class="pillTabs">
            <button
                v-for="tab in tabs"
                :key="tab.name"
                type="button"
                :class="[{activeTab: tab.name === activeTab.name}]"
                @click="activeTab = tab"
            >
                {{ tab.title }}
            </button>
        </div>
        <div v-if="activeTab?.component && playgroundStore.latestExecution" class="tab-content">
            <component
                :is="activeTab.component"
                :key="activeTab.name"
            />
        </div>
        <div v-else class="empty-state">
            <img :src="EmptyVisualPlayground">
            <p>
                {{ t("playground.empty") }}
            </p>
        </div>
    </div>
</template>

<script setup lang="ts">
    import {computed, ref, markRaw, watch, onUnmounted} from "vue";
    import {useI18n} from "vue-i18n";
    import ChartTimelineIcon from "vue-material-design-icons/ChartTimeline.vue";
    import Gantt from "../executions/Gantt.vue";
    import Logs from "../executions/Logs.vue";
    import ExecutionOutput from "../executions/outputs/Wrapper.vue";
    import ExecutionMetric from "../executions/ExecutionMetric.vue";
    import {usePlaygroundStore} from "../../stores/playground";
    import EmptyVisualPlayground from "../../assets/empty_visuals/playground.svg"
    import {useExecutionsStore} from "../../stores/executions";

    const {t} = useI18n();

    const tabs = computed(() => ([{
                                      name: "logs",
                                      title: t("logs"),
                                      component: markRaw(Logs),
                                  },{
                                      name: "gantt",
                                      title: t("gantt"),
                                      component: markRaw(Gantt),
                                  },
                                  {
                                      name: "outputs",
                                      title: t("outputs"),
                                      component: markRaw(ExecutionOutput),
                                  },
                                  {
                                      name: "metrics",
                                      title: t("metrics"),
                                      component: markRaw(ExecutionMetric),
                                  }
    ]));

    const playgroundStore = usePlaygroundStore();
    const executionsStore = useExecutionsStore();

    watch(() => playgroundStore.latestExecution, (newValue) => {
        if (newValue) {
            activeTab.value = tabs.value[0]; // Reset to first tab when a new execution is loaded
            executionsStore.followExecution(newValue, t);
        }
    });

    const activeTab = ref(tabs.value[0]);

    onUnmounted(() => {
        executionsStore.closeSSE();
    });
</script>

<style lang="scss" scoped>
    @import "@kestra-io/ui-libs/src/scss/_color-palette";

    .tab-icon{
        color: var(--ks-content-inactive);
        margin-right: 4px;
    }

    .playground {
        height: 100%;
        position: relative;
        color: var(--ks-color-text-secondary);
        background-color: var(--ks-background-panel);
        overflow-y: auto;
        h2{
            border-bottom: 1px solid var(--ks-border-primary);
            font-size: .8rem;
            font-weight: normal;
            line-height: 1.2rem;
            padding: 0 8px 4px;
            position: sticky;
            background-color: var(--ks-background-panel);
            top: 0;
            z-index: 100;
        }
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

    .tab-content{
        overflow: auto;
        padding: 1rem;
        background-color: var(--ks-background-panel);
    }

    .empty-state{
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        p {
            text-align: center;
            color: var(--ks-content-secondary);
            img {
                width: 200px;
                margin-bottom: 1rem;
            }
        }
    }
</style>