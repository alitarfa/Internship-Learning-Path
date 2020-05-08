package io.internship.learn;

public class TestMethods {


    public static int getNumber(int a, int b) {
        if (a == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static boolean isPrime(int number) {

        boolean prime = true;

        for (int i = 2; i < number; i++) {
            boolean res = number % 2 == 0;
            if (res) {
                // is not prime
                prime = false;
                break;
            }
        }

        return prime;
    }
}
