package com.bean;

public class Phone {

	
	String pno;
	public Phone() {
		System.out.println("Phone's Constructor");
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public void call()
	{
		System.out.println("Calling Number : "+pno);
	}
	
}
