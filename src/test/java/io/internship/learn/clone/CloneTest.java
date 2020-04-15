package io.internship.learn.clone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CloneTest {

    @BeforeEach
    public void init() {

    }

    @Test
    public void testShallowClone() {

        /**
         * The Shallow is a one way to create a copy of an object
         * But this type will effect on the copied version  because
         * we have just assinged the refrence of the first one to the new one
         * this mean any changes on second one will affect on the First Object
         */

        Person p1 = new Person("Test", "Paris");
        Person p2 = p1;

        assertEquals(p1, p2);

    }


    @Test
    public void testDeepClone() {

        Person p1 = new Person("Test", "Test");
        Person p2 = new Person();

        p2.setName(p1.getName());
        p2.setAddress(p1.getAddress());

        assertEquals(p1, p2);

        p2.setAddress("Test 2");

        assertNotEquals(p1, p2);

    }


    /**
     * The clone() method of Object class it's responsible for creating a deep copy for a given object
     * But as th Effective Java said it's not safe to use it in some cases because in case like we have
     * attributes with references not primitives will fail like having a list inside Person and this list it's a list of
     * Objects , so the Best way from Effective Java is the Use the Constructor Copy or using another Libraries to do this things for us
     * @throws CloneNotSupportedException
     */


    @Test
    public void testColonMethod() throws CloneNotSupportedException {
        Person p1 = new Person("Test", "Test");
        Person p2 = (Person) p1.clone();

        assertEquals(p1,p2);

        p2.setAddress("test 2");

        assertNotEquals(p1,p2);
    }

}
