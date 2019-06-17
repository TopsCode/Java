package com.stringclass;

public class StringPractical {
	public static void main(String[] args) {
//		String s1="TOPS_Maninagar";
//		s1.charAt(3);
//		System.out.println(s1.charAt(3));
//		
	//	String s2="TOPS Maninagar";
//		char ch[]= new char[5];
//		s2.getChars(0, 5, ch, 0);
//		System.out.println(ch);
		
		//System.out.println(s2.length());
		
//		String s3="hello";
//		System.out.println(s3.toUpperCase());

//				String s4="HELLO";
//		System.out.println(s4.toLowerCase());
		
//		String s5="TOPS";
//		String s6=s5.concat("maninagar");
//		System.out.println(s6);
		
//		String s7="TOPS";
//		s7.replace('O', 'o');
//		System.out.println(s7.replace('O', 'o'));
		
//		String s8 = "			TOPS Maninagar 		";
//		System.out.println(s8);
//		s8.trim();
//		System.out.println(s8.trim());
		
		String s9="TOPS@Maninagar";
		String s[]=s9.split("@");
//		System.out.println(s9.split("@", 3));
		for(String ss:s) {
			System.out.println(ss);
		}
	}
}
