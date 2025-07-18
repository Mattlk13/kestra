import {computed, ref, watch} from "vue";
import {defineStore} from "pinia";
import {useStore} from "vuex";
import {Execution, useExecutionsStore} from "./executions";
import Inputs from "../utils/inputs";
import {useUrlSearchParams} from "@vueuse/core"

export const usePlaygroundStore = defineStore("playground", () => {
    const params = useUrlSearchParams("history", {
        removeFalsyValues: true
    })

    const enabled = ref<boolean>(params.playground === "on")
    watch(enabled, (newValue) => {
        if (newValue) {
            params.playground = "on"
        } else {
            params.playground = ""
        }
    })

    const executions = ref<Execution[]>([])
    function addExecution(execution: Execution) {
        executions.value.push(execution);
    }

    function clearExecutions() {
        executions.value = [];
    }

    const store = useStore();
    const executionsStore = useExecutionsStore();

    async function runUntilTask(taskId?: string){
        await store.dispatch("flow/saveAll")

        const defaultInputValues: Record<string, any> = {}
        for (const input of (store.state.flow.flow?.inputs || [])) {
            const {type, defaults} = input;
            defaultInputValues[input.id] = Inputs.normalize(type, defaults);
        }
        const {data: execution} = await executionsStore.triggerExecution({
            id: store.state.flow.flow?.id,
            namespace: store.state.flow.flow?.namespace,
            formData: defaultInputValues,
            kind: "PLAYGROUND",
            breakpoints: taskId ? [taskId] : undefined,
        })
        executionsStore.execution = execution;

        addExecution(execution);
    }

    return {
        enabled,
        executions,
        latestExecution: computed(() => executions.value[executions.value.length - 1]),
        addExecution,
        clearExecutions,
        runUntilTask
    }
})