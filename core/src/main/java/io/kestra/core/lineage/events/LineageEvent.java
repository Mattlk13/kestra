package io.kestra.core.lineage.events;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.kestra.core.models.HasUID;
import io.kestra.core.models.TenantInterface;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "type", visible = true, include = JsonTypeInfo.As.EXISTING_PROPERTY)
public sealed interface LineageEvent extends TenantInterface, HasUID permits DataSetEvent, JobEvent, RunEvent {
    String getType();
}
