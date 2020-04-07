package com.shailu.practice.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shailu.practice.demo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public Customer saveCustomer(Customer c);
}
