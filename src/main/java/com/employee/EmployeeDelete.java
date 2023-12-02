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

import com.employee.employee;
import com.employee.employeeDBUtil;

/**
 * Servlet implementation class EmployeeDelete
 */
public class EmployeeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userid=request.getParameter("userid");
		String accountid=request.getParameter("accountid");
		boolean isTrue;
		
		isTrue = employeeDBUtil.deleteEmployee(userid);
		
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
