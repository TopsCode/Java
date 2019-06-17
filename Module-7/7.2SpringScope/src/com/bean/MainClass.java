package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s1=(Student) a.getBean("s1");
		s1.setFname("Krupa");
		s1.setLname("Mistry");
		s1.setEmail("krupa@gmail.com");
		
		System.out.println("Fname : "+s1.getFname());
		System.out.println("Lname : "+s1.getLname());
		System.out.println("Email : "+s1.getEmail());
		
		
		Student s2=(Student) a.getBean("s1");
		
		System.out.println("Fname : "+s2.getFname());
		System.out.println("Lname : "+s2.getLname());
		System.out.println("Email : "+s2.getEmail());
	}
}
