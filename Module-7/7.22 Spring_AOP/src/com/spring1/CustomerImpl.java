package com.spring1;
//to implements the interface inside the class
public class CustomerImpl implements Customer 
{
	//to override the method of the interface 
	@Override
	public void browser() //target method explaination
	{
		System.out.println("Customer is Browsing...");
	}
}
