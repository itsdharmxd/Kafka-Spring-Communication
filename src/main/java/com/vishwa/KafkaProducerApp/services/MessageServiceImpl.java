package com.vishwa.KafkaProducerApp.services;

import java.io.IOException;

import com.vishwa.KafkaProducerApp.services.publishes.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl implements MessageService{
  @Autowired
  private MessagePublisher messagePublisher;


  @Override
  public void produceMessage(String topicName, String key, String value) throws IOException {


    messagePublisher.publish(topicName,key,value);
    return ;
  }
}
