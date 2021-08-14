package com.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.entities.passenger;

@Repository
public interface PassengerRepository extends JpaRepository<passenger, Integer> {

}
