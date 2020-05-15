package io.internship.learn.example.java.brain.topic;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {


    private final TopicService topicService;


    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }


    @PostMapping("/topic")
    public Topic save(@RequestBody Topic topic) {
        return topicService.add(topic);
    }


    @GetMapping("/topic/{id}")
    public Topic findOne(@PathVariable int id) {
        return topicService.findOne(id).orElseThrow(() -> new ObjectNotFoundException(null, "Not found"));
    }

    @PutMapping("/topic")
    public Topic update(@RequestBody Topic topic) {
        return topicService.update(topic);
    }

    @GetMapping("/topic")
    public List<Topic> findAll() {
        return topicService.findAll();
    }

}
