package io.kestra.core.repositories;

import io.kestra.core.events.CrudEvent;
import io.kestra.core.events.CrudEventType;
import io.kestra.core.models.property.Property;
import io.kestra.core.models.templates.Template;
import io.kestra.plugin.core.debug.Return;
import io.kestra.core.utils.IdUtils;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.data.model.Pageable;
import io.kestra.core.junit.annotations.KestraTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static io.kestra.core.tenant.TenantService.MAIN_TENANT;
import static org.assertj.core.api.Assertions.assertThat;

@KestraTest
public abstract class AbstractTemplateRepositoryTest {
    @Inject
    protected TemplateRepositoryInterface templateRepository;

    @BeforeEach
    protected void init() throws IOException, URISyntaxException {
        TemplateListener.reset();
    }

    protected static Template.TemplateBuilder<?, ?> builder() {
        return builder(null);
    }

    protected static Template.TemplateBuilder<?, ?> builder(String namespace) {
        return Template.builder()
            .id(IdUtils.create())
            .namespace(namespace == null ? "kestra.test" : namespace)
            .tasks(Collections.singletonList(Return.builder().id("test").type(Return.class.getName()).format(Property.ofValue("test")).build()));
    }

    @Test
    void findById() {
        Template template = buildTemplate();
        templateRepository.create(template);

        Optional<Template> full = templateRepository.findById(MAIN_TENANT, template.getNamespace(), template.getId());
        assertThat(full.isPresent()).isTrue();
        assertThat(full.get().getId()).isEqualTo(template.getId());

        full = templateRepository.findById(MAIN_TENANT, template.getNamespace(), template.getId());
        assertThat(full.isPresent()).isTrue();
        assertThat(full.get().getId()).isEqualTo(template.getId());
    }

    @Test
    void findByNamespace() {
        Template template1 = buildTemplate();
        Template template2 = Template.builder()
            .id(IdUtils.create())
            .tenantId(MAIN_TENANT)
            .namespace("kestra.test.template").build();

        templateRepository.create(template1);
        templateRepository.create(template2);

        List<Template> templates = templateRepository.findByNamespace(MAIN_TENANT, template1.getNamespace());
        assertThat(templates.size()).isGreaterThanOrEqualTo(1);
        templates = templateRepository.findByNamespace(MAIN_TENANT, template2.getNamespace());
        assertThat(templates.size()).isEqualTo(1);
    }

    @Test
    void save() {
        Template template = buildTemplate();
        Template save = templateRepository.create(template);

        assertThat(save.getId()).isEqualTo(template.getId());
    }

    @Test
    void findAll() {
        long saveCount = templateRepository.findAll(MAIN_TENANT).size();
        Template template = buildTemplate();
        templateRepository.create(template);
        long size = templateRepository.findAll(MAIN_TENANT).size();
        assertThat(size).isGreaterThan(saveCount);
        templateRepository.delete(template);
        assertThat((long) templateRepository.findAll(MAIN_TENANT).size()).isEqualTo(saveCount);
    }

    @Test
    void findAllForAllTenants() {
        long saveCount = templateRepository.findAllForAllTenants().size();
        Template template = buildTemplate();
        templateRepository.create(template);
        long size = templateRepository.findAllForAllTenants().size();
        assertThat(size).isGreaterThan(saveCount);
        templateRepository.delete(template);
        assertThat((long) templateRepository.findAllForAllTenants().size()).isEqualTo(saveCount);
    }

    @Test
    void find() {
        Template template1 = buildTemplate();
        templateRepository.create(template1);
        Template template2 = buildTemplate();
        templateRepository.create(template2);
        Template template3 = buildTemplate();
        templateRepository.create(template3);

        // with pageable
        List<Template> save = templateRepository.find(Pageable.from(1, 10),null, MAIN_TENANT, "kestra.test");
        assertThat((long) save.size()).isGreaterThanOrEqualTo(3L);

        // without pageable
        save = templateRepository.find(null, MAIN_TENANT, "kestra.test");
        assertThat((long) save.size()).isGreaterThanOrEqualTo(3L);

        templateRepository.delete(template1);
        templateRepository.delete(template2);
        templateRepository.delete(template3);
    }

    @Test
    void delete() {
        Template template = buildTemplate();

        Template save = templateRepository.create(template);
        templateRepository.delete(save);

        assertThat(templateRepository.findById(MAIN_TENANT, template.getNamespace(), template.getId()).isPresent()).isFalse();

        assertThat(TemplateListener.getEmits().size()).isEqualTo(2);
        assertThat(TemplateListener.getEmits().stream().filter(r -> r.getType() == CrudEventType.CREATE).count()).isEqualTo(1L);
        assertThat(TemplateListener.getEmits().stream().filter(r -> r.getType() == CrudEventType.DELETE).count()).isEqualTo(1L);
    }

    @Singleton
    public static class TemplateListener implements ApplicationEventListener<CrudEvent<Template>> {
        private static List<CrudEvent<Template>> emits = new ArrayList<>();

        @Override
        public void onApplicationEvent(CrudEvent<Template> event) {
            emits.add(event);
        }

        public static List<CrudEvent<Template>> getEmits() {
            return emits;
        }

        public static void reset() {
            emits = new ArrayList<>();
        }
    }

    private static Template buildTemplate() {
        return builder().tenantId(MAIN_TENANT).build();
    }
}
