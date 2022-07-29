package com.dissanayake.profileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dissanayake.profileservice.repository.CustomerRepository;
import com.dissanayake.rentcloud.rentcloud_commons.model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer fetchById(int profileID) {
		Optional<Customer> customer=customerRepository.findById(profileID);
		if (customer.isPresent()){
			return customer.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Customer> fetchAllProfiles() {
		return customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	

}
