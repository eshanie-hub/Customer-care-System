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



public class sendMessageServlet extends HttpServlet {
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
				String description = request.getParameter("description");
				boolean isTrue;
				
				isTrue = MessageDBUtil.sentMessage(cusid, name, email, phone, topic, description);
			
				if(isTrue == true) {
					List<Messages> MessageDetails = MessageDBUtil.getMessage(cusid);
					request.setAttribute("MessageDetails", MessageDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("customer/message/veiwMessage.jsp");
					dis.forward(request,  response);
				
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('There was an error in sending the message!')");
					out.println("location='customer/message/sendMessage.jsp'");
					out.println("</script>");
				}
			
			
			}

		}