package com.technical;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String agentid = request.getParameter("agentid");
		
		List<Technical> appointmentDetails = TechnicalDBUtil.getTechAppointment(agentid);
		request.setAttribute("appointmentDetails", appointmentDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("technical/veiw.jsp");
		dis.forward(request,  response);
	}

}
