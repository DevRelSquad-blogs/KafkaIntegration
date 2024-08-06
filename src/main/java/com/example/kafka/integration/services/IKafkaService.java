package com.example.kafka.integration.services;

import com.example.kafka.integration.models.KafkaRequest;
import com.example.kafka.integration.models.KafkaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class IKafkaService implements KafkaService {

    private String TOPIC = "quickstart-events";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaResponse produceRequest(final KafkaRequest kafkaRequest) {
        String message = kafkaRequest.getMessage();
        kafkaTemplate.send(TOPIC, message);
        KafkaResponse kafkaResponse = KafkaResponse.builder()
                .success(Boolean.TRUE)
                .message("message consumed successfully")
                .build();
        return kafkaResponse;
    }
}
