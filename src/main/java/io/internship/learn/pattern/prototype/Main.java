package io.internship.learn.pattern.prototype;

public class Main {


    public static void main(String[] args) {
        Factoryprotp factoryprotp = new Factoryprotp();
        Dog dog = new Dog("One", "One");
        Dog clone = (Dog) factoryprotp.getClone(dog);

        System.out.println(System.identityHashCode(System.identityHashCode(dog)));
        System.out.println(System.identityHashCode(System.identityHashCode(clone)));
    }
}
