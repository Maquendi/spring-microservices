package com.online.store.model;

import java.util.List;

public class Customers {

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public Customers() {
		
	}
	
	public Customers(List<Customer> customerList) {
		this.customers = customerList;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Customers [customers=" + customers + "]";
	}
	

}
