package com.collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("TOPS");
		hs.add('H');
		hs.add(10);
		hs.add(10);
		hs.add(10);
		System.out.println(hs);
	}
}
