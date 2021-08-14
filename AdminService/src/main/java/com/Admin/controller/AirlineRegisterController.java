package com.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Admin.entities.AirlineRegisterEntity;
import com.Admin.exception.airlineNotFoundException;
import com.Admin.service.AirlineRegisterService;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins="http://localhost:4200")
public class AirlineRegisterController {

	@Autowired
	AirlineRegisterService service;
	
	@GetMapping("airlines")

	public List<AirlineRegisterEntity> findAllAirlines()
	{	
		System.out.println("All Airlines from DB");
		return service.findAllAirlines();
	}
	@SuppressWarnings("finally")
	@GetMapping("airlines/{id}")

	public AirlineRegisterEntity findAirlineById(@PathVariable long id) throws airlineNotFoundException
	{
		System.out.println("Airline from DB");
		
			try
			{
				return service.findAirlineById(id);
			} 
			catch (airlineNotFoundException e) 
			{
				throw new airlineNotFoundException("Airline with mentioned ID not found");
			}
		}
		
	
	@PostMapping("airlines")
	public AirlineRegisterEntity saveAirline(@RequestBody AirlineRegisterEntity airline)
	{
		return service.saveAirline(airline);
	}
	@DeleteMapping("airlines/{id}")
	public String deleteAirline(@PathVariable long id)
	{
		service.deleteAirline(id);
		return "deleted";
	}
}

