package io.internship.learn.example.java.brain.course;

import io.internship.learn.example.java.brain.topic.Topic;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3, max = 20)
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;
}
