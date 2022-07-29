package com.dissanayake.profileservice.service;

import com.dissanayake.rentcloud.rentcloud_commons.model.Customer;

import java.util.List;

public interface CustomerService {

	Customer save(Customer customer);

	Customer fetchById(int profileID);

	List<Customer> fetchAllProfiles();
}
