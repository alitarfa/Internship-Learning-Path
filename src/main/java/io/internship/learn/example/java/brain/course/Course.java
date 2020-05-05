package io.internship.learn.example.java.brain.course;

import io.internship.learn.example.java.brain.topic.Topic;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @OneToMany
    private List<Topic> topics;
}
