package com.example.kafka.listener;

import com.example.kafka.resource.model.Book;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(
            topicPartitions = @TopicPartition(topic = "part", partitions = {"0"})
            , groupId = "group_json")
    public void consume( @Payload String book,
                         @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition){
        System.out.println("Consumed message:" + book);

    }
}
