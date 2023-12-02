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

public class ComplainUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cusid = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String topic = request.getParameter("topic");
		String complain = request.getParameter("complain");
		String agentid = request.getParameter("agentid");
		String comId = request.getParameter("comId");
		boolean isTrue;
		
		isTrue = ComplainDBUtil.updateComplain(cusid, name, email, phone, topic, complain, agentid, comId);
		if(isTrue == true) { 
			List<Complains> complainDetails = ComplainDBUtil.getComplain(cusid);
			request.setAttribute("complainDetails", complainDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/complain/viewComplain.jsp");
			dis.forward(request,  response);
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your profile details didnot updated')");
			out.println("location='customer/profile.jsp'");
			out.println("</script>");
		}
	}

}