package com.kafaka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafaka.model.Book;

@Service
public class KafkaConsumerListener {

    private static final String TOPIC = "kafka-topic";

    @KafkaListener(topics = TOPIC, groupId="group_id", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Book book) {
        System.out.println("Consumed JSON Message: " + book);
    }
    
}