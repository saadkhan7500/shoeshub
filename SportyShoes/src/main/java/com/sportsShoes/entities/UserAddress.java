package com.sportsShoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message="address shouldn't be blank or null")
	private String address;
	
	@NotBlank(message="zipcode shouldn't be blank or null")
	private String zipCode;
	
	@NotBlank(message="city shouldn't be blank or null")
	private String city;
	
	@NotBlank(message="state shouldn't be blank or null")
	private String state;
	
	@NotBlank(message="country shouldn't be blank or null")
	private String country;
	
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAddress(int id, String address, String zipCode, String city, String state, String country) {
		super();
		this.id = id;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", address=" + address + ", zipCode=" + zipCode + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
	
	
	
}
