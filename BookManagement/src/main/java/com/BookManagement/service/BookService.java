package com.BookManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BookManagement.Entity.BookEntity;

@Service
public class BookService implements IBookService{
																																																												
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public BookEntity addBook(BookEntity book) {
		return bookRepository.save(book);
	}
	
	public List<BookEntity> findByPrice(Double price){
	
		
		return bookRepository.findByPrice(price);
	}
	
	public List<BookEntity> getBook(){
		
		return bookRepository.findAll();
	}
	public BookEntity getById(int id){
		
		return bookRepository.findById(id).get();
	}
	public void deleteBookById(int id) {
		bookRepository.deleteById(id);
	}
	
	
}
