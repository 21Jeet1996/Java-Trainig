package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flight.entity.BookingEntity;

public interface BookinRepository extends JpaRepository<BookingEntity,Long>{
	
	//@Query(value="update BookingEntity u set u.bookingStatus=CNACEL where f.pnr=?1",nativeQuery=false)
	//public String cancelTicket(int pnr);
}
