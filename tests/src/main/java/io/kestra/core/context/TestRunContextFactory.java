package io.kestra.core.context;

import static io.kestra.core.tenant.TenantService.MAIN_TENANT;

import io.kestra.core.runners.RunContext;
import io.kestra.core.runners.RunContextFactory;
import jakarta.inject.Singleton;
import java.util.Map;

@Singleton
public class TestRunContextFactory extends RunContextFactory {

    public RunContext of() {
        return of("id", "namespace");
    }

    public RunContext of(String namespace) {
        return of("id", namespace);
    }

    public RunContext of(String flowId, String namespace) {
        return of(Map.of("flow", Map.of("id", flowId, "namespace", namespace, "tenantId", MAIN_TENANT)));
    }

    public RunContext withInputs(String namespace, Map<String, String > inputs) {
        return of(Map.of(
            "flow", Map.of("id", "id", "namespace", namespace, "tenantId", MAIN_TENANT),
            "inputs", inputs
        ));
    }

}
