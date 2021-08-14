package com.Admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Admin.entities.FlightEntity;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long>{

//	FlightEntity searchFlight1(String fromLoc, String toLoc, String scheduleTime);
	
	@Query("SELECT u FROM FlightEntity u WHERE u.fromLoc = ?1 AND u.toLoc = ?2 AND u.scheduleTime = ?3")
	List<FlightEntity> searchFlight(String fromLoc, String toLoc, String scheduleTime);
}
