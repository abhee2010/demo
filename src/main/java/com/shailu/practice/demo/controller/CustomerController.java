package com.shailu.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shailu.practice.demo.entity.Customer;
import com.shailu.practice.demo.service.CustomerService;

@Controller
@RequestMapping("/home")
public class CustomerController {

	@Value("${welcome.message}")
    private String message;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/welcome")
    public String main(Model model) {
        model.addAttribute("message", message);
        return "welcome"; //view
    }
	
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