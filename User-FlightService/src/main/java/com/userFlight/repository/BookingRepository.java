package com.userFlight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.userFlight.entity.SearchEntity;
import com.userFlight.entity.UserEntity;

public interface BookingRepository extends JpaRepository<UserEntity,Long>{
	
	@Query(value="select u from UserEntity u where u.email=?1 ",nativeQuery=false)
	public List<UserEntity> findByEmail(String email);
	
	@Query(value="update UserEntity u set u.bookingStatus=CNACEL where u.pnr=?1",nativeQuery=false)
	public String cancelTicket(Long pnr);
}
