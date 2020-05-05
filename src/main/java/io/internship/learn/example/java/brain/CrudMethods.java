package io.internship.learn.example.java.brain;

import java.util.List;
import java.util.Optional;

public interface CrudMethods<T> {

    public T add(T model);

    public Optional<T> findOne(int id);

    public List<T> findAll();

    public T update(T Model);

}
