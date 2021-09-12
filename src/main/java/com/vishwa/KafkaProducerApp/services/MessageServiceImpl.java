package com.vishwa.KafkaProducerApp.services;

import java.io.IOException;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl implements MessageService{



  @Override
  public void produceMessage(String topicName, String key, String value) throws IOException {
    return ;
  }
}
