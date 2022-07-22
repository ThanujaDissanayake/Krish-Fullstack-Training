package com.dissanayake.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dissanayake.rentcloud.rentcloud_commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
