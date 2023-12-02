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


public class DeleteComplainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cusid= request.getParameter("cusid");
		String comId= request.getParameter("comId");
		boolean isTrue;
		
		isTrue = ComplainDBUtil.deleteComplain(comId);
		
		if(isTrue == true) {
			List<Complains> complainDetails = ComplainDBUtil.getComplain(cusid);
			request.setAttribute("complainDetails", complainDetails);
			out.println("<script type='text/javascript'>");
			out.println("alert('You have successfully deleted complain!')");
			out.println("</script>");
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/complain/viewComplain.jsp");
			dis.forward(request,  response);
			
			
		}
		else {
			List<Complains> complainDetails = ComplainDBUtil.getComplain(cusid);
			request.setAttribute("complainDetails", complainDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You havenot deleted account!')");
			out.println("location='customer/complain/viewComplain.jsp'");
			out.println("</script>");
		}
	}

}