package com.BookManagement.exception;

public class BookNotFoundException extends Exception{
	
	public BookNotFoundException() {}
	public BookNotFoundException(String message) {
		super(message);
	}
	public BookNotFoundException(Exception e) {
		super(e);
	}
	public BookNotFoundException(String s,Exception e) {
		super(s,e);
	}
}
