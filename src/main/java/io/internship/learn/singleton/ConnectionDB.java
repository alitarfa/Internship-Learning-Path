package io.internship.learn.singleton;

/**
 * We have to ways to create an Instance of the this Class and to make it a singleton
 * 1)- to create the static factory Method
 * 2)- Let the INSTANCE public
 * <p>
 * Note Both Ways we keep always the Constructor as a private member
 */
public class ConnectionDB {

    private static final ConnectionDB INSTANCE = new ConnectionDB();

    /**
     * this the First way
     *
     * @return
     */
    public static ConnectionDB getInstance() {
        return INSTANCE;
    }

    private ConnectionDB() {
        // todo
    }


}
