package io.internship.learn.builder;


/**
 * This is the
 */
public class HumanBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String address;


    public HumanBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public HumanBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public HumanBuilder age(int age) {
        this.age = age;
        return this;
    }

    public HumanBuilder address(String address) {
        this.address = address;
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
