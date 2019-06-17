package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.add("TOPS");
		s.add(10);
		s.add('H');
		System.out.println(s);
		System.out.println(s.push("TOPS-1"));
		System.out.println(s);
//							// remove last element
		System.out.println(s.pop());;
		System.out.println(s);
//						// read last element		
	System.out.println(s.peek());
		System.out.println(s);
	}
}
