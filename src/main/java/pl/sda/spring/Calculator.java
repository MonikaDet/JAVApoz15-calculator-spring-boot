package pl.sda.spring;

import org.springframework.stereotype.Component;
import pl.sda.spring.operation.Operation;
import pl.sda.spring.operation.OperationType;

import java.util.List;

@Component
public class Calculator {

    private final List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public double calculate(OperationType operationType, double arg1, double arg2) {
        Operation operation = getOperationForOperationType(operationType);
        return operation.calculate(arg1, arg2);
    }

    private Operation getOperationForOperationType(OperationType operationType) {
        return operations.stream()
                .filter(operation -> operation.getSupportedOperationType().equals(operationType))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not supported operation type"));
    }
}
