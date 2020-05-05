package io.internship.learn.example.java.brain.course;

import io.internship.learn.example.java.brain.CrudMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudMethods<Course> {


    private final CourseRepository repository;

    @Autowired
    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course add(Course model) {
        return repository.save(model);
    }

    @Override
    public Optional<Course> findOne(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) repository.findAll();
    }

    @Override
    public Course update(Course model) {
        return repository.save(model);
    }
}
