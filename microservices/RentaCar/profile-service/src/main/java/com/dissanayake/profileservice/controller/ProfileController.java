package com.dissanayake.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dissanayake.profileservice.service.CustomerService;
import com.dissanayake.rentcloud.rentcloud_commons.model.Customer;

@RestController
@RequestMapping("/services")
public class ProfileController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/profile",method=RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
}
