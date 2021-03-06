package com.userFlight.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userFlight.entity.SearchEntity;
import com.userFlight.entity.UserEntity;
import com.userFlight.error.exception.FlightNotFoundException;
import com.userFlight.kafka.model.UserFlight;
import com.userFlight.service.UserService;


//@CrossOrigin(allowedHeaders="*",origins ={"http://localhost:4200", "https://hoppscotch.io/"})//allowedHeaders="*",
@RestController
@RequestMapping("/user")
//@CrossOrigin(allowedHeaders="*",origins ={"http://localhost:4200"}, maxAge = 3600,allowCredentials="false")
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@Autowired
    private KafkaTemplate<String, UserFlight> kafkaTemplate;
	
	private static final String TOPIC = "flight-service";
	
	@GetMapping("/Welcome user")
	public String welcome() {
		return "Welcom user";
	}
	
	@GetMapping("/search/{start}/{end}")
	public List<SearchEntity> searchFlight(@PathVariable String start,@PathVariable String end) throws FlightNotFoundException{
	//@RequestBody SearchEntity search
//		String start=search.getStart();
//		String end=search.getEnd();
		
		System.out.println("**** heloo user you are search from: "+start+" and destination is: "+end+" *****");
		return userService.searchFlight(start,end);
	}
//	
//	@PostMapping("/add")
//	public UserEntity add(@RequestBody UserEntity user) {
//		
//		return userService.bookTicket(user);
//	}
//	@PostMapping("/book/{flightNo}")
	//@CrossOrigin(origins ={"http://localhost:4200/book-flight"})	
	
	@PostMapping("/book")
	public Long bookTicket(@RequestBody UserEntity user){
		
		int flightNo=user.getFlightNo();
		System.out.println("hiiiiiii  "+user.getFlightNo()+"  : "+user.getBookingStatus());
		String status=("CONFIRM".toUpperCase()).trim();//(user.getBookingStatus().toUpperCase()).trim();
		String name= (user.getFirstName()).trim()+" "+(user.getLastName()).trim();
		
		SimpleDateFormat date=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date now=new Date();
		System.out.println(date.format(now));
		user.setBookingStatus(status);
		
		SearchEntity searchFlight=userService.bookFlight(flightNo);
		userService.bookTicket(user);
			
		
		System.out.println("pnr: "+user.getPnr());
		
		System.out.println("hi "+searchFlight.toString());
		
        kafkaTemplate.send(TOPIC, 
        		new UserFlight(user.getPnr(),flightNo,user.getEmail(),name,user.getTotalSeat(),status,
        				now,searchFlight.getStartDate(),searchFlight.getStart(),searchFlight.getEnd()));
		return user.getPnr();
	}
	
	@PutMapping("/updatestatus/{pnr}")
	public String cancelTicket(@PathVariable Long pnr,@RequestBody UserEntity user) {
		String bookingStatus=(user.getBookingStatus().toUpperCase()).trim();
		return userService.cancelFlight(pnr, bookingStatus);
	}
	
	@GetMapping("checkticket/{email}")
	public List<UserEntity> checkTicket(@PathVariable String email)  throws FlightNotFoundException {
		return userService.checkTicket(email);
	}
}
