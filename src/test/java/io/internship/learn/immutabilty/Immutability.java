package io.internship.learn.immutabilty;

import io.internship.learn.Immutablity.ImmutablePerson;
import io.internship.learn.Immutablity.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Immutability {


    @Test
    public void testSting() {

        final String name = "Test";
        name.replace("Test", "Test 2");

        assertEquals("Test", name);
        assertEquals("Test 2", name);
    }


    @Test
    public void testList() {
        final List<String> strings = new ArrayList<>();
        assertEquals(0, strings.size());
        strings.add("One Element");
        assertEquals(1, strings.size());


        /**
         * as we see, we have assigned final key world to the list we assume that
         * The list will never be changed But is not the case because, the Final in this case
         * will make just the reference unchangable but the objects we can change them ,
         * like we did we have added more elements to the list
         */
    }


    @Test
    public void testUnModifiableList() {

        List<String> list = Collections.unmodifiableList(Arrays.asList("One", "two"));

        list.add("three");

    }


    @Test
    public void testPersonClass() {

        // So this is another way to create an immutable class using the Builder Pattern

        HashMap<String, String> map = new HashMap<>();
        map.put("Test", "Test");

        ImmutablePerson person = new ImmutablePerson.ImmutablePersonBuilder()
                .setLastName("Test")
                .setName("Test")
                .setAddress(map)
                .build();

        System.out.println(person);

        // we try to verify if this Class is immutable or no
        HashMap<String, String> map2 = person.getAddress();
        map2.put("Address", "Aubervillier");

        assertEquals(person.getAddress().size(), 1);

    }


    /**
     * Person is immutable class
     */
    @Test
    public void testPerson() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Test", "Test");
        Person person = new Person("Test", "Test", map);
        person.getMap().put("Test_2", "Test_2");
        assertEquals(person.getMap().size(), 1);

    }


}
