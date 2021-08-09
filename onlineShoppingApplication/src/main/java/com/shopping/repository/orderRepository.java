package com.shopping.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Order;

public interface orderRepository extends JpaRepository<Order, Integer>{

}
