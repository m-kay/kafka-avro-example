package com.example.kafka.avro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(Processor.class)
public class KafkaAvroExampleApplication {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaAvroExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaAvroExampleApplication.class, args);
	}

	@StreamListener(Processor.INPUT)
	public void onTest(com.example.kafka.avro.types.Test test){
		LOG.info("received test {}", test);
	}

}
