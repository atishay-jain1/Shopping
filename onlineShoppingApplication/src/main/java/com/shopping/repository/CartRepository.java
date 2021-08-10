package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Cart;
import com.shopping.entities.Product;

public interface CartRepository extends JpaRepository<Cart, Integer> {


	
	
}
