package com.example.demo.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducer @Autowired constructor(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(topic: String, message: String) {
        kafkaTemplate.send(topic, message)
        println("THE FOLLOWING MESSAGE WAS SENT:\n" +
                "- topic: $topic\n" +
                "- message: $message")
    }

}

