package com.exception;

import java.util.Scanner;

public class ThrowsPractical {
public static void data() throws Exception {
		
			int a;
			System.out.println("Enter Numbner = ");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			if(a>0) {
				System.out.println("Squre of A is = "+a*a);
			}else {
				throw new Exception();
			}
	}
	public static void main(String[] args) throws Exception {
		try {
			data();
		} catch (Exception e) {
			System.out.println("Enter Positive Number only");
			data();
		}
	}
}
