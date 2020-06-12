package com.example.kafka.listener;

import com.example.kafka.resource.model.Book;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics= "thisWork-topic", group = "group_id")
    public void consume(String message){
        System.out.println("Consumed message:" + message);

    }
}
