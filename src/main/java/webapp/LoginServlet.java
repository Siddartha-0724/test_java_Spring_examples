package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int a = 5+5;
		String para0_name="para0";
		String para0_value=request.getParameter(para0_name);
		String para1_name="para1";
		String para1_value=request.getParameter(para1_name);
		String para2_name="para2";
		String para2_value=request.getParameter(para2_name);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(" First Servlet of Siddartha Addanki");
		
		out.println(para1_value);	
		out.println(" ");
		out.println(para0_value);	
		out.println(" ");
		out.println(para2_value);
		out.println("=");
		out.println(calculator(para0_value,para1_value,para2_value));
		out.println("</body>");
		out.println("</html>");
	}
	private int calculator(String op,String v1,String v2)
	{
		switch(op)
		{
		case "+":
			{
				return Integer.parseInt(v1)+Integer.parseInt(v2);
			}
		case "-":
		{
			return Integer.parseInt(v1)-Integer.parseInt(v2);
		}
		case "*":
		{
			return Integer.parseInt(v1)*Integer.parseInt(v2);
		}
		case "/":
		{
			return Integer.parseInt(v1)/Integer.parseInt(v2);
		}
		default:
			return 9999;
		}
		
	}

}
