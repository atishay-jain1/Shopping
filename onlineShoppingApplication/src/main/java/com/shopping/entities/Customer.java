package com.shopping.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresslist;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(int customerId, String firstName, String lastName, String mobileNumber, String email,
			String password, List<Address> addresslist) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.addresslist = addresslist;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", password=" + password + ", addresslist="
				+ addresslist + "]";
	}
	 	
	
	
	

}
