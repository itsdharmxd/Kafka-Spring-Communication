package com.vishwa.KafkaProducerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerAppApplication.class, args);
		System.out.println("running");
	}

}
