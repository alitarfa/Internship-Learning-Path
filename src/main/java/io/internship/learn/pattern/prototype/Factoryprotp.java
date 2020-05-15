package io.internship.learn.pattern.prototype;

public class Factoryprotp {

    public Animal getClone(Animal animal) {
        return animal.makeCopy();
    }
}
