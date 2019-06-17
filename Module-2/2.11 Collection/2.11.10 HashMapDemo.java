package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Parth");
		hm.put(2, "Jay");
		hm.put(3, "Parth");
		hm.put(4, "Parth");
		hm.put(5, "Harsh");
		hm.put(5, "Parth");
		hm.put(5, "Dave");
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
		System.out.println("Keyset : - "+hm.keySet());;
		System.out.println("DAta at Given Key : -"+hm.get(2));
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(7, "RAj");
		System.out.println("My Map 2 : - "+hm1);
		hm1.putAll(hm);
		System.out.println("My Map 2 : - "+hm1);
	
		for(Map.Entry m:hm.entrySet()) {
			System.out.println("Value : - "+m.getValue());;
			System.out.println("Key : - "+m.getKey());;
		}
	}
}
