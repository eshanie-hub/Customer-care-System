package com.complain;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.customer.CustomerDBUtil;

/**
 * Servlet implementation class sendServlet
 */
public class sendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get values from register
		String cusid= request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String topic = request.getParameter("topic");
		String complain = request.getParameter("complain");
		boolean isTrue;
		
		isTrue = ComplainDBUtil.sentComplain(cusid, name, email, phone, topic, complain);
	
		if(isTrue == true) {
			List<Complains> complainDetails = ComplainDBUtil.getComplain(cusid);
			request.setAttribute("complainDetails", complainDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/complain/viewComplain.jsp");
			dis.forward(request,  response);
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('There was an error in sending the complain!')");
			out.println("location='customer/complain/sendComplain.jsp'");
			out.println("</script>");
		}
	
	
	}

}