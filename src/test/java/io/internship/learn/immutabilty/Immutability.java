package io.internship.learn.immutabilty;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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



}
