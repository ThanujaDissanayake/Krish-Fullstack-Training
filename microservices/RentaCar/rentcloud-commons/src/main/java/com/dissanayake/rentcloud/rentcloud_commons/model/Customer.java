package com.dissanayake.rentcloud.rentcloud_commons.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String firstName;
	String lastName;
	String dlNumber;
	String ziCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}
	public String getZiCode() {
		return ziCode;
	}
	public void setZiCode(String ziCode) {
		this.ziCode = ziCode;
	}
	
	
}
