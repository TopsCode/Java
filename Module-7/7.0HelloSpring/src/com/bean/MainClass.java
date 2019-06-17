package com.bean;
/*

Spring helps in the creation of loosely coupled applications because of 
Dependency Injection.

In Spring, objects define their associations (dependencies) and do not
 worry about how they will get those dependencies. 
It is the responsibility of Spring to provide the required dependencies
 for creating objects.

Inversion of Control (IOC) and Dependency Injection (DI) are used interchangeably. IOC is achieved through DI.
DI is the process of providing the dependencies and IOC is the end result of DI. 

By DI, the responsibility of creating objects is shifted from our application code to the Spring container(beans); 
this phenomenon is called IOC.

Dependency Injection can be done by setter injection or constructor injection.

Spring Bean Definition
	The objects that form the backbone of your application
	and that are managed by the Spring IoC container are
	called beans.

*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=(Student) a.getBean("s1");
		System.out.println("First Name : "+s.getFname());
		System.out.println("Last Name : "+s.getLname());
		System.out.println("Email : "+s.getEmail());
	}
}
