package io.internship.learn.pattern.strategy;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Terminal terminal = new Terminal(new Command.Sudo());
        Scanner scanner = new Scanner(System.in);
        String arg = scanner.nextLine();
        String sudo = terminal.run(arg);
        System.out.println(sudo);

        // test the reflect
        Class reflect = Terminal.class;
        Method[] methods = reflect.getMethods();
        int length = methods.length;
        System.out.println(length);
    }
}
