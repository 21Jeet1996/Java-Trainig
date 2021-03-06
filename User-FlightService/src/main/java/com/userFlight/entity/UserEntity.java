package com.userFlight.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_history")
public class UserEntity {
	
	//@GeneratedValue(strategy=GenerationType.AUTO)	//,generator="1000000000")
	@Id
	private Long pnr;
	private int flightNo;
	private String email;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private int totalSeat;	
	private String bookingStatus;
	private int seatNo;
	
	
	
	public UserEntity() {
		super();
	}
	public UserEntity(Long pnr, int flightNo,String email, String firstName, String lastName, String gender, int age,
			int totalSeat, int seatNo, String bookingStatus) {
		super();
		this.pnr = pnr;
		this.flightNo= flightNo;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.totalSeat = totalSeat;
		this.seatNo = seatNo;
		this.bookingStatus=bookingStatus;
	}
	public Long getPnr() {
		return pnr;
	}
	public void setPnr(Long pnr) {
		this.pnr = pnr;
	}
		
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "UserEntity [pnr=" + pnr + ", flightNo=" + flightNo + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + ", totalSeat=" + totalSeat
				+ ", bookingStatus=" + bookingStatus + ", seatNo=" + seatNo + "]";
	}
	
	
	
}
