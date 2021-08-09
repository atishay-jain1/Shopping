package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopping.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

	
}
