package com.spring1;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
//this class has so many interfaces which is used for advisor and also each //interface has an abstract method

public class InternetAdvice implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor
{
	//this is the referece will create for use of its class method
	private CustomerOwener cowner;
	public CustomerOwener getCowner() {
		return cowner;
	}

	public void setCowner(CustomerOwener cowner) {
		this.cowner = cowner;
	}
	//before method with use of interface advisor
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		this.cowner.loginCustomer();
	}
		//after returning method with use of interface advisor
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		this.cowner.logoutCustomer();
	}
	//invoke method with use of interface advisor this is proceed method to call advisor
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Allocate the system to customer");
		method.proceed();
		System.out.println("DeAllocate the system to customer");
		return null;
	}

}
