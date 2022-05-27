package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/topic")
@CrossOrigin(origins = "*")
public class TopicController {

    TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping()
    public ResponseEntity<List<TopicEntity>> listAllTopics() {
        List<TopicEntity> topics = topicService.findAllTopics();
        return ResponseEntity.ok(topics);
    }

    @PostMapping()
    public ResponseEntity<TopicEntity> saveTopic(@RequestBody TopicEntity topic) {
        TopicEntity topicSaved = topicService.saveTopic(topic);

        return  ResponseEntity.ok(topicSaved);
    }
}
