package io.internship.learn.pattern.decoration;

public class Main {

    public static void main(String[] args) {
        ChickenMenu chickenPizza = new ChickenMenu(new RealMenu());
        System.out.println(chickenPizza.getDescription());
        System.out.println(chickenPizza.getCost());
    }
}
