package com.grootiyapa.service.service;

import com.grootiyapa.service.entity.UserData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    @KafkaListener(topics = "message-sent", groupId = "group_id-2")
    public void consume(UserData userData) {
        System.out.println("Consumed : " + userData.getUsername() );
    }
}
