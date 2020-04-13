package io.internship.learn.builder;

public class Main {

    public static void main(String[] args) {
        HumanBuilder.Human human = new HumanBuilder()
                .firstName("Test")
                .lastName("Test")
                .age(25)
                .address("Test")
                .build();

        System.out.println(human);

    }
}
