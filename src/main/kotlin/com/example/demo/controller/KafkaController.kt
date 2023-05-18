package com.example.demo.controller

import com.example.demo.kafka.KafkaProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/send-message")
class KafkaController @Autowired constructor(private val kafkaProducer: KafkaProducer){

    @PostMapping()
    fun sendMessage(@RequestBody message: String) {
        kafkaProducer.sendMessage("testTopic", message)
    }

}