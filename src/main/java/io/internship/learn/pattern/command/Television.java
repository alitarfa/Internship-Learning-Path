package io.internship.learn.pattern.command;

public class Television implements Device {
    @Override
    public void off() {
        System.out.println("Turn Of Device");
    }

    @Override
    public void on() {
        System.out.println("Turn On Device");
    }
}
