package io.internship.learn.Immutablity;

import java.util.HashMap;

public class ImmutablePerson {

    private String name;
    private String lastName;
    private HashMap<String, String> address;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public HashMap<String, String> getAddress() {
        return (HashMap<String, String>) address.clone();
    }

    public ImmutablePerson(ImmutablePersonBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }


    // Builder Class

    public static class ImmutablePersonBuilder {
        private String name;
        private String lastName;
        private HashMap<String, String> address;

        public ImmutablePersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ImmutablePersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ImmutablePersonBuilder setAddress(HashMap<String, String> address) {
            this.address = address;
            return this;
        }


        public ImmutablePerson build() {
            return new ImmutablePerson(this);
        }

    }
}
