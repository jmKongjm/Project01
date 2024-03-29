package lab.web.servlet;

 

import java.io.IOException;

 

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

 

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

 

	protected void doPost(HttpServletRequest request, HttpServletResponse

			response) throws ServletException, IOException {

			String userid = request.getParameter("userid");

			String password = request.getParameter("password");

			String action = request.getParameter("action");

			String id = "gctserf";

			String pw = "0000";

			String url = "/error.jsp";

			HttpSession session = request.getSession();

			session.setMaxInactiveInterval(5);

			if(("login").equals(action)) {

			if(userid.equals(id) && password.equals(pw)) {

			session.setAttribute("userid", userid);

			request.setAttribute("message", userid+" 님 환영합니다.");

			url = "/ok.jsp";

			}else if(password.equals(pw)==false) {

			request.setAttribute("message", "비밀번호가 다릅니다");

			url = "/error.jsp";

			}else if(id.equals(id)==false) {

			request.setAttribute("message", "없는 아이디 입니다.");

			url = "/error.jsp";

			}

			}else if(("logout").equals(action)) {

				session.invalidate();

				url = "/Loginform.jsp";

				}else if(null==action) {

				if(null==session.getAttribute("userid")) {

				request.setAttribute("message", "로그인 된 상태가 아닙니다. 로그인을 해주세요.");

				url="/error.jsp";

				}else {

				url="/Loginform.jsp";

				}

				}

				RequestDispatcher disp = request.getRequestDispatcher(url);

				disp.forward(request, response);

				}

}
