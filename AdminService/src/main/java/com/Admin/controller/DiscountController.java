package com.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Admin.entities.Discount;
import com.Admin.service.DiscountService;

@RestController
@RequestMapping("/api/v4")
@CrossOrigin(origins="http://localhost:4200")
public class DiscountController {

	@Autowired
	
	DiscountService service;
	
	@GetMapping("discounts")
	public List<Discount> findAllDiscounts()
	{
		return service.findAllDiscounts();
	}
	
	@PostMapping("discounts")
	public Discount saveDiscount(@RequestBody Discount disc)
	{
		return service.saveAll(disc);
	}
	
	@DeleteMapping("discounts/{id}")
	public String deleteFlight(@PathVariable int id) {
		service.deleteDiscount(id);
		return "deleted";
}
}
