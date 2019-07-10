package com.patient.demo;

public class Patient 
{
	

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String Street;
	public Patient(String name, String street, String city, String postalCode, String phone, String email) {
		
		this.name = name;
		Street = street;
		City = city;
		PostalCode = postalCode;
		this.phone = phone;
		this.email = email;
	}
	private String City;
	private String PostalCode;	
	private String phone;
	private String email;


	

	

}
