package com.customer;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get values from login
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.validate(userName, password);
				
		if(isTrue == true) {
			List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
			request.setAttribute("cusDetails", cusDetails);
			
			//Direct to user account page
			RequestDispatcher dis = request.getRequestDispatcher("customer/useraccount.jsp");
			dis.forward(request,  response);
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect')");
			out.println("location='customer/login.jsp'");
			out.println("</script>");
		}
		
		
	}

}
