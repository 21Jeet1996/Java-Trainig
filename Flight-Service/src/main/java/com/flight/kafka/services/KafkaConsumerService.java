package com.flight.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.flight.entity.BookingEntity;
import com.flight.repository.BookinRepository;

@Service
public class KafkaConsumerService {
	
	@Autowired
	BookinRepository repo;
	 private static final String TOPIC = "flight-service";
	 
	 
	 	
	    @KafkaListener(topics = TOPIC, groupId="group_id", containerFactory = "userKafkaListenerFactory")
	    public BookingEntity consumeJson(BookingEntity bookingEntity) {
	    	
	        System.out.println("Consumed JSON Message: " + bookingEntity.toString());
			return repo.save(bookingEntity);
	    }
	    
}
