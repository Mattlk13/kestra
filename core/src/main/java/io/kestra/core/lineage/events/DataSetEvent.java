package io.kestra.core.lineage.events;

import io.kestra.core.lineage.DataSet;

public record DataSetEvent (DataSet dataSet, LineageEventType eventType) implements LineageEvent {
    @Override
    public String getTenantId() {
        return dataSet.getTenantId();
    }

    @Override
    public String uid() {
        return dataSet.uid();
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}
