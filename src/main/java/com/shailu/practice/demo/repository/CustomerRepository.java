package com.shailu.practice.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.shailu.practice.demo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
