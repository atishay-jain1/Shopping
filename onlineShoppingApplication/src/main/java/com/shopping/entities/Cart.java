
package com.shopping.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private String userId;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Cart(int cartId, String userId, List<Product> products) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.products = products;
	}
	public Cart() {
		
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", products=" + products + "]";
	}
	
	
}