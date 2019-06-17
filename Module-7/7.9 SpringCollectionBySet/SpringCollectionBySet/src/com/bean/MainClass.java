package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		Student s=(Student) ac.getBean("student");
		s.toString();
		System.out.println(s);
	}

}
