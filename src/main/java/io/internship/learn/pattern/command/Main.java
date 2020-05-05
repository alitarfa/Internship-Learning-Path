package io.internship.learn.pattern.command;

public class Main {


    public static void main(String[] args) {
        Device television = new Television();
        Command on = new TurnOn(television);
        Button button = new Button(on);
        button.press();
    }

}
