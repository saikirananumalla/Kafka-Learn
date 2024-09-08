package com.appsdeveloperblog.ws.emailnotificationservice;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@KafkaListener(topics = "product-created-events-topic")
public class ProductCreatedEventHandler {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @KafkaHandler
    public void handle(Object productCreatedEvent) {
        logger.info("Received product created event: " + productCreatedEvent);
    }
}
