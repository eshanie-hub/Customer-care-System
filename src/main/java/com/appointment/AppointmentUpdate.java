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

import com.complain.ComplainDBUtil;
import com.complain.Complains;

/**
 * Servlet implementation class AppointmentUpdate
 */
public class AppointmentUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	   
		String appId = request.getParameter("appId");
	   	String cusid = request.getParameter("cusId");
	   	String name = request.getParameter("name");
	   	String appDate = request.getParameter("appDate");
	   	String appTime = request.getParameter("appTime");
	   	String email = request.getParameter("email");
	   	String phone = request.getParameter("phone");
	   	String topic = request.getParameter("topic");
	   	String agentid = request.getParameter("agentid");
		boolean isTrue;
		
		isTrue = AppointmentDBUtil.updateAppointment(appId, cusid, name, appDate, appTime, email, phone, topic, agentid);
		if(isTrue == true) { 
			List<Appointments> appointmentDetails = AppointmentDBUtil.getAppointment(cusid);
			request.setAttribute("appointmentDetails", appointmentDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/appiontment/viewAppointment.jsp");
			dis.forward(request,  response);
			
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your profile details didnot updated')");
			out.println("location='customer/appiontment/viewAppointment.jsp'");
			out.println("</script>");
		}
	}

}