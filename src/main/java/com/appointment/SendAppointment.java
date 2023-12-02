package com.appointment;

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
 * Servlet implementation class SendAppointment
 */
public class SendAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.sentAppointment(cusid, name, email, phone, topic, date, time);
	
		if(isTrue == true) {
			List<Appointments> appointmentDetails = AppointmentDBUtil.getAppointment(cusid);
			request.setAttribute("appointmentDetails", appointmentDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/appiontment/viewAppointment.jsp");
			dis.forward(request,  response);
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('There was an error in sending the complain!')");
			out.println("location='customer/appiontment/viewAppointment.jsp'");
			out.println("</script>");
		}
	
	
	}

}