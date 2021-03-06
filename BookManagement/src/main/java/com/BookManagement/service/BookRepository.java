package com.BookManagement.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BookManagement.Entity.BookEntity;


public interface BookRepository extends JpaRepository<BookEntity, Integer>{

	@Query(value="select b from BookEntity b where b.price>?1", nativeQuery=false)
	public List<BookEntity> findByPrice(Double price);
}
