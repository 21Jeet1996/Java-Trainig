package com.BookManagement.globalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.BookManagement.exception.BookNotFoundException;
import com.BookManagement.model.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorMessage> excepctionHandler(BookNotFoundException e){
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(e.getMessage(),
						LocalDateTime.now(),
						e.getClass().toString()),
				HttpStatus.OK
				);
	}
}
