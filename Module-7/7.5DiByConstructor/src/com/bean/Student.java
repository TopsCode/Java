package com.bean;

public class Student {

	private String fname,lname,email;
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public String toString() {
		return "Fname : "+fname+" Lname : "+lname+" EMail : "+email;
	}
	
}
