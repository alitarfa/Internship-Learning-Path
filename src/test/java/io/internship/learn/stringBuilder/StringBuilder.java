package io.internship.learn.stringBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringBuilder {


    @Test
    public void stringBuilder() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append("Hello");
        assertEquals(builder.toString(), "Hello");
    }

}
