package io.internship.learn.enumTest;

import java.util.Date;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DataType type = DataType.INT;
        DataType[] dataType = DataType.values();
        for (DataType dataType1 : dataType) {
            System.out.println(dataType1);
        }

        if (DataType.INT == type) {
            System.out.print("Yeah");
        }

        // Test for operation
        int operation = Operation.ADD.apply(0, 1);
        System.out.println(operation);


        // test OrderStatus

        OrderStatus status = OrderStatus.PLACED;
        Order order = Order.builder()
                .id("qwertyuiop[")
                .orderStatus(status)
                .idRestaurant("1234567890")
                .idUser("1234567890")
                .timeStamp(new Date().getTime())
                .build();

        System.out.println(order);


        if (order.getOrderStatus().isPlaced()) {
            System.out.println("Your Order Is Placed");
        }

    }
}
