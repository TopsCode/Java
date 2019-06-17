package com.exception;

public class MultiCatchFinally {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c;
			//System.exit(0);
			c=a/b;
			System.out.println(c);
			System.exit(0);
			int num[]= {10,10,100,20};
			System.out.println("Array "+num[2]);
		}catch(ArithmeticException e){
			System.out.println("your data is inVAlid DAta");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("you cross limit");
		}finally {
			System.out.println("Must execute ");
		}
		System.out.println("Bye");
	}
}
