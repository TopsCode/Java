package com.bean;

public class Person {
	
	private Phone phone;
	private String fname;

	public Person(Phone phone,String fname) {
		this.phone=phone;
		this.fname=fname;
	}
	
	
	public void display() {
		System.out.println("From Display...");
		System.out.println("I am "+fname);
		phone.call();
	}
}
