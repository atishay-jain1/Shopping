package com.shopping.service;


import com.shopping.entities.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(int orderId, Order order);
	public Order removeOrder(int orderId);
	public Order viewOrder(int orderId);
	
}
