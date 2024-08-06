package com.example.kafka.integration.controllers;

import com.example.kafka.integration.models.KafkaRequest;
import com.example.kafka.integration.models.KafkaResponse;
import com.example.kafka.integration.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/kafka")
public class kafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/produce")
    public KafkaResponse produceRequest(@RequestBody final KafkaRequest kafkaRequest) {
        return kafkaService.produceRequest(kafkaRequest);
    }

}