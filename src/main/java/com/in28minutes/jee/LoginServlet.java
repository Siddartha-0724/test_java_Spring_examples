package com.in28minutes.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	private UserValidationService service = new UserValidationService();
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException
			{
				
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
			}
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException
			{
				String uname = request.getParameter("name");
				String upass = request.getParameter("pass");
				
				request.setAttribute("name", uname);
				request.setAttribute("pass", upass);
				if(service.isUserValid(uname, upass))
				request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);	
				else
				{
					request.setAttribute("errorMessage", "Invalid Credentials");
					request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
				}
				
			}
	
}
