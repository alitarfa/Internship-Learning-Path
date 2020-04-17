package io.internship.learn.Immutablity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;

@ToString
@AllArgsConstructor
public class Person {

    private final String name;
    private final String lastName;
    private final HashMap<String, String> map;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public HashMap<String, String> getMap() {
        return (HashMap<String, String>) map.clone();
    }
}

