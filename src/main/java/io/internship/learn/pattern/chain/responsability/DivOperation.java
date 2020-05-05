package io.internship.learn.pattern.chain.responsability;

public class DivOperation implements Chain {

    Chain chain;


    @Override
    public void next(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void calculate(Numbers numbers) {

        if (numbers.getOperation().equalsIgnoreCase("DIV")) {
            System.out.println("Division Operation");
        } else {
            chain.calculate(numbers);
        }

    }
}
