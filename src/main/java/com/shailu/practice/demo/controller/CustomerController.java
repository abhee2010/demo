package com.shailu.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.shailu.practice.demo.entity.Customer;
import com.shailu.practice.demo.repository.CustomerRepository;
import com.shailu.practice.demo.service.CustomerService;

@RestController
@RequestMapping("/home")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
		
	}
	
	@RequestMapping("/saveCustomer")
	public Customer saveCustomer(Customer c) {
		Customer customer = customerService.saveCustomer(new Customer("Arshabh", "Soni"));
		return customer;
		
	}
}