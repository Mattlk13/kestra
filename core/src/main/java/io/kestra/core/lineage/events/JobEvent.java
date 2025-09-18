package io.kestra.core.lineage.events;

import io.kestra.core.models.flows.FlowInterface;

public record JobEvent (FlowInterface flow, LineageEventType eventType) implements LineageEvent {
    @Override
    public String getTenantId() {
        return flow.getTenantId();
    }

    @Override
    public String uid() {
        return flow.uid();
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}
