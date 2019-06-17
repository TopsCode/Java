package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Manager m=(Manager) ac.getBean("manager");
		m.toString();
		System.out.println(m);
	}
}
