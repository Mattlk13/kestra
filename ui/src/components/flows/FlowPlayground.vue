<template>
    <div class="playground">
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
        <div class="tab-content">
            <component
                v-if="activeTab?.component && executionsStore.execution"
                :is="activeTab.component"
                :key="activeTab.name"
            />
        </div>
    </div>
</template>

<script setup lang="ts">
    import {computed, ref, markRaw, onMounted, watch} from "vue";
    import {useI18n} from "vue-i18n";
    import Gantt from "../executions/Gantt.vue";
    import Logs from "../executions/Logs.vue";
    import ExecutionOutput from "../executions/outputs/Wrapper.vue";
    import ExecutionMetric from "../executions/ExecutionMetric.vue";
    import {useExecutionsStore} from "../../stores/executions";
    import {useStore} from "vuex";

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

    const activeExecutionId = ref();

    const executionsStore = useExecutionsStore();
    watch(activeExecutionId, (newId) => {
        if (newId) {
            executionsStore.loadExecution({id: newId});
        }
    });


    const store = useStore();
    onMounted(async () => {
        const {results: lastExecutions} = await executionsStore.getFlowExecutions({
            namespace: store.state.flow.flow.namespace,
            flowId: store.state.flow.flow.id,
        });
        if (lastExecutions.length > 0) {
            activeExecutionId.value = lastExecutions[0].id
        }
    })

    const activeTab = ref(tabs.value[0]);
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

    .tab-content{
        overflow: auto;
        padding: 1rem;
        background-color: var(--ks-background-panel);
    }
</style>