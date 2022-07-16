package com.userFlight.error.model;

import java.time.LocalDateTime;

public class ErrorMessage {
	 private String message;
	 private LocalDateTime time;
	 private String exception;
	 
	public ErrorMessage(String message, LocalDateTime time, String exception) {
		super();
		this.message = message;
		this.time = time;
		this.exception = exception;
	}

	public ErrorMessage() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "ErrorMessage [message=" + message + ", time=" + time + ", exception=" + exception + "]";
	}
	 
	 
}
