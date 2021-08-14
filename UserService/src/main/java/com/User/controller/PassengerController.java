package com.User.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.entities.passenger;
import com.User.service.PassengerService;
@RestController
@RequestMapping("api/v5")
@CrossOrigin(origins = "http://localhost:4200")
public class PassengerController {
	
	PassengerService service;

	@GetMapping("passengers")
	public List<passenger> findAllPassengers()
	{
		return service.findAllPassengers();
	}

	@GetMapping("passengers/{id}")
	public passenger findPassengerById(@PathVariable int id)
	{
		return service.findPassengerById(id);
	}
	
	@PostMapping("passengers")
	public passenger savePassenger(@RequestBody passenger pass)
	{
		return service.savePassenger(pass);
	}
}
