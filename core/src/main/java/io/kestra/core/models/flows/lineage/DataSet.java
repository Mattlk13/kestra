package io.kestra.core.models.flows.lineage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@NoArgsConstructor
public class DataSet {
    private String name;
    private String namespace;
}
