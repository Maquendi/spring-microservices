package com.online.store.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.store.model.Customer;
import com.online.store.repository.ICustomerRepository;
import com.online.store.services.IBaseService;

@Service
public class CustomerService implements IBaseService<Customer> {

	@Autowired
	private ICustomerRepository repository;
	
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Customer persist(Customer entity) {
		return repository.save(entity);
	}

	@Override
	public Customer modify(Customer entity) {
		return repository.save(entity);
	}

	@Override
	public Customer delete(Customer entity) {
	   repository.delete(entity);
	   return entity;
	}

	@Override
	public Customer findById(long id) {
		return repository.findById(id).get();
	}
	
	public Customer findByEmailAddress(final String email) {
		return repository.findByEmailAddress(email).get();
	}

}
