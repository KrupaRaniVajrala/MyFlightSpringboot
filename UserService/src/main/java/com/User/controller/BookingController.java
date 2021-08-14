package com.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.entities.BookingEntity;
import com.User.service.BookingService;

@RestController
@RequestMapping("api/v6/")
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	
	@Autowired
	private KafkaTemplate<String, BookingEntity> kafkaTemplate;
	
	private static final String TOPIC = "booking_topic";
	
	
	@Autowired
	BookingService service;
	
	@GetMapping("bookings")
	public List<BookingEntity> findAllBookings()
	{
		return service.findAllBookings();
	}
	
	@GetMapping("bookings/{id}")
	public BookingEntity findBookingById(@PathVariable int id)
	{
		return service.findBookingById(id);
	}
	@PostMapping("bookings")
	public BookingEntity saveBooking(@RequestBody BookingEntity book)
	{
//		return service.saveBooking(book);
		
		BookingEntity obj = service.saveBooking(book);
		kafkaTemplate.send(TOPIC, obj);
		return obj;
	}
	@DeleteMapping("bookings/{id}")
	public String deleteBooking(@PathVariable int id)
	{
		 return service.deleteBooking(id);
//		 return "deleted";
		 
	}
}
