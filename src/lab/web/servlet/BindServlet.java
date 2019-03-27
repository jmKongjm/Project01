package lab.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//데이터 바인딩, 벙뮈를 확인하자!
@WebServlet("/Bind")
public class BindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException
    {
    	this.config = config;
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = config.getServletContext();
		application.setAttribute("message", "Hello World");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+application.getAttribute("message"));//h1:제일 굵고 크게 (글씨 크기 지정), h1~h6
		out.println("<h1>"+application.getInitParameter("company")); //WEB-INF 아래의 web.xml에서 미리 설정해두웠던 parameter값이 출력되는 것을 확인할 수 있다. 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
