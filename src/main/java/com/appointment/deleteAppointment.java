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
 * Servlet implementation class deleteAppointment
 */
public class deleteAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				
				String appId = request.getParameter("appId");
			   	String cusid = request.getParameter("cusId");
				boolean isTrue;
				
				isTrue = AppointmentDBUtil.deleteAppointment(appId);
				
				if(isTrue == true) {
					List<Appointments> appointmentDetails = AppointmentDBUtil.getAppointment(cusid);
					request.setAttribute("appointmentDetails", appointmentDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("customer/appiontment/viewAppointment.jsp");
					dis.forward(request,  response);
					
					
				}
				else {
					List<Complains> complainDetails = ComplainDBUtil.getComplain(cusid);
					request.setAttribute("complainDetails", complainDetails);
					
					out.println("<script type='text/javascript'>");
					out.println("alert('You havenot deleted appointment!')");
					out.println("location='customer/complain/viewAppointment.jsp'");
					out.println("</script>");
				}
			}

		}