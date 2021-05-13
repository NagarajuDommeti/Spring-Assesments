package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.beans.Customer;

@Configuration
public class MyConfig {

	@Bean
	@Scope(value = "singleton")
	public Customer cust()
	{
		return new Customer();
	}
}
