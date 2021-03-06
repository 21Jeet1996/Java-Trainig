package com.BookManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookManagement.Entity.BookEntity;
import com.BookManagement.exception.BookNotFoundException;
import com.BookManagement.service.BookRepository;
import com.BookManagement.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String welcome() {
		return "Hello World!";
	}
	
	@PostMapping("/books")
	public BookEntity addBook(@RequestBody BookEntity book) {
		bookService.addBook(book);
		return book;
		
	}
	
	@GetMapping("/books")
	List<BookEntity> getBook() throws BookNotFoundException{
		return bookService.getBook();
	}
	
	
	@GetMapping("/books/{price}")
	public List<BookEntity> getByPrice(@PathVariable Double price) throws BookNotFoundException{
		return bookService.findByPrice(price);
	}
	
	@DeleteMapping("/books")
	public void deleteById(@PathVariable int id) {
		bookService.deleteBookById(id);
	}
	
	/*@GetMapping("/books/{id}")
	public BookEntity getByPrice(@PathVariable int id){
		return bookService.getById(id);
	}*/
	
	
	
}
