package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.FlightEntity;
import com.flight.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository repo;
	
	public FlightEntity addFlight(FlightEntity flight) {
		return repo.save(flight);
	}
	
	public List<FlightEntity> getFlight() {
		return repo.findAll();
	}
	
	public String updateStatus(int flightNo,String flightStatus) {
		FlightEntity flight=repo.findById(flightNo).get();
		if(flight.getFlightNo()!=0) {
			flight.setFlightStatus(flightStatus);
			
		}else {
			return "invalid flight number";
		}
		repo.save(flight);
		return "Status of a flight "+flightNo+" update successfully!";
	}
}
