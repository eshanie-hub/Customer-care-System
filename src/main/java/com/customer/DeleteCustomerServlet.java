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



public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id= request.getParameter("cusid");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deleteCustomer(id);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('You have successfully deleted account!')");
			out.println("location='customer/register.jsp'");
			out.println("</script>");
		}
		else {
			List<Customer> cusDetails = CustomerDBUtil.getCustomer(id);
			request.setAttribute("cusDetails", cusDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You havenot deleted account!')");
			out.println("location='customer/useraccount.jsp'");
			out.println("</script>");
		}
	}

}
