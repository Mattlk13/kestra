import {defineConfig} from "vite";

export default defineConfig({
    test: {
        projects: [".storybook/vitest.config.js", "vitest.config.unit.js"]
    },
    define: {
        "window.KESTRA_BASE_PATH": "/ui/",
    },
})
