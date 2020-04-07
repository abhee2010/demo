package com.shailu.practice.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.shailu.practice.demo.entity.Customer;
import com.shailu.practice.demo.repository.CustomerRepository;

@Repository
@Qualifier("SpringDataJPA")
public class CustomerDAOSpringDataJPAImpl implements CustomerDAO {

	@Autowired 
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer saveCustomer(Customer c) {
		Customer customer = customerRepository.save(c);
		return customer;
	}

}