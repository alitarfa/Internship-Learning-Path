package io.internship.learn.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverse2Char() {
        String actual = StringUtils.revers2Char("AB");
        assertEquals("BA", actual);
    }

    @Test
    void reverseMoreThan2() {
        String actual = StringUtils.revers2Char("ABCD");
        assertEquals("ABDC", actual);
    }

    @Test
    void reverseEmpty() {
        String actual = StringUtils.revers2Char("");
        assertEquals("", actual);
    }

    @Test
    void reverseOneChar() {
        String actual = StringUtils.revers2Char("A");
        assertEquals("A", actual);
    }
}