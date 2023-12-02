package com.employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class EmployeeUpdate
 */
public class EmployeeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");

				String userid=request.getParameter("userid");
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String phone = request.getParameter("phone");
				String address = request.getParameter("address");
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String position = request.getParameter("position");
				String accountid = request.getParameter("accountid");
				boolean isTrue;
				
				isTrue = employeeDBUtil.updateEmployee(userid, name, email, phone , address, username, password, position, accountid);
				
				if(isTrue == true) {
					List<employee> employeeDetails=employeeDBUtil.getEmployee(accountid);
					request.setAttribute("employeeDetails",employeeDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("manager/employee/viewEmployee.jsp");
					dis.forward(request,  response);
					
				
				}else {
					List<employee> employeeDetails=employeeDBUtil.getEmployee(accountid);
					request.setAttribute("employeeDetails",employeeDetails);
					
					out.println("<script type='text/javascript'>");
					out.println("alert('There was an error in deleting!')");
					out.println("location='manager/employee/viewEmployee.jsp'");
					out.println("</script>");
				}
			}


		}
