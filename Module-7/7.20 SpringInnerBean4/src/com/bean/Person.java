package com.bean;

public class Person {
	
	private String name;
	private Phone phone;
	
	public Person(Phone phone,String name) {
		this.phone=phone;
		this.name=name;
		System.out.println("Inside Person Constructor...");
	}
	public void callPhone() {
		System.out.println(name+" is Calling...");
		phone.call();
	}
	
	
	
	
}
