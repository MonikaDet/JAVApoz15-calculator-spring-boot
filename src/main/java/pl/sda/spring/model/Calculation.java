package pl.sda.spring.model;

import pl.sda.spring.operation.OperationType;

public class Calculation {

    private double arg1;
    private double arg2;
    private OperationType operationType;

    public Calculation(double arg1, double arg2, OperationType operationType) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operationType = operationType;
    }

    public Calculation() {
    }

    public double getArg1() {
        return arg1;
    }

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }

    public double getArg2() {
        return arg2;
    }

    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
