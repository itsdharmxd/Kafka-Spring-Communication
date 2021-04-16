package com.upgrad.KafkaProducerApp.services;

import com.upgrad.KafkaProducerApp.producers.KafkaMessageProducer;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl implements MessageService{

  @Autowired
  private KafkaMessageProducer kafkaMessageProducer ;


  @Override
  public void produceMessage(String topicName, String key, String value) throws IOException {
    kafkaMessageProducer.publish(topicName, key, value);
  }
}
