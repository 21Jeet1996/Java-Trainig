package com.userFlight.kafka.model;



import java.util.Date;

import javax.persistence.Id;

public class UserFlight {

	@Id
	private Long pnr;
	private int flightNo;
	private String email;
	private String name;
	private int totalBooking;
	private String bookingStatus;
	private Date bookingDate;
	private Date sheduleDate;
	private String start;
	private String end;
	
	public UserFlight() {
		super();
	}


	public UserFlight(Long pnr, int flightNo, String email, String name, int totalBooking, String bookingStatus,
			Date bookingDate, Date sheduleDate, String start, String end) {
		super();
		this.pnr = pnr;
		this.flightNo = flightNo;
		this.email = email;
		this.name = name;
		this.totalBooking = totalBooking;
		this.bookingStatus = bookingStatus;
		this.bookingDate = bookingDate;
		this.sheduleDate = sheduleDate;
		this.start = start;
		this.end = end;
	}




	public Long getPnr() {
		return pnr;
	}


	public void setPnr(Long pnr) {
		this.pnr = pnr;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public int getTotalBooking() {
		return totalBooking;
	}


	public void setTotalBooking(int totalBooking) {
		this.totalBooking = totalBooking;
	}


	public int getFlightNo() {
		return flightNo;
	}


	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public Date getSheduleDate() {
		return sheduleDate;
	}


	public void setSheduleDate(Date sheduleDate) {
		this.sheduleDate = sheduleDate;
	}


	public String getStart() {
		return start;
	}


	public void setStart(String start) {
		this.start = start;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	@Override
	public String toString() {
		return "UserFlight [pnr=" + pnr + ", flightNo=" + flightNo + ", email=" + email + ", name=" + name
				+ ", totalBooking=" + totalBooking + ", bookingStatus=" + bookingStatus + ", bookingDate=" + bookingDate
				+ ", sheduleDate=" + sheduleDate + ", start=" + start + ", end=" + end + "]";
	}


	
	
	
	
}
