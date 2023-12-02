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

import com.appointment.AppointmentDBUtil;
import com.appointment.Appointments;
import com.complain.ComplainDBUtil;
import com.complain.Complains;

/**
 * Servlet implementation class TechnicalDelete
 */
public class TechnicalDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String appId = request.getParameter("appId");
	   	String agentid = request.getParameter("agentid");
		boolean isTrue;
		
		isTrue = TechnicalDBUtil.deleteAppointment(appId);
		
		if(isTrue == true) {
			List<Technical> appointmentDetails = TechnicalDBUtil.getTechAppointment(agentid);
			request.setAttribute("appointmentDetails", appointmentDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("technical/veiw.jsp");
			dis.forward(request,  response);
			
			
		}
		else {
			List<Technical> appointmentDetails = TechnicalDBUtil.getTechAppointment(agentid);
			request.setAttribute("appointmentDetails", appointmentDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You havenot deleted appointment!')");
			out.println("location='technical/veiw.jsp'");
			out.println("</script>");
		}
	}

}