package io.internship.learn.try_with_resource;

public class ResourceTest implements AutoCloseable {


    @Override
    public void close() throws Exception {
        System.out.println("la fermeture se fait automatique");
    }
}
