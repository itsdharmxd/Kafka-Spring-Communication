package com.vishwa.KafkaProducerApp.services.publishes;

/**
 * contract for sending messages to kafka
 */
public interface MessagePublisher {

   public void publish(String topicName, String key, String value);



}
