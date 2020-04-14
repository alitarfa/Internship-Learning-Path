package io.internship.learn.equals;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        CaseInsensitiveString string = new CaseInsensitiveString("Hello");

        CaseInsensitiveString string2 = new CaseInsensitiveString("Hello");

        /**
         * This will give a true Result, straightforward
         *  this mean the properties of equals {Reflexivity | Symmetric | Transitivity } are respected
         */
        // System.out.println(string.equals(string2));


        /**
         * In this example we gonna take a look how we can intentionally violate the Symmetric Property
         * we are going to use the {string} object with {test} primitive String value
         * First we test by this way ==> {test.equals(string)} then by this way ==> {string.equals(test)}
         * So the result will be false and true , in this we have violated the Symmetric property of equals() method
         */
        String test = "Hello";

        /**
         * This will be the third property of equals() method {Transitivity }
         * we gonna violate it and see it ^_^ { i have use the same examples showed in Effective java 3 rd edition }
         *
         */

        Point point = new Point(1, 2);
        ColorPoint colorPoint1 = new ColorPoint(1, 2, Color.black);
        ColorPoint colorPoint2 = new ColorPoint(1, 2, Color.blue);


        /**
         * Before we dive into the result let's take a brief explanation and expectation for what will happen
         *  So,
         *
         *  ------------ First case {colorpoint1 with point} ------------
         *
         *  so, the result depends on the implementation we have write it into the ColorPoint Class
         *  and from this implementation we can say that the result will be {true }
         *
         *
         * ------------ Second case {point with colorPoint2} ------------
         *
         *   the result will be {true} | here we can infer some transitive result
         *
         *   colorpoint1 == point and point == colorpoint2 this normmally will give us {colorpoint1 == colorpoint2}
         *
         *    But ): that fact it's something else so why because this depends on the implementation we have write it
         *    inside the equals() method
         *
         *   ------------ Third  case {colorpoint1 with colorpoint2} ------------
         *
         *   will give us false ,
         */

        System.out.println(colorPoint1.equals(point));
        System.out.println(point.equals(colorPoint2));
        System.out.println(colorPoint1.equals(colorPoint2));
    }
}
