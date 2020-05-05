package io.internship.learn.pattern.chain.responsability;

public interface Chain {


    public void next(Chain chain);

    public void calculate(Numbers numbers);
}
