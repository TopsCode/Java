package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ListSetTEst {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("TOPS");
		al.add('H');
		al.add(10);
		al.add(7);
		System.out.println(al);
		
		HashSet hs = new HashSet<>(al);
		// insertion order is not maintain
		System.out.println(hs);
	}
}
