package io.internship.learn.example.java.brain.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

    // we can add other Method
    public List<Course> findByTopicName(String name);
    public Optional<Course> findByName(String name);

}
