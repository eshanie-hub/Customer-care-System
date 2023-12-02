package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get values from register
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertCustomer(name, email, phone, username, password);
	
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('You have successfully registered!')");
			out.println("location='customer/login.jsp'");
			out.println("</script>");
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('There was an error in registering!')");
			out.println("location='customer/register.jsp'");
			out.println("</script>");
		}
	
	
	}

}
