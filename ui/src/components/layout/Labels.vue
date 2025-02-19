<template>
    <span v-if="props.labels.length">
        <el-check-tag
            v-for="(label, index) in props.labels"
            :key="index"
            :disabled="readOnly"
            :checked="isChecked(label)"
            @change="updateLabel(label)"
            class="me-1 el-tag label"
        >
            {{ label.key }}: {{ label.value }}
        </el-check-tag>
    </span>
</template>

<script setup lang="ts">
    import {watch} from "vue";

    import {useRouter, useRoute} from "vue-router";
    const router = useRouter();
    const route = useRoute();

    interface Label {
        key: string;
        value: string;
    }

    const props = withDefaults(
        defineProps<{ labels: Label[]; readOnly?: boolean }>(),
        {labels: () => [], readOnly: false},
    );

    let query: any[] = [];
    watch(
        () => route.query,
        (q: any) => (query = [].concat(q.labels ?? null)),
        {immediate: true},
    );

    const isChecked = (label: Label) =>
        query.some((l) => l === `${label.key}:${label.value}`);

    const updateLabel = (label: Label) => {
        if (isChecked(label)) {
            const helper = {...route.query};
            delete helper.labels;
            router.replace({query: helper});
        } else {
            router.replace({
                query: {...route.query, labels: `${label.key}:${label.value}`},
            });
        }
    };
</script>

<style scoped lang="scss">
.label {
    font-weight: normal;

    &:hover {
        background-color: var(--ks-tag-background-hover);
    }
}

.el-check-tag.el-check-tag--primary.is-checked {
    background-color: var(--el-color-primary);
    color: var(--ks-content-primary);
}
</style>
