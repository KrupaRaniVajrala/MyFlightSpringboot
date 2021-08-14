package com.User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.entities.UserInfoEntity;
import com.User.entities.passenger;
import com.User.repository.PassengerRepository;

@Service
public class PassengerService {
	@Autowired
	PassengerRepository repository;

	public List<passenger> findAllPassengers()
	{
		return repository.findAll();
		
	}
	
	public passenger findPassengerById(int id)
	{
		Optional<passenger> user = repository.findById(id);
		if (user.isPresent())
			return user.get();
		else
			return null;
	}
	public passenger savePassenger(passenger pass)
	{
		return repository.save(pass);
	}
	

}


