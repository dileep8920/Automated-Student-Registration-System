package com.masai.model;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String email;
	private String passward;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, String email, String passward) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.passward = passward;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", passward="
				+ passward + "]";
	}

	



}
