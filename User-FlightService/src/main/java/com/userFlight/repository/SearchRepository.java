package com.userFlight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.userFlight.entity.SearchEntity;

public interface SearchRepository extends JpaRepository<SearchEntity,Integer>{
	
	@Query(value="select f from SearchEntity f where f.start=?1 and f.end=?2",nativeQuery=false)
	public List<SearchEntity> findByStartEnd(String start,String end);
	
	

}
