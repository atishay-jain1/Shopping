package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shopping.entities.Address;
import com.shopping.repository.AddressRepository;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	@Qualifier("addressRepository")
	@Autowired
	private AddressRepository addressRepository;
	


	@Override
	public Address addAddress(Address add) {
		Address a1 = addressRepository.save(add);
		return a1;
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		return addressRepository.save(add);
	}

	@Override
	public void removeAddress(Address add) {
		addressRepository.delete(add);
	}

	@Override
	public List<Address> viewAllAddress() {
		List<Address> l1 = addressRepository.findAll();
		return l1;
	}

	@Override
	public Address viewAddress(Address add) {
		// TODO Auto-generated method stub
		return add;
	}
}
