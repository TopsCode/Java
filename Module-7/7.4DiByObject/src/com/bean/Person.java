package com.bean;

public class Person {

	String pname;
	Phone phone;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public void callPhone() {
		System.out.println("Calling.........");
		phone.call();
	}
}
