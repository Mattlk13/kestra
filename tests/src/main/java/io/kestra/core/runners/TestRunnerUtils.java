package io.kestra.core.runners;

import com.google.common.annotations.VisibleForTesting;
import io.kestra.core.models.Label;
import io.kestra.core.models.executions.Execution;
import io.kestra.core.models.flows.Flow;
import io.kestra.core.models.flows.FlowInterface;
import io.kestra.core.queues.QueueException;
import io.kestra.core.queues.QueueFactoryInterface;
import io.kestra.core.queues.QueueInterface;
import io.kestra.core.repositories.ExecutionRepositoryInterface;
import io.kestra.core.repositories.FlowRepositoryInterface;
import io.kestra.core.services.ExecutionService;
import io.kestra.core.utils.Await;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Predicate;

@Singleton
public class TestRunnerUtils {
    public static final Duration DEFAULT_MAX_WAIT_DURATION = Duration.ofSeconds(15);

    @Inject
    @Named(QueueFactoryInterface.EXECUTION_NAMED)
    protected QueueInterface<Execution> executionQueue;

    @Inject
    private FlowRepositoryInterface flowRepository;

    @Inject
    private ExecutionRepositoryInterface executionRepository;

    @Inject
    private ExecutionService executionService;

    public Execution runOne(String tenantId, String namespace, String flowId) throws TimeoutException, QueueException {
        return this.runOne(tenantId, namespace, flowId, null, null, null, null);
    }

    public Execution runOne(String tenantId, String namespace, String flowId, Integer revision) throws TimeoutException, QueueException {
        return this.runOne(tenantId, namespace, flowId, revision, null, null, null);
    }

    public Execution runOne(String tenantId, String namespace, String flowId, Integer revision, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs) throws TimeoutException, QueueException {
        return this.runOne(tenantId, namespace, flowId, revision, inputs, null, null);
    }

    public Execution runOne(String tenantId, String namespace, String flowId, Duration duration) throws TimeoutException, QueueException {
        return this.runOne(tenantId, namespace, flowId, null, null, duration, null);
    }

    public Execution runOne(String tenantId, String namespace, String flowId, Integer revision, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        return this.runOne(tenantId, namespace, flowId, revision, inputs, duration, null);
    }

    public Execution runOne(String tenantId, String namespace, String flowId, Integer revision, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration, List<Label> labels) throws TimeoutException, QueueException {
        return this.runOne(
            flowRepository
                .findById(tenantId, namespace, flowId, revision != null ? Optional.of(revision) : Optional.empty())
                .orElseThrow(() -> new IllegalArgumentException("Unable to find flow '" + flowId + "'")),
            inputs,
            duration,
            labels);
    }

    public Execution runOne(Flow flow, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs) throws TimeoutException, QueueException {
        return this.runOne(flow, inputs, null, null);
    }

    public Execution runOne(Flow flow, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        return this.runOne(flow, inputs, duration, null);
    }

    public Execution runOne(Flow flow, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration, List<Label> labels) throws TimeoutException, QueueException {
        if (duration == null) {
            duration = Duration.ofSeconds(15);
        }

        Execution execution = Execution.newExecution(flow, inputs, labels, Optional.empty());

        return runOne(execution, flow, duration);
    }

    public Execution runOne(Execution execution, Flow flow, Duration duration) throws TimeoutException, QueueException {
        return this.emitAndAwaitExecution(isTerminatedExecution(execution, flow),  execution, duration);
    }

    public Execution runOneUntilPaused(String tenantId, String namespace, String flowId) throws TimeoutException, QueueException {
        return this.runOneUntilPaused(tenantId, namespace, flowId, null, null, null);
    }

    public Execution runOneUntilPaused(String tenantId, String namespace, String flowId, Integer revision, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        return this.runOneUntilPaused(
            flowRepository
                .findById(tenantId, namespace, flowId, revision != null ? Optional.of(revision) : Optional.empty())
                .orElseThrow(() -> new IllegalArgumentException("Unable to find flow '" + flowId + "'")),
            inputs,
            duration
        );
    }

    public Execution runOneUntilPaused(Flow flow, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        if (duration == null) {
            duration = DEFAULT_MAX_WAIT_DURATION;
        }

        Execution execution = Execution.newExecution(flow, inputs, null, Optional.empty());

        return this.emitAndAwaitExecution(isPausedExecution(execution), execution, duration);
    }

    public Execution runOneUntilRunning(String tenantId, String namespace, String flowId) throws TimeoutException, QueueException {
        return this.runOneUntilRunning(tenantId, namespace, flowId, null, null, null);
    }

    public Execution runOneUntilRunning(String tenantId, String namespace, String flowId, Integer revision, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        return this.runOneUntilRunning(
            flowRepository
                .findById(tenantId, namespace, flowId, revision != null ? Optional.of(revision) : Optional.empty())
                .orElseThrow(() -> new IllegalArgumentException("Unable to find flow '" + flowId + "'")),
            inputs,
            duration
        );
    }

    public Execution runOneUntilRunning(Flow flow, BiFunction<FlowInterface, Execution, Map<String, Object>> inputs, Duration duration) throws TimeoutException, QueueException {
        if (duration == null) {
            duration = DEFAULT_MAX_WAIT_DURATION;
        }

        Execution execution = Execution.newExecution(flow, inputs, null, Optional.empty());

        return this.emitAndAwaitExecution(isRunningExecution(execution), execution, duration);
    }

    @VisibleForTesting
    public Execution emitAndAwaitExecution(Predicate<Execution> predicate, Execution execution, Duration duration) throws TimeoutException {

        try {
            this.executionQueue.emit(execution);
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }

        return awaitExecution(predicate, execution, duration);
    }

    public Execution awaitExecution(Predicate<Execution> predicate, Execution execution,
        Duration duration) {
        AtomicReference<Execution> receive = new AtomicReference<>();
        try {

            if (duration == null){
                duration = Duration.ofSeconds(20);
            }
            Await.until(() -> {
                testExecution(predicate, receive, execution);
                return receive.get() != null;
            }, Duration.ofMillis(10), duration);

        } catch (TimeoutException e) {
            Optional<Execution> byId = executionRepository.findById(execution.getTenantId(),
                execution.getId());
            if (byId.isPresent()) {
                Execution exec = byId.get();
                throw new RuntimeException("Execution %s is currently at the stat %s which is not the awaited one".formatted(exec.getId(), exec.getState().getCurrent()));
            } else {
                throw new RuntimeException("Execution %s doesn't exist in the database".formatted(execution.getId()));
            }
        }

        return receive.get();
    }

    private void testExecution(Predicate<Execution> predicate, AtomicReference<Execution> receive, Execution execution){
        Optional<Execution> exec = executionRepository.findById(execution.getTenantId(), execution.getId());
        if (exec.isPresent() && predicate.test(exec.get())) {
            receive.set(exec.get());
        }
    }

//    @VisibleForTesting
//    public Execution awaitChildExecution(Flow flow, Execution parentExecution, Runnable executionEmitter, Duration duration) throws TimeoutException {
//        return this.awaitExecution(isTerminatedChildExecution(parentExecution, flow), executionEmitter, duration);
//    }

    private Predicate<Execution> isTerminatedExecution(Execution execution, Flow flow) {
        return e -> e.getId().equals(execution.getId()) && executionService.isTerminated(flow, e);
    }

    private Predicate<Execution> isPausedExecution(Execution execution) {
        return e -> e.getId().equals(execution.getId()) && e.getState().isPaused() && e.getTaskRunList() != null && e.getTaskRunList().stream().anyMatch(t -> t.getState().isPaused());
    }

    private Predicate<Execution> isRunningExecution(Execution execution) {
        return e -> e.getId().equals(execution.getId()) && e.getState().isRunning() && e.getTaskRunList() != null && e.getTaskRunList().stream().anyMatch(t -> t.getState().isRunning());
    }

    private Predicate<Execution> isTerminatedChildExecution(Execution parentExecution, Flow flow) {
        return e -> e.getParentId() != null && e.getParentId().equals(parentExecution.getId()) && executionService.isTerminated(flow, e);
    }
}
