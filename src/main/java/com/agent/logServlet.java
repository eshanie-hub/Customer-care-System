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
 * Servlet implementation class logServlet
 */
public class logServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setup for alert messages
				
		PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				
				//get values from login
				String agentid = request.getParameter("agentid");
				boolean isTrue;
				
				isTrue = agentDButil.validate(agentid);
						
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
