package com.warrand.spring_kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "NewTopic",groupId = "my_group")
    public void consume(String message) {
        System.out.println("message: " + message);
    }
}
