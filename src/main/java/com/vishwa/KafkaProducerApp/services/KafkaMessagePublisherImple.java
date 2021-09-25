package com.vishwa.KafkaProducerApp.services;

import com.vishwa.KafkaProducerApp.services.publishes.MessagePublisher;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

import java.util.Properties;
@Component
public class KafkaMessagePublisherImple implements MessagePublisher {
    @Override
    public void publish(String topicName, String key, String value) {
        Properties properties=new Properties();
        properties.put("bootstrap.servers","127.0.0.1:9092");
        //key and  value serializer
        properties.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        // i need to define partition logic
        properties.put("partitioner.class","org.apache.kafka.clients.producer.internals.DefaultPartitioner");
        /**
         * Create a producerobject
         */
        Producer<String,String> producer =new KafkaProducer<String, String>(properties);
        System.out.println("Producing messages");
        /**
         * Publishing the message
         */
        producer.send((new ProducerRecord<String,String>(topicName,key,value)));
        /**
         * close the producer connection
         */
        producer.close();
    }
}
