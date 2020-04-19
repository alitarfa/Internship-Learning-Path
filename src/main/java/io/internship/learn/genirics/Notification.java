package io.internship.learn.genirics;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class Notification {

    private String id;
    private String content;
}
