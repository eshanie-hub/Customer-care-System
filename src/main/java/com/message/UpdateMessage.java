package com.message;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.complain.ComplainDBUtil;
import com.complain.Complains;

public class UpdateMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		  
		String messageid = request.getParameter("messageid");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String topic = request.getParameter("topic");
		String description = request.getParameter("description");
		String cusid = request.getParameter("cusid");
		String agentid = request.getParameter("agentid");
		boolean isTrue;
		
		isTrue = MessageDBUtil.updateMessage(messageid, name, phone, email, topic, description, cusid, agentid);
		if(isTrue == true) { 
			List<Messages> MessageDetails = MessageDBUtil.getMessage(cusid);
			request.setAttribute("MessageDetails", MessageDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You have successfully updated message!')");
			out.println("</script>");
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/message/veiwMessage.jsp");
			dis.forward(request,  response);
		
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your profile details didnot updated')");
			out.println("location='customer/profile.jsp'");
			out.println("</script>");
		}
	}

}