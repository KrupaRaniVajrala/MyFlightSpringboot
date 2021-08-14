package com.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Admin.entities.Discount;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer>{

}
