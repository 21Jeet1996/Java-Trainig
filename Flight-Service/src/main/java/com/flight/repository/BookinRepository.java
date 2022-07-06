package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.BookingEntity;

public interface BookinRepository extends JpaRepository<BookingEntity,Long>{

}
