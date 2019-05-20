package com.online.store.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.store.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
	
	public Optional<Customer> findByEmailAddress(String emailAddress);
}
