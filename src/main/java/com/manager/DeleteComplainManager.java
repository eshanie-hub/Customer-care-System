package com.manager;

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
 * Servlet implementation class DeleteComplainManager
 */
public class DeleteComplainManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup for alert messages
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				
				String agentid= request.getParameter("agentid");
				String comId= request.getParameter("comId");
				boolean isTrue;
				
				isTrue = ComplainDBUtil.deleteComplain(comId);
				
				if(isTrue == true) {
					List<managerComplain> complainDetails=managerComplainDBUtil.getComplain(agentid);
					request.setAttribute("complainDetails",complainDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("manager/manageraccount.jsp");
					dis.forward(request,  response);
					
					out.println("<script type='text/javascript'>");
					out.println("alert('You have successfully deleted complain!')");
					out.println("</script>");
					
				
				}
				else {
					List<managerComplain> complainDetails=managerComplainDBUtil.getComplain(agentid);
					request.setAttribute("complainDetails",complainDetails);
					
					out.println("<script type='text/javascript'>");
					out.println("alert('You havenot deleted account!')");
					out.println("location='manager/manageraccount.jsp'");
					out.println("</script>");
				}
			}

		}