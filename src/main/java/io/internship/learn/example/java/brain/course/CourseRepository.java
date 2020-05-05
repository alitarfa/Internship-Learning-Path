package io.internship.learn.example.java.brain.course;

import io.internship.learn.example.java.brain.topic.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

    // we can add other Method
    public List<Course> findByTopicName(String name);

}
