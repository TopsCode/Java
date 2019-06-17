package com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServletDemo")
public class HttpServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public HttpServletDemo() {
        System.out.println("In Constructor... ");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In Init Method...  ");		
	}
	
	public void destroy() {
		System.out.println("In Destroy  Method...");	
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Service Method... ");	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
