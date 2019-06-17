package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi.php")
public class LifeCycleOfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public LifeCycleOfServlet() {
       System.out.println("In constructore...");
    }
 
    @Override
    public void init() throws ServletException {
    	System.out.println("in init method...");
    }
    
    
    @Override
    public void destroy() {
    	System.out.println("in destroyee...");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in service method...");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h3>Hello Welcome to tops</h3>");
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
