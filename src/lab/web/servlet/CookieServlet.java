package lab.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/Cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html; charset = utf-8");
	HttpSession session = request.getSession();
	String sessid = request.getHeader("cookie");//��û �ÿ� ���� ��Ű�� ���� 
	session.setAttribute("sessid", sessid);
	RequestDispatcher disp = request.getRequestDispatcher("/Cookie.jsp");
	disp.forward(request, response);
	}


}
