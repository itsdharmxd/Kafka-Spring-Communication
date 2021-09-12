package com.vishwa.KafkaProducerApp.controller;

import com.vishwa.KafkaProducerApp.dto.MessageDTO;
import com.vishwa.KafkaProducerApp.services.MessageService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/message-producer/")
public class MessageController {

  @Autowired
  private MessageService messageService;

  @PostMapping(value = "/messages", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity produceData(@RequestBody MessageDTO messageDTO) throws IOException {
    messageService.produceMessage(messageDTO.getTopic(), messageDTO.getKey(), messageDTO.getValue());
    return new ResponseEntity("Message published", HttpStatus.ACCEPTED);
  }
}
