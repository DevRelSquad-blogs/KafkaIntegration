package com.example.kafka.integration.services;

import com.example.kafka.integration.models.KafkaRequest;
import com.example.kafka.integration.models.KafkaResponse;
import org.springframework.stereotype.Service;

@Service
public interface KafkaService {
    KafkaResponse produceRequest(final KafkaRequest kafkaRequest);
}
