package com.userFlight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userFlight.entity.SearchEntity;
import com.userFlight.entity.UserEntity;
import com.userFlight.error.exception.FlightNotFoundException;
import com.userFlight.repository.BookingRepository;
import com.userFlight.repository.SearchRepository;

@Service
public class UserService {
	
	@Autowired
	private SearchRepository repo;
	
	@Autowired
	private BookingRepository bookRepo;
	
	public List<SearchEntity> searchFlight(String start,String end) throws FlightNotFoundException{
		
		List<SearchEntity> list =repo.findByStartEnd(start, end);
		if(list.isEmpty()) {
			throw  new FlightNotFoundException("your search is not found!");
		}else {
			return list;
		}
			
		 
	}
	
	public SearchEntity bookFlight(int flightNo){
		Optional<SearchEntity> optional=repo.findById(flightNo);
		if(optional.isEmpty()) {
			System.out.println("hiiiiiii");
			return null;
		}
		else {
			return optional.get();

		}
	}
	
	public List<UserEntity> checkTicket(String email) throws FlightNotFoundException{
		List<UserEntity> list=bookRepo.findByEmail(email);
		if(list.isEmpty()) {
			throw  new FlightNotFoundException("Enter email id does not exist!");
		}else {
			return list;
		}
	}
	
	
	public UserEntity bookTicket(UserEntity user) {
//		
		//Long pnr=user.getPnr()+1000000000;
		//user.setPnr(pnr);	
		 Long pnr = (long) (Math.floor(Math.random()*1000000000));
		 user.setPnr(pnr);
		 System.out.println("helooooooo"+user.getPnr());
		return bookRepo.save(user);
	}
	
	public String cancelFlight(Long pnr,String bookingStatus) {
		UserEntity user=bookRepo.findById(pnr).get();
		if(user.getPnr()!=0) {
			user.setBookingStatus(bookingStatus);
		}else {
			return "You enter incorrect PNR number";
		}
		bookRepo.save(user);
		//bookRepo.cancelTicket(pnr);
		return "Booking of your flight with PNR: "+pnr+" cancel successfully!";
	}
}
