package io.internship.learn.pattern.chain.responsability;

public class Main {


    public static void main(String[] args) {

        Chain add = new AddOperation();

        Chain div = new DivOperation();

        Numbers numbers = new Numbers(1, 2, "ADD");

        add.next(div);

        add.calculate(numbers);
    }
}
