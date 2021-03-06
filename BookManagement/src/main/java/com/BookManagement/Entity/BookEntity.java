package com.BookManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="BookDetails")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message="This field can't be empty")
	private String tital;
	
	@NotEmpty(message="This field can't be empty")
	private String author;
	
	//@NotNull(message="This field can't be null")
	private Double price;
	
	
	public BookEntity() {
		super();
	}


	public BookEntity(int id, String tital, String author, Double price) {
		super();
		this.id = id;
		this.tital = tital;
		this.author = author;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTital() {
		return tital;
	}


	public void setTital(String tital) {
		this.tital = tital;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
