package com.online.store.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.store.model.Customer;
import com.online.store.model.Customers;
import com.online.store.serviceImpl.CustomerService;
import com.online.store.services.IBaseService;

@RestController
@RequestMapping("/customer")
public class CustomerRegistrationController {
	
	@Autowired
	private IBaseService<Customer> customerService;
	
	@GetMapping("/all")
	public Customers getAllCustomers() {
		return new Customers(customerService.findAll());
	}
	
	@PostMapping("/add")
	public Customer save(@RequestBody final Customer customer) {
		return customerService.persist(customer);
	}
	
	
	@PostMapping("/delete")
	public Customer delete(@RequestBody final Customer customer) {
		return customerService.delete(customer);
	}
	
	@PostMapping("/email/{emailAddress}")
	public Customer findByEmail(@PathVariable("emailAddress") final String email) {
		return ((CustomerService)customerService).findByEmailAddress(email);
	}
	
	@PostMapping("/{customerId}")
	public Customer findById(@PathVariable final long customerId) {
		return customerService.findById(customerId);
	}
	
	@GetMapping("/todo")
	public List<Customer> findAllCustomers() {
		return new ArrayList<Customer>();
	}
	
	
	

}
