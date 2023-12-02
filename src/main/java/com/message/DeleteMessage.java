package com.message;

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
 * Servlet implementation class DeleteMessage
 */
public class DeleteMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cusid= request.getParameter("cusid");
		String messageid= request.getParameter("messageid");
		boolean isTrue;
		
		isTrue = MessageDBUtil.deleteMessage(messageid);
		
		if(isTrue == true) {
			List<Messages> MessageDetails = MessageDBUtil.getMessage(cusid);
			request.setAttribute("MessageDetails", MessageDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You have successfully deleted message!')");
			out.println("</script>");
			
			RequestDispatcher dis = request.getRequestDispatcher("customer/message/veiwMessage.jsp");
			dis.forward(request,  response);
			
			
		}
		else {
			List<Messages> MessageDetails = MessageDBUtil.getMessage(cusid);
			request.setAttribute("MessageDetails", MessageDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You havenot deleted account!')");
			out.println("location='customer/message/veiwMessage.jsp'");
			out.println("</script>");
		}
	}

}