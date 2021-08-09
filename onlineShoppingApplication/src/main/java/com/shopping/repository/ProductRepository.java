package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
