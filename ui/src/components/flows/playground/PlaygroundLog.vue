<template>
    <div class="playground-log">
        <button
            v-for="execution in executions"
            :key="execution.id"
            @click="$emit('click', execution.id)"
        >
            <p>{{ date(execution.state.startDate) }}</p>
            <p class="playground-duration">
                {{ humanizeDuration(execution.state.duration) }}
            </p>
            <div class="playground-status">
                <Status :status="execution.state.current" size="small" />
            </div>
        </button>
    </div>
</template>

<script setup lang="ts">
    import Status from "../../Status.vue";
    import {date, humanizeDuration} from "../../../utils/filters";

    defineProps<{
        executions: {
            id: string;
            state: {
                current: string;
                duration: string;
                startDate: string;
            };
        }[];
    }>();

    defineEmits<{
        (e: "click", executionId: string): void;
    }>();
</script>

<style lang="scss" scoped>
    .playground-log{
        display: flex;
        flex-direction: column;
        gap: 1rem;
        padding: 0.5rem 1rem;
    }

    .playground-log > button{
        display: grid;
        border: none;
        background-color: var(--ks-background-panel);
        text-align: left;
        padding: 0;
        font-size: 0.8rem;
        grid-template-columns: 1fr 80px;
        grid-template-rows: 1fr 1fr;
        grid-template-areas:
            ". status"
            "duration status";
        p{
            margin: 0;
            padding: 0;
        }
    }
    .playground-status {
        grid-area: status;
        display: flex;
        align-items: center;
        justify-content: end;
        text-align: right;;
    }
    .playground-duration {
        grid-area: duration;
        color: var(--ks-content-secondary);
    }
</style>