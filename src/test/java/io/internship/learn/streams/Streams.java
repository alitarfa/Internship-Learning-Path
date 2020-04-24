package io.internship.learn.streams;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.env.YamlPropertySourceLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Streams {

    List<Persone> persones;

    @BeforeEach
    public void init() {
        persones = Arrays.asList(
                new Persone(1, "B", "A1", 23),
                new Persone(2, "A", "A2", 24),
                new Persone(3, "A", "A3", 25));
    }

    @Test
    public void testCreationStreams() {
        // using of() static factory method
        Stream<String> streams = Stream.of("One", "two", "three");

        // using builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.accept("One");
        streamBuilder.accept("Two");
        streamBuilder.accept("Three");
        Stream<String> s = streamBuilder.build();

        // using a list
        List<String> list = Arrays.asList("One", "Two", "Three");
        Stream<String> s1 = list.stream();
    }


    @Test
    public void testForEach() {
        persones.stream().forEach(System.out::println);
    }


    @Test
    public void testMap() {
        List<Persone> list = persones.stream().map(persone -> {
            persone.setAddress("Delete Address");
            return persone;
        }).collect(Collectors.toList());
        list.forEach(System.out::println);
    }


    @Test
    public void testFilter() {
        persones.stream().filter(persone -> persone.getAge() > 24).forEach(System.out::println);
    }

    @Test
    public void testFindFirst() {
        Persone s = persones.stream()
                .filter(persone -> persone.getAge() > 24)
                .findFirst()
                .orElse(new Persone(0, "default", "default", 0));

        assertEquals(s, persones.get(2));
    }

    @Test
    public void testToArrays() {
        Persone[] pers = persones.stream().toArray(Persone[]::new);
        assertEquals(pers.length, 3);
    }

    @Test
    public void testFlatMap() throws IOException {

        // { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

        // { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}

        // Creating a List of Strings
        List<List<String>> list = Arrays.asList(
                Arrays.asList("One"),
                Arrays.asList("Two"),
                Arrays.asList("One"),
                Arrays.asList("One"),
                Arrays.asList("Two"),
                Arrays.asList("Three")

        );

        list.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    @Test
    public void testPeek() {
        // comme l'operateur ForEach mais la seule defference si que Peek intermidiate Operateur et se rendre un stream

        persones.stream()
                .peek(Persone::incrementAge)
                .peek(System.out::println)
                .collect(Collectors.toList());


    }


    // Test the Comparison Operation
    @Test
    public void testSorted() {
        persones.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList()).forEach(System.out::println);

    }

    @Test
    public void testMinMax() {

        Persone persone = persones.stream()
                .min(Comparator.comparing(Persone::getAge)).get();
        assertEquals(persone, persones.get(0));

        Persone persone1 = persones.stream()
                .max(Comparator.comparing(Persone::getAge)).get();
        assertEquals(persone1, persones.get(2));

    }


    @Test
    public void testMatchAll() {
        boolean result = persones.stream().allMatch(persone -> persone.getAge() % 2 == 0);
        assertFalse(result);
    }


    @Test
    public void testAnyMatch() {
        boolean result = persones.stream().anyMatch(persone -> persone.getAge() % 2 == 0);
        assertTrue(result);
    }

    @Test
    public void testIntStream() {
        // creation of intStream
        int result = persones.stream().mapToInt(Persone::getAge)
                .sum();
        assertEquals(result, 72);

        IntStream.of(1, 2, 3);
        IntStream.range(1, 20);
    }


    @Test
    public void testReduce() {
        Integer result = persones.stream()
                .map(Persone::getAge)
                .reduce(Integer::sum)
                .get();
        assertEquals(result, 72);

    }

    @Test
    public void testToSet() {
        Set<String> reuslt = persones.stream()
                .map(Persone::getName)
                .collect(Collectors.toSet());
        assertEquals(reuslt.size(), 2);
    }

    @Test
    public void testCollectors() {
        Collection<Integer> result = persones.stream()
                .map(Persone::getAge)
                .collect(Collectors.toCollection(HashSet::new));
        result.forEach(System.out::println);
    }

    @Test
    public void testsummarizingDouble() {
        IntSummaryStatistics result = persones.stream()
                .collect(Collectors.summarizingInt(Persone::getAge));
        /**
         * Interesting method to get the Max, Min, Avg, ...etc all this information can be generate just by applying
         * the SummarizingInt method
         */
    }

    @Test
    public void groupingBy() {
        Map<String, List<Persone>> result = persones.stream()
                .collect(Collectors.groupingBy(Persone::getName));
        assertEquals(result.get("A").size(), 2);
        assertEquals(result.get("B").size(), 1);
    }


}
