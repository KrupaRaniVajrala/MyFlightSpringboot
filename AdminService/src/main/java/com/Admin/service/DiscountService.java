package com.Admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admin.entities.Discount;
import com.Admin.repository.DiscountRepository;

@Service
public class DiscountService {
	
	@Autowired
	DiscountRepository repository;
	
	public List<Discount> findAllDiscounts()
	{
		return repository.findAll();
	}
	public Discount saveAll(Discount disc)
	{
		return repository.save(disc);
	}
	public void deleteDiscount(int id) {
		repository.deleteById(id);
	}
	
}
