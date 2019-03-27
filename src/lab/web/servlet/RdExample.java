package lab.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RdExample
 */
@WebServlet("/rd")
public class RdExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pw = request.getParameter("pw");
	String id = request.getParameter("id");
	String rd = request.getParameter("rd");
	String url = "/RdExample.jsp";
	
	if(rd.equals("RE"))
	{
		request.setAttribute("id",id);
		request.setAttribute("name", name);
		request.setAttribute("pw", pw);
		response.sendRedirect(url);
		
		
	}
	else
	{
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("pw", pw);
		RequestDispatcher disp = request.getRequestDispatcher(url);
		disp.forward(request, response);
	}
	}

}
