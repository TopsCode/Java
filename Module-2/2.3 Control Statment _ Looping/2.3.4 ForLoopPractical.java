package com.basic;

public class ForLoopPractical {
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		ForLoopPractical d = new ForLoopPractical();
		d.display();
		for(int a=1;a<=10;a++) {
			if(a==7) {
				break;
			}
			System.out.println("TOPS - "+a);
		}
		System.out.println("After LOOP");
		System.out.println("TOPS");
	}
}
