package com.bean;

public class Phone {
	
	private String pno;

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}
	
	void call() {
		System.out.println("From Call , Phone Class  = "+pno);
	}
}
