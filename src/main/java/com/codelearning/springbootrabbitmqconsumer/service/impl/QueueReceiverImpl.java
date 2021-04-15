package com.codelearning.springbootrabbitmqconsumer.service.impl;

import com.codelearning.springbootrabbitmqconsumer.service.QueueReceiver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiverImpl implements QueueReceiver {
    private static final Logger logger = LogManager.getLogger(QueueReceiverImpl.class);

    @RabbitListener(queues = "${user.queue.name}")
    @Override
    public ResponseEntity<String> messageGetFromQueue(String message) {
        logger.info("Message Recived {}", message);
        return null;
    }
}
