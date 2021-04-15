package com.codelearning.springbootrabbitmqconsumer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface QueueReceiver {
    ResponseEntity<String> messageGetFromQueue(String m);
}
