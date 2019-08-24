package pl.sda.spring.operation;

public interface Operation {

    double calculate(double arg1, double arg2);
    OperationType getSupportedOperationType();
}
