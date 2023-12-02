package com.manager;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.manager.managerComplain;
import com.manager.managerComplainDBUtil;

/**
 * Servlet implementation class loginManager
 */
public class loginManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				
				//get values from login
				String managerid = request.getParameter("managerid");
				boolean isTrue;
				
				isTrue = managerComplainDBUtil.validate(managerid);
						
				if(isTrue==true)
				{
					List<managerComplain> complainDetails=managerComplainDBUtil.getComplain(managerid);
					request.setAttribute("complainDetails",complainDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("manager/manageraccount.jsp");
					dis.forward(request,  response);
					//out.println("<script type='text/javascript'>");
					//out.println("alert('send is successful');");
					//out.println("location='useraccount.jsp'");
					//out.println("</script>");

					
				}else
				{
					
					out.println("<script type='text/javascript'>");
					out.println("alert('login was unsuccessful');");
					out.println("location='manager/loginManager.jsp'");
					out.println("</script>");

					
				}
			}

			}
