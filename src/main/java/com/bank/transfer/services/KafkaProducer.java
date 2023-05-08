package com.bank.transfer.services;

import com.bank.transfer.model.Record;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private KafkaTemplate<String,String> kafkaTemplate;

}
