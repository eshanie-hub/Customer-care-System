package com.technical;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.technical.TechnicalDBUtil;
import com.technical.Technical;

/**
 * Servlet implementation class TechnicalInsert
 */
public class TechnicalInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		//get values from insert appointment
	   	String cusid = request.getParameter("cusId");
	   	String name = request.getParameter("name");
	   	String appDate = request.getParameter("appDate");
	   	String appTime = request.getParameter("appTime");
	   	String email = request.getParameter("email");
	   	String phone = request.getParameter("phone");
	   	String topic = request.getParameter("topic");
	   	String agentid = request.getParameter("agentid");
		boolean isTrue;
		
		isTrue = TechnicalDBUtil.sentAppointment(cusid, name, appDate, appTime, email, phone, topic, agentid);
	
		if(isTrue == true) {
			List<Technical> appointmentDetails = TechnicalDBUtil.getTechAppointment(agentid);
			request.setAttribute("appointmentDetails", appointmentDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("technical/veiw.jsp");
			dis.forward(request,  response);
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('There was an error in sending the complain!')");
			out.println("location='technical/veiw.jsp'");
			out.println("</script>");
		}
	
	
	}

}