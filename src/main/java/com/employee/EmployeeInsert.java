package com.employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.agent.Agent;
import com.agent.agentDButil;
import com.employee.employeeDBUtil;

/**
 * Servlet implementation class EmployeeInsert
 */
public class EmployeeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				
				//get values from register
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String phone = request.getParameter("phone");
				String address = request.getParameter("address");
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String position = request.getParameter("position");
				String accountid ="0";
				boolean isTrue;
				
				isTrue = employeeDBUtil.insertEmployee(name, email, phone, address, username, password, position);
			
				if(isTrue == true) {

					List<employee> employeeDetails=employeeDBUtil.getEmployee(accountid);
					request.setAttribute("employeeDetails",employeeDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("manager/employee/viewEmployee.jsp");
					dis.forward(request,  response);
					
				
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('There was an error in registering!')");
					out.println("location='manager/employee/viewEmployee.jsp'");
					out.println("</script>");
				}
			
			
			}

		}
