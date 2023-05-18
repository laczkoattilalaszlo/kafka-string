package com.example.demo.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    @KafkaListener(topics = ["testTopic"])
    fun receiveMessage(message: String) {
        println("RECEIVED MESSAGE FROM KAFKA: $message")
    }

}
