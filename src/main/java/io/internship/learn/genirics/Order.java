package io.internship.learn.genirics;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class Order {

    private String id;
    private String restaurantID;
    private String idUser;
}
