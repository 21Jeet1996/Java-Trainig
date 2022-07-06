package com.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flight.entity.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity,Integer> {
//	
//	@Query(value="update FlightEntity f set f.flightStatus=?2 where f.flightNo=?1",nativeQuery=false)
//	public FlightEntity updateById(int flightNo, String flightStatus);

}
