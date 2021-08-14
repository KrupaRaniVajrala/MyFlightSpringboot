package com.User.service;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.User.entities.BookingEntity;
import com.User.repository.BookingRepository;
@Service
public class BookingService {
@Autowired
	BookingRepository repository;
	
	public List<BookingEntity> findAllBookings()
	{
		return repository.findAll();
	}
	public BookingEntity findBookingById(int id)
	{
		System.out.println("Id in service" + id);
		Optional<BookingEntity> book = repository.findById(id);
		if (book.isPresent())
			return book.get();

		else
			return null;
	}
	public BookingEntity saveBooking(BookingEntity book)
	{
		return repository.save(book);
	}
	public String deleteBooking(int id)
	{
		if(repository.existsById(id)){
			repository.deleteById(id);
			return "deleted";
		}
		else
			return "deletion not done";
		
	}
	
}
