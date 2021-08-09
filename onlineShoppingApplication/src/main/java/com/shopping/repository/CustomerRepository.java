package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
