package com.basic;

class Test {
	void display(int i) {
		System.out.println("From TEst Class : - "+i);
	}
}
public class ArrayWithObject {
	public static void main(String[] args) {
		Test t[];
		t = new Test[5];
		
		for(int i=1;i<5;i++) {
			t[i]=new Test();
			t[i].display(i);
		}
	}
}
