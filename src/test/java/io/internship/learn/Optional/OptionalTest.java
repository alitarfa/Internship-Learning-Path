package io.internship.learn.Optional;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionalTest {

    // The Optional Class it's a wrapper that can cover an object and make the null point

    @Test
    public void testOptional() {
        /**
         *  create an Empty Optional
         */
        Optional empty = Optional.empty();
        assertFalse(empty.isPresent());

        /**
         * // Create an Optional
         */
        String name = "Optional";
        Optional<String> optional = Optional.of(name);

        /**
         * // create an Optional in case on Null
         */
        String nameNull = null;
        Optional<String> optionalNull = Optional.ofNullable(nameNull);

        /**
         * // ifPresent || isPresent
         */
        boolean isPresnet = optional.isPresent();

        /**
         *  if Present accepts a consumer Object
         */
        optional.ifPresent(System.out::println);

        /**
         * orElse ==> used for default value
         */
        String value = optional.map(String::toUpperCase).orElse("Default value");

        /**
         * orElseGet { this will accept Supplier Object}
         */

        optional.map(String::toUpperCase).orElseGet(() -> "default value");

        /**
         *  Throw Exception
         */
        optional.orElseThrow(RuntimeException::new);


    }
}
