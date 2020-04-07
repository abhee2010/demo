package com.shailu.practice.demo.service;

import java.util.List;

import com.shailu.practice.demo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public Customer saveCustomer(Customer c);

}
