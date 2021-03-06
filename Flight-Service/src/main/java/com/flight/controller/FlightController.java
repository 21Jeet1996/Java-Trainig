package com.flight.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.FlightEntity;
import com.flight.security.model.JwtRequest;
import com.flight.security.model.JwtResponse;
import com.flight.security.service.JwtUserDetailsService;
import com.flight.security.utils.JwtTokenUtil;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService flightService;	
	
	@GetMapping("/test")
	public String helloEureka() {
		System.out.println("hello");
		return "Welcome to Eureka server";
	}


	@PostMapping("/add")
	public ResponseEntity<FlightEntity> addFlight(@Valid @RequestBody FlightEntity flight) {
		System.out.println("hello");
		FlightEntity savedfFlight= flightService.addFlight(flight);
		return new ResponseEntity<FlightEntity>(savedfFlight, HttpStatus.CREATED);
		//return flightService.addFlight(flight);
	}
	
	@GetMapping("/get")
	public List<FlightEntity> getFlight() {
		System.out.println("hello admin!!");
		return flightService.getFlight();
	}
	
	@PutMapping("updateStatus/{flightNo}")
	public String updateStatus(@PathVariable int flightNo,@RequestBody FlightEntity flight) {
		String status=(flight.getFlightStatus().toUpperCase()).trim();
		return flightService.updateStatus(flightNo, status);
	}
}
