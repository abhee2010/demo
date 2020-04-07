package com.shailu.practice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shailu.practice.demo.dao.CustomerDAO;
import com.shailu.practice.demo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired 
	@Qualifier("SpringDataJPA")
	private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDAO.getCustomers();
		return customers;
	}

	@Override
	public Customer saveCustomer(Customer c) {
		Customer customer = customerDAO.saveCustomer(c);
		return customer;
	}

}
