package io.internship.learn.pattern.proxy;

public class ProxyATM implements ATMData{




    @Override
    public String getData() {
        ATMachine atMachine = new ATMachine();
        return atMachine.getData();
    }

}
