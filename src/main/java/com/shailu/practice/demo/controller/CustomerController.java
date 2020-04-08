package com.shailu.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String welcome(Model model) {
        model.addAttribute("message", message);
        return "welcome"; //view
    }
	
	@RequestMapping("/register")
    public String register(Model model) {
		Customer customer = new Customer();
		model.addAttribute(customer);
        return "registration"; //view
    }

	
	@RequestMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer customer) {
		customerService.saveCustomer(customer);
		return "success";
		
	}
}