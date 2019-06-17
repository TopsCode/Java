package com.wrapperclass;

public class WrapperPractical {
	static int a=10;
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		System.out.println(i1);
		System.out.println(a);
		Float f = new Float(10.101);
		System.out.println(f);
		boolean b = true;
		if(b==true) {
			System.out.println("TRue");
		}
		// unboxing and autoboxing
		Integer i = new Integer(25);
		System.out.println("Object = "+i);
		int k = i.intValue();
		System.out.println("VAlue = "+k);
	}
}
