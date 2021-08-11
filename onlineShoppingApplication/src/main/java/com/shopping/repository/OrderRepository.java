package com.shopping.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.Address;
import com.shopping.entities.Order;
import com.shopping.entities.User;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	public List<Order> findByOrderDate(LocalDate date);

	public List<Order> findByAddress(Address address);

	public List<Order> findByUser(User user);
}
