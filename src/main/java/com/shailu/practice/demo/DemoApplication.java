package com.shailu.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello again");
		SpringApplication.run(DemoApplication.class, args);
	}

}
