package io.internship.learn.foreatch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ForEach {


    /**
     * ForEach Accept Consumer Object
     * in my example i have used Method reference to print out the items
     */

    @Test
    public void testForEach() {
        List<String> list = Arrays.asList("One", "Two", "Three");
        list.forEach(System.out::println);
    }
}
