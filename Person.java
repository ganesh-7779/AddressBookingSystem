package com.bridgelabz;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String pinCode;
	private String phoneNumber;
	private String emailID;

	public Person(String firstName, String lastName, String address, String city, String state, String pinCode,
			String phoneNumber, String emailID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPincode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailID;
	}

	public void setEmailId(String emailId) {
		this.emailID = emailId;
	}

	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", phoneNumber=" + phoneNumber + ", emailId=" + emailID + "]";
	}

}