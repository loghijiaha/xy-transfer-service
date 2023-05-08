package com.bank.transfer.config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "/application.properties")
@EmbeddedKafka(partitions = 2, topics = "cord", brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
class KafkaConfigurationTest {

    @Test
    void kafkaAdmin() {
    }

    @Test
    void topic() {
    }

}