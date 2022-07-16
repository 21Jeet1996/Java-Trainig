package com.userFlight.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Flight_Details")
public class SearchEntity {

	@Id
	@NotNull(message="this can't be null")
	private int flightNo;
	@NotEmpty(message="This field can't be empty")
	private String airline;
	@NotEmpty(message="This field can't be empty")
	private String start;
	@NotEmpty(message="This field can't be empty")
	private String end;
	//@NotEmpty(message="This field can't be empty")
	private Date startDate;
	@NotEmpty(message="This field can't be empty")
	private String startTime;
	//@NotEmpty(message="This field can't be empty")
	private Date endDate;
	@NotEmpty(message="This field can't be empty")
	private String endtTime;
	@NotEmpty(message="This field can't be empty")
	private String sheduleDay;
	@NotNull(message="This field can't be empty")
	private int bussinessSeat;
	@NotNull(message="This field can't be empty")
	private int nonBussinessSeat;
	@NotNull(message="This field can't be empty")
	private double price;
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getEndtTime() {
		return endtTime;
	}
	public void setEndtTime(String endtTime) {
		this.endtTime = endtTime;
	}
	public String getSheduleDay() {
		return sheduleDay;
	}
	public void setSheduleDay(String sheduleDay) {
		this.sheduleDay = sheduleDay;
	}
	public int getBussinessSeat() {
		return bussinessSeat;
	}
	public void setBussinessSeat(int bussinessSeat) {
		this.bussinessSeat = bussinessSeat;
	}
	public int getNonBussinessSeat() {
		return nonBussinessSeat;
	}
	public void setNonBussinessSeat(int nonBussinessSeat) {
		this.nonBussinessSeat = nonBussinessSeat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}