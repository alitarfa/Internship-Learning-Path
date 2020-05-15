package io.internship.learn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LearnApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void testAddingCase() {
        int number = TestMethods.getNumber(1, 1);
        assertEquals(number, 0);
    }

    @Test
    void testIsPrime() {
        boolean prime = TestMethods.isPrime(3);
        assertTrue(prime);
    }
}

