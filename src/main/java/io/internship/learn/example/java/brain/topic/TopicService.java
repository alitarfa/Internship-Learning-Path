package io.internship.learn.example.java.brain.topic;

import io.internship.learn.example.java.brain.CrudMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService implements CrudMethods<Topic> {


    // Inject Bean using Autowired

    private final TopicRepository repository;

    @Autowired
    public TopicService(TopicRepository repository) {
        this.repository = repository;
    }

    @Override
    public Topic add(Topic model) {
        return repository.save(model);
    }

    @Override
    public Optional<Topic> findOne(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Topic> findAll() {
        return (List<Topic>) repository.findAll();
    }

    @Override
    public Topic update(Topic model) {
        return repository.save(model);
    }
}
