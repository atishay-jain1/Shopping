package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entities.Order;
import com.shopping.service.OrderService;


@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("/orders")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		return ResponseEntity.status(HttpStatus.CREATED).body(orderService.addOrder(order));
	}

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> viewAllOrder() {
		return ResponseEntity.ok(orderService.viewAllOrder());
	}

	@GetMapping("/orders/{orderId}")
	public ResponseEntity<Order> viewOrder(@PathVariable("orderId") int orderId) {
		return ResponseEntity.ok(orderService.viewOrder(orderId));
	}

	

	@PutMapping("/orders/{orderId}")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order,
			@PathVariable("orderId") int orderId) {
		return ResponseEntity.ok(orderService.updateOrder(orderId, order));
	}

	@DeleteMapping("/orders/{orderId}")
	public ResponseEntity<Order> removeOrder(@PathVariable("orderId") int orderId) {
		return ResponseEntity.ok(orderService.removeOrder(orderId));
	}
}
