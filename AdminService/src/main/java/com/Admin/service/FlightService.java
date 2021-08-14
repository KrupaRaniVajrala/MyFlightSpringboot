package com.Admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.Admin.entities.AirlineRegisterEntity;
import com.Admin.entities.FlightEntity;
import com.Admin.repository.AirlineRegisterRepository;
import com.Admin.repository.FlightRepository;


@Service
public class FlightService {

	@Autowired

	FlightRepository repository;

	public List<FlightEntity> findAllFlights() {
		return repository.findAll();
	}

	public FlightEntity findFlightById(long id) {
		System.out.println("Id in service" + id);
		Optional<FlightEntity> flight = repository.findById(id);
		if (flight.isPresent())
			return flight.get();

		else
			return null;

	}

	public FlightEntity saveFlight(FlightEntity flight) {
		return repository.save(flight);
	}

	public FlightEntity updateFlight(FlightEntity flight) {
		return repository.save(flight);
	}

	public void deleteFlight(long id) {
		repository.deleteById(id);
	}
	public List<FlightEntity> searchFlight(String fromLoc,String toLoc,String scheduleTime)
	{
		return repository.searchFlight(fromLoc, toLoc, scheduleTime);
	}
	
}
