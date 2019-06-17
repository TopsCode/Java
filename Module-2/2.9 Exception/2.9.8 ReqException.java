package com.exception;

public class ReqException {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.exception.Demo1.main(Demo1.java:8)
		c=a/b;
		System.out.println(c);
		System.out.println("Bye..");
	}
}
