package com.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Admin.entities.FlightEntity;
import com.Admin.service.FlightService;


@RestController
@RequestMapping("api/v2/")

@CrossOrigin(origins="http://localhost:4200")
public class FlightController {

	@Autowired
	FlightService service;

	@GetMapping("flights")
	public List<FlightEntity> findAllFlights() {
		System.out.println("All Available Flights");

		return service.findAllFlights();
	}

	@GetMapping("flights/{id}")
	public FlightEntity findFlightById(@PathVariable int id) {
		return service.findFlightById(id);
	}

	@PostMapping("flights")
	public FlightEntity saveFlight(@RequestBody FlightEntity flight) {
		System.out.println("Flight details saved" + flight);
		return service.saveFlight(flight);
	}

	@DeleteMapping("flights/{id}")
	public String deleteFlight(@PathVariable long id) {
		service.deleteFlight(id);
		return "deleted";
	}
	
	@PutMapping("updateFlights")
	public FlightEntity updateFlight(@RequestBody FlightEntity obj){
		System.out.println("Flight details updated" + obj);
		return service.saveFlight(obj);
	}
	
	@GetMapping("flights/search")
	public List<FlightEntity> searchFlight(@RequestParam String fromLoc,@RequestParam String toLoc,@RequestParam String scheduleTime)
	{
		System.out.println("from"+fromLoc+"to"+toLoc);
		return service.searchFlight(fromLoc,toLoc,scheduleTime);
	}
			
}

