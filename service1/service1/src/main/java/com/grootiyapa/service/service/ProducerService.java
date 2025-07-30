package com.grootiyapa.service.service;

import com.grootiyapa.service.entity.UserData;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String, UserData> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, UserData> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendUserData(UserData data) {
        kafkaTemplate.send("message-sent", data);
        System.out.println("Sent : " + data.getUsername());
    }
}
