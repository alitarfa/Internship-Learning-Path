package io.internship.learn.singleton;

public class Main {

    public static void main(String[] args) {

        /**
         * One Way to get a Singleton Instance of ConnectionDB class
         * When we execute it we gonna note that Both { connectionDB and ConnectionDB2 } have
         * The Same memory address and this is the Singleton scope
         *
         *
         * The getInstance() method named also the static factory method
         * This name is just a covension we can name it what we want but
         * in the programming word we gonna face a famous names that used to
         * indicate that we are using the static factory method
         *
         *  Like == { of() | with() | get() | getInstance() | instance() | valueOf() | ...etc}
         *
         *
         */
        ConnectionDB connectionDB = ConnectionDB.getInstance();
        System.out.println("ConnectionDB Memory Address::" + connectionDB);


        ConnectionDB connectionDB2 = ConnectionDB.getInstance();
        System.out.println("ConnectionDB Memory Address::" + connectionDB2);


    }
}
