package io.kestra.core.models.flows.lineage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Getter
@NoArgsConstructor
public class Lineage {
    private String namespace;
    private List<DataSet> inputs;
    private List<DataSet> outputs;
}
