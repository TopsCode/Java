package com.bean;

public class Person {
	
	private String name;
	private Phone phone;
	
	public Person(Phone phone,String name) {
		this.name=name;
		this.phone=phone;
		System.out.println("Inside Person's Constructor...");
	}
	public void callPhone() {
		System.out.println(name+" Calling...");
		phone.call();
	}
}
