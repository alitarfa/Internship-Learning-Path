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


        HumanBuilderV2.Human human1 = new HumanBuilderV2().Builder(elem -> {
            elem.firstName("test");
            elem.lastName("test");
            elem.age(25);
            elem.address("Test");
        }).build();


        System.out.println(human1);


    }
}
