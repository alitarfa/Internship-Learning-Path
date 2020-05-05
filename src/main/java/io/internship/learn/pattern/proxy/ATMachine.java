package io.internship.learn.pattern.proxy;

public class ATMachine implements ATMData {


    public int getBalance() {
        return 20;
    }


    @Override
    public String getData() {
        return "Test Data";
    }
}
