package io.internship.learn.funcional;

import lombok.Data;

@Data
public class Person {
    private final String name;
    private final int number;
    private final int age;
    private final Gender gender;
    private final String email;


    public enum Gender {

        MALE,
        FEMAL,
        NO_ASSING

    }
}
