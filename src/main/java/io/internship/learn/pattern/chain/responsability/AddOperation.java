package io.internship.learn.pattern.chain.responsability;

public class AddOperation implements Chain {

    Chain chain;


    @Override
    public void next(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (numbers.getOperation().equalsIgnoreCase("ADD")) {
            System.out.println("Adding Operation");
        } else {
            chain.calculate(numbers);
        }
    }
}
