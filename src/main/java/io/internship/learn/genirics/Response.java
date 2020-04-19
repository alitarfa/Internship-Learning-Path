package io.internship.learn.genirics;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {

    private int code;
    private String message;
    private T response;

    public String getToString(T info) {
        return info.toString();
    }
}
