package com.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.entities.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>{

	Optional<BookingEntity> findById(int id);

	
	
}
