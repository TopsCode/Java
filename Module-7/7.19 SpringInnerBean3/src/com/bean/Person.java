package com.bean;

public class Person {
	
	private Phone phone;
	private String fname;

	
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public void display() {
		System.out.println("From Display...");
		System.out.println("I am "+fname);
		phone.call();
	}
}
