package io.internship.learn.functional;

import io.internship.learn.funcional.InfoValidator;
import io.internship.learn.funcional.InfoValidator.ValidatorResponse;
import io.internship.learn.funcional.Person;
import io.internship.learn.funcional.Person.Gender;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static io.internship.learn.funcional.InfoValidator.isMailValid;
import static io.internship.learn.funcional.Person.Gender.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalTest {

    @Test
    public void testPredicate() {
        /**
         * Predicate in a boolean function that give us the ability to return a true or false based
         * Our logic we provide
         */

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return (s.contains("A"));
            }
        };

        // we can use the Lambda expression to avoid the Code above
        Predicate<String> stringPredicate1 = (string) -> string.contains("A");

        boolean aTest = stringPredicate.test("ATest");
        boolean aTest1 = stringPredicate1.test("ATest");

        assertEquals(aTest, true);
        assertEquals(aTest1, true);
    }


    @Test
    public void testFunction() {
        Function<String, Integer> getLengthString = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int length = s.length();
                return length;
            }
        };

        // we use Lambda also and we use directly the reference method

        Function<String, Integer> getLength = String::length;

        Integer integer = getLengthString.apply("ATest");
        Integer aTest = getLength.apply("ATest");

        assertEquals(integer, "ATest".length());
        assertEquals(aTest, "ATest".length());

    }


    @Test
    public void testConsumer() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // we consume it
                System.out.println("Consume :: " + s);
            }
        };
        consumer.accept("ATest");

    }


    @Test
    public void testComposition() {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // we consume it
                System.out.println("Consume :: " + s);
            }
        };

        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // we consume it
                System.out.println("Consume_2:: " + s);
            }
        };


        consumer.andThen(consumer2).accept("ATest");
    }


    @Test
    public void testPersonClass() {
        // test Consumer function and BiConsumer
        Consumer<Person> personConsumer = person
                -> System.out.println("Person Name :: " + person.getName() + ", Number Phone :: " + person.getNumber());
        Person person = new Person("Test", 12222, 25, MALE, "");
        personConsumer.accept(person);


        // BiConsumer
        BiConsumer<Person, Boolean> booleanBiConsumer = ((person1, aBoolean) -> {
            System.out.println("Person Name :: " + person.getName() + ", Number Phone :: " + (aBoolean ? person1.getNumber() : "********"));
        });

        booleanBiConsumer.accept(person, false);

    }


    @Test
    public void testChaining() {
        Person person = new Person("Test", 12222, 25, MALE, "ali.tarfa.csgmail.com");
        ValidatorResponse result =
                InfoValidator.isAgeValid()
                        .and(isMailValid())
                        .apply(person);

        System.out.println(result);
    }


}
