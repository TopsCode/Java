package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*

The Spring Web MVC framework provides Model-View-Controller (MVC)
architecture and ready components that can be used to develop 
flexible and loosely coupled web applications.

*/
/*
3.
The Controller takes the request and calls the appropriate 
service methods based on used GET or POST method. 
The service method will set model data based on defined 
business logic and returns view name to the DispatcherServlet.

*/
@Controller
public class MyController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(ModelMap model)
	{
		System.out.println("Hello Method Called");
		model.addAttribute("msg","Hello Method Called");
		return "hello";
	}
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome(ModelMap model)
	{
		System.out.println("Welcome Method Called");
		model.addAttribute("msg","Welcome Method Called");
		return "welcome";
	}
}
