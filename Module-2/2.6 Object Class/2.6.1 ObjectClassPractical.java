package com.objectclass;

public class ObjectClassPractical {
	int a=10;
	public static void main(String[] args) {
		ObjectClassPractical d = new ObjectClassPractical();
		System.out.println(d.toString());
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		if(s1==s2) {
			System.out.println("True");
		}
		if(s1.equals(s3)) {
			System.out.println("True");
		}
		if(s1==s3) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
