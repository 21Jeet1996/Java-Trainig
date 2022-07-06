package com.flight.entity;



import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Flight_Details")
public class FlightEntity {

	
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
	private String flightStatus="RUNNING";
	
	
	public FlightEntity() {
		super();
	}
	public FlightEntity(int flightNo, String airline, String start, String end, Date startDate, String startTime,
			Date endDate, String endtTime, String sheduleDay, int bussinessSeat, int nonBussinessSeat, double price,String flightStatus ) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.start = start;
		this.end = end;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endtTime = endtTime;
		this.sheduleDay = sheduleDay;
		this.bussinessSeat = bussinessSeat;
		this.nonBussinessSeat = nonBussinessSeat;
		this.price = price;
		this.flightStatus=flightStatus;
	}
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
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	@Override
	public String toString() {
		return "FlightEntity [flightNo=" + flightNo + ", airline=" + airline + ", start=" + start + ", end=" + end
				+ ", startDate=" + startDate + ", startTime=" + startTime + ", endDate=" + endDate + ", endtTime="
				+ endtTime + ", sheduleDay=" + sheduleDay + ", bussinessSeat=" + bussinessSeat + ", nonBussinessSeat="
				+ nonBussinessSeat + ", price=" + price + ", flightStatus=" + flightStatus + "]";
	}
	
	
	
	
	
}

	
	
	