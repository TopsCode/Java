package com.basic;

import java.util.Scanner;

public class ArrayInputOutput {
	public static void main(String[] args) {
		
		int A[] = new int[6];
		System.out.println("Enter 10 Numbers : - " );
		
		for(int i=0;i<5;i++) {
			Scanner sc=new Scanner(System.in);
			A[i]=sc.nextInt();
		}
		
		
//		for(int i=0;i<5;i++) {
//			System.out.println("My Array is : - "+A[i]+"  "+i);
//		}
		
		int B[] = new int[10];
		System.arraycopy(A, 2, B, 0, 4);
		
		for(int i=0;i<B.length;i++) {
			System.out.println("My Array is : - "+B[i]+"  "+i);
		}
	}
}
