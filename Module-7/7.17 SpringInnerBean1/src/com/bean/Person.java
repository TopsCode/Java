package com.bean;

public class Person {
	
	private Phone phone;
	
	public Person(Phone phone) {
		this.phone=phone;
	}
	public void callPhone() {
		System.out.println("In callPhone ...");
		phone.call();
	}
}
