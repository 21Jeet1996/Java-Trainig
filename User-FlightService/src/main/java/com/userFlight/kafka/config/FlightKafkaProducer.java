package com.userFlight.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.userFlight.entity.UserEntity;
import com.userFlight.kafka.model.UserFlight;

@Configuration
public class FlightKafkaProducer {
	
	 @Bean
	    public ProducerFactory<String, UserFlight> producerFactory() {
	        Map<String, Object> kafkaConfig = new HashMap<>();

	        kafkaConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	        kafkaConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	        kafkaConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

	        return new DefaultKafkaProducerFactory<String, UserFlight>(kafkaConfig);
	    }

	    @Bean
	    public KafkaTemplate<String, UserFlight> kafkaTemplate() {
	        return new KafkaTemplate<>(producerFactory());
	    }

	}
