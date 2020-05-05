package io.internship.learn.pattern.chain.responsability;

public class Numbers {

    private int valueOne;
    private int valueTwo;
    private String operation;

    public Numbers(int valueOne, int valueTwo, String operation) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.operation = operation;
    }

    public int getValueOne() {
        return valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public String getOperation() {
        return operation;
    }
}
