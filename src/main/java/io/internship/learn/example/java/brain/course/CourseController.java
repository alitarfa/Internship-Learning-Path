package io.internship.learn.example.java.brain.course;

 import io.internship.learn.example.java.brain.topic.Topic;
 import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {

    private final CourseService service;

    @Autowired
    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping("/course")
    public Course add(@RequestBody Course model) {
        return service.add(model);
    }

    @GetMapping("/course/{id}")
    public Course findOne(@PathVariable int id) {
        return service.findOne(id).orElseThrow(() -> new ObjectNotFoundException(null, "Not found"));
    }

    @GetMapping("/course")
    public List<Course> findAll() {
        return service.findAll();
    }

    @PutMapping("/course")
    public Course update(@RequestBody Course model) {
        return service.update(model);
    }


    @GetMapping("/topic/{name}/course")
    public List<Course> findByTopicId(@PathVariable String name) {
        return service.findByTopicName(name);
    }
}
