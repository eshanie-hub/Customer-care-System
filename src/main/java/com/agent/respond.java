package com.agent;


import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.agent.Agent;
import com.agent.agentDButil;


/**
 * Servlet implementation class respond
 */
public class respond extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String messageid=request.getParameter("messageid");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String topic=request.getParameter("topic");
		String description=request.getParameter("description");
		String cusid=request.getParameter("cusid");
		String agentid=request.getParameter("agentid");
		boolean isTrue;
		isTrue=agentDButil.respondissue(messageid, name,phone, email, topic,description,cusid,agentid);
		
		if(isTrue==true)
		{
			List<Agent> issueDetails=agentDButil.getissuedetails(agentid);
			request.setAttribute("issueDetails",issueDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("agent/useraccount.jsp");
			dis.forward(request,  response);
			//out.println("<script type='text/javascript'>");
			//out.println("alert('send is successful');");
			//out.println("location='useraccount.jsp'");
			//out.println("</script>");

			
		}else
		{
			
			List<Agent> issueDetails=agentDButil.getissuedetails(agentid);
			request.setAttribute("issueDetails",issueDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("agent/useraccount.jsp");
			dis.forward(request,  response);
			
		}
	}

}
