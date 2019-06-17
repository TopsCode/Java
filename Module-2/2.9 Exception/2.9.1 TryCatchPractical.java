package com.exception;

import java.util.Scanner;

public class TryCatchPractical {
	public static void data() {
		
		try {
			int a;
			System.out.println("Enter Numbner = ");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			if(a>0) {
				System.out.println("Squre of A is = "+a*a);
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Enter Positive Number only");
			data();
		}
	}
	public static void main(String[] args) {
		data();
	}
}
