package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=(Student) a.getBean("s2");
		System.out.println("First Name : "+s.getFname());
		System.out.println("Last Name : "+s.getLname());
		System.out.println("Email : "+s.getEmail());
	}
}
