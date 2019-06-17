package com.bean;

public class Phone {
	
	private String pno;
	
	
	public Phone( ) {
		System.out.println("From Phone's Constructor...");
	}
	public Phone(String pno ) {
		this.pno=pno;
		System.out.println("From Phone's Constructor with One Parameter...");
	}
	
	void call() {
		System.out.println("From Call , Phone Class"+pno);
	}
}
