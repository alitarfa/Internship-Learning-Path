package io.internship.learn.enumTest;

import java.util.function.DoubleBinaryOperator;

public enum Operation {

    ADD("+", (one, two) -> one + two),
    MUL("*", (left, right) -> left * right),
    DIV("/", (left, right) -> left / right),
    MIN("-", (left, right) -> left - right);


    private String symbole;
    private DoubleBinaryOperator operator;

    Operation(String symbole, DoubleBinaryOperator operator) {
        this.symbole = symbole;
        this.operator = operator;
    }


    public int apply(int valueOne, int valueTwo) {
        return (int) operator.applyAsDouble(valueOne, valueTwo);
    }

}
