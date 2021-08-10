package com.shopping.service;

import java.util.List;

import com.shopping.entities.Address;

public interface AddressService {
	
	public Address addAddress(Address add);
	public Address updateAddress(int addressId, Address add);
	public void removeAddress(Address add);
	public List<Address> viewAllAddress();
	public Address viewAddress(int addressId);
}
