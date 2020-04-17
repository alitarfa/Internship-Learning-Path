package io.internship.learn.Immutablity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;;

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


    /**
     * because the Hash map is a mutable class we need to provide a clone not a getter, Because with getter
     * The Client can access to Map content and add what he wants
     * We do the Same thing when we have other objects as attributes in the class we should always provide a copy not the
     * a reference to the same Object ^^
     *
     * @return
     */
    public HashMap<String, String> getMap() {
        return (HashMap<String, String>) map.clone();
    }
}

