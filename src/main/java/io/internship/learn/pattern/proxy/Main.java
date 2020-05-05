package io.internship.learn.pattern.proxy;

public class Main {

    public static void main(String[] args) {
        ATMData atmData = new ATMachine();
        ProxyATM proxyATM = new ProxyATM();
    }
}
