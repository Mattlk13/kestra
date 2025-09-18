package io.kestra.core.lineage;

import io.kestra.core.models.DeletedInterface;
import io.kestra.core.models.HasUID;
import io.kestra.core.models.TenantInterface;
import io.kestra.core.utils.IdUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class DataSet implements HasUID, TenantInterface, DeletedInterface {
    private String tenantId;
    private String namespace;
    private String name;
    private boolean deleted;

    @Override
    public String uid() {
        return IdUtils.fromParts(tenantId, namespace, name);
    }
}
