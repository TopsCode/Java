package com.controller;
/*
Controller is responsible to fetch data from view part (jsp pages)
and than Controller transfer these data to model part (dao) 
with the help of bean class object 

Controll : View - Controller -BusinessObject -Dao 

*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bo.StudentBo;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		StudentBo sbo=(StudentBo) a.getBean("studentBo");
		if(action.equalsIgnoreCase("insert"))
		{
			Student s=new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			sbo.insertStudent(s);
			//response.sendRedirect("show.jsp");
		}
	}

}
