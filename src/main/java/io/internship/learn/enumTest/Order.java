package io.internship.learn.enumTest;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class Order {

    private String id;
    private String idUser;
    private String idRestaurant;
    private long timeStamp;
    private OrderStatus orderStatus;
}
