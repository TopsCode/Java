package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		//to create object of application context interface
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//create proxy reference which is in beans.xml file
		Customer customer=(Customer)context.getBean("customerproxy");
		//this is our target method to call all adivsor
		customer.browser();
	}
}
