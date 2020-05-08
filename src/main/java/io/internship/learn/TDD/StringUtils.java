package io.internship.learn.TDD;

public class StringUtils {

    public static String revers2Char(String value) {

        int length = value.length();

        if (length < 2) return value;

        String remaindedText = value.substring(0, length - 2);

        char one = value.charAt(length - 2);
        char two = value.charAt(length - 1);

        return remaindedText + two + one;
    }
}
