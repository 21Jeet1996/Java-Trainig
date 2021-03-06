package com.flight.kafka.config;


import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.flight.entity.BookingEntity;

@EnableKafka
@Configuration
public class FlightKafkaConsumer {
	 @Bean
	    public ConsumerFactory<String, BookingEntity> userConsumerFactory() {
		 
		  JsonDeserializer<BookingEntity> deserializer = new JsonDeserializer<>(BookingEntity.class);
		    deserializer.setRemoveTypeHeaders(false);
		    deserializer.addTrustedPackages("*");
		    deserializer.setUseTypeMapperForKey(true);
		    
	        Map<String, Object> kafkConsumer = new HashMap<>();

	        kafkConsumer.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	        kafkConsumer.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
	        kafkConsumer.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
	        kafkConsumer.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
	        kafkConsumer.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        kafkConsumer.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);

	        return new DefaultKafkaConsumerFactory<>(kafkConsumer, new StringDeserializer(),
	        		deserializer);
	    }

	    @Bean
	    public ConcurrentKafkaListenerContainerFactory<String, BookingEntity> userKafkaListenerFactory() {
	        ConcurrentKafkaListenerContainerFactory<String, BookingEntity> factory = new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(userConsumerFactory());

	        return factory;
	    }

	}
