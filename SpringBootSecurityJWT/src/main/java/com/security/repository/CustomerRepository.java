package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.entity.CoustomerEntity;

public interface CustomerRepository extends JpaRepository<CoustomerEntity,Integer>{

}
