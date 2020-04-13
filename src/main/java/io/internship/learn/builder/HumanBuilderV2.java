package io.internship.learn.builder;

import java.util.function.Consumer;

public class HumanBuilderV2 {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public void firstName(String firstName) {
        this.firstName = firstName;

    }

    public void lastName(String lastName) {
        this.lastName = lastName;

    }

    public void age(int age) {
        this.age = age;

    }

    public void address(String address) {
        this.address = address;
    }


    /**
     * The Consumer Functional Interface it accept arguments and not return any things
     * as the Name indicates
     *
     * @param consumer
     * @return
     */
    public HumanBuilderV2 Builder(Consumer<HumanBuilderV2> consumer) {
        consumer.accept(this);
        return this;
    }


    public Human build() {
        return new Human(firstName, lastName, age, address);
    }


    public class Human {

        private String firstName;
        private String lastName;
        private int age;
        private String address;

        /**
         * We use the Private Constructor to avoid the creation of Human Object from outside ^_^
         *
         * @param firstName
         * @param lastName
         * @param age
         * @param address
         */
        private Human(String firstName, String lastName, int age, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


}
