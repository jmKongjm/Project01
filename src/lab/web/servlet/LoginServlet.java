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

			request.setAttribute("message", userid+" �� ȯ���մϴ�.");

			url = "/ok.jsp";

			}else if(password.equals(pw)==false) {

			request.setAttribute("message", "��й�ȣ�� �ٸ��ϴ�");

			url = "/error.jsp";

			}else if(id.equals(id)==false) {

			request.setAttribute("message", "���� ���̵� �Դϴ�.");

			url = "/error.jsp";

			}

			}else if(("logout").equals(action)) {

				session.invalidate();

				url = "/Loginform.jsp";

				}else if(null==action) {

				if(null==session.getAttribute("userid")) {

				request.setAttribute("message", "�α��� �� ���°� �ƴմϴ�. �α����� ���ּ���.");

				url="/error.jsp";

				}else {

				url="/Loginform.jsp";

				}

				}

				RequestDispatcher disp = request.getRequestDispatcher(url);

				disp.forward(request, response);

				}

}
