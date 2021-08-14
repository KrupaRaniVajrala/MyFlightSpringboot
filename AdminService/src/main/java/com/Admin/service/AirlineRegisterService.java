package com.Admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admin.entities.AirlineRegisterEntity;
import com.Admin.exception.airlineNotFoundException;
import com.Admin.repository.AirlineRegisterRepository;


@Service
public class AirlineRegisterService {

	@Autowired
	AirlineRegisterRepository repository;
	
	public List<AirlineRegisterEntity> findAllAirlines()
	{
		return repository.findAll();
	}
	public AirlineRegisterEntity findAirlineById(long id) throws airlineNotFoundException
	{
		System.out.println("Id in service" + id);
		Optional<AirlineRegisterEntity> airline = repository.findById(id);
		if (airline.isPresent())
			return airline.get();

		else
			throw new airlineNotFoundException("Airline with requested ID"+id+"is not found");
//			return null;
	}
	public AirlineRegisterEntity saveAirline(AirlineRegisterEntity airline)
	{
		return repository.save(airline);
	}
	public void deleteAirline(long id)
	{
		repository.deleteById(id);
	}
}
