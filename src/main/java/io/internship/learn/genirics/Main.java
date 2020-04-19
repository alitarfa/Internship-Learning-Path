package io.internship.learn.genirics;

public class Main {


    public static void main(String[] args) {

        Order order = Order.builder()
                .id("test")
                .idUser("user")
                .restaurantID("restaurant")
                .build();


        Notification notification = Notification.builder()
                .id("test")
                .content("notification information")
                .build();


        Response<Order> response = Response.<Order>builder()
                .response(order)
                .code(200)
                .message("Great")
                .build();


        System.out.println(response.getToString(order));
    }

}
