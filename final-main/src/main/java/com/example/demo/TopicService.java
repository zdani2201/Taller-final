package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<TopicEntity> findAllTopics() {
        List<TopicEntity> topics = topicRepository.findAll();
        return topics;
    }

    public TopicEntity saveTopic(TopicEntity topic) {
        return topicRepository.save(topic);
    }
}
