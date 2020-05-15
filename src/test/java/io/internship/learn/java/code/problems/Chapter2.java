package io.internship.learn.java.code.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class Chapter2 {

    List<String> strings;


    @BeforeEach
    public void init() {
        strings = Arrays.asList("One", "Two", null, "Three");
    }

    @Test
    public void problem1() {
        // functional Style
        Set<String> filtered = strings.stream().filter(Objects::nonNull).collect(Collectors.toSet());
        filtered.forEach(System.out::println);
    }

    @Test
    public void problem2() {
        List<String> collect = strings.stream().peek(s -> {
            if (s == null) throw new NullPointerException("Your List has a Null Values");
        }).collect(Collectors.toList());

        // with Optional
        strings.stream()
                .peek(s -> Optional.ofNullable(s)
                        .map(String::toString)
                        .orElseThrow(() -> new NullPointerException("Optional Ex")))
                .collect(Collectors.toList());
    }

    @Test
    public void problem3() {
        // we can also use the Optional
        strings.stream().peek(s -> Optional.ofNullable(s).map(String::toString).orElseThrow(() -> new NullPointerException("Null")));
    }


    @Test
    public void stringImmutability() throws NoSuchFieldException, IllegalAccessException {
        String user = "guest";
        System.out.println("User is of type: " + user);

        Class<String> type = String.class;
        Field field = type.getDeclaredField("value");
        field.setAccessible(true);

        char[] chars = (char[]) field.get(user);

        chars[0] = 'a';
        chars[1] = 'd';
        chars[2] = 'm';
        chars[3] = 'i';
        chars[4] = 'n';

        System.out.println("User is of type: " + user);


    }



}

