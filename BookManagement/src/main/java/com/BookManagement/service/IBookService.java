package com.BookManagement.service;

import java.util.List;

import com.BookManagement.Entity.BookEntity;
import com.BookManagement.exception.BookNotFoundException;

public interface IBookService {
	
	public BookEntity addBook(BookEntity book);
	
	public List<BookEntity> getBook();
	public List<BookEntity> findByPrice(Double price) throws BookNotFoundException;
	public BookEntity getById(int id) throws BookNotFoundException;
}
