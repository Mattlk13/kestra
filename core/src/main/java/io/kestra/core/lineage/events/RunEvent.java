package io.kestra.core.lineage.events;

import io.kestra.core.models.executions.Execution;

public record RunEvent(Execution execution, LineageEventType eventType) implements LineageEvent {
    @Override
    public String getTenantId() {
        return execution.getTenantId();
    }

    @Override
    public String uid() {
        return execution.getId();
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}
