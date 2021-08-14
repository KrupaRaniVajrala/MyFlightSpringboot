package com.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Admin.entities.AirlineRegisterEntity;

@Repository
public interface AirlineRegisterRepository extends JpaRepository<AirlineRegisterEntity, Long>{
	
}
