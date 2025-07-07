<template>
    <el-switch v-model="store.state.flow.playgroundMode" inactive-text="Playground" />
</template>

<script setup lang="ts">
    import {useStore} from "vuex";

    const store = useStore();
</script>
