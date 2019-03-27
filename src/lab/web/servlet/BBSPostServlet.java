package lab.web.servlet;

 

import java.io.IOException;

import java.io.PrintWriter;

 

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

/**

 * Servlet implementation class BBSPostServlet

 */

@WebServlet("/BBS")


public class BBSPostServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

       

    /**

     * @see HttpServlet#HttpServlet()

     */

    public BBSPostServlet() {

        super();

        // TODO Auto-generated constructor stub

    }

 

	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		//response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");

		String id = request.getParameter("id");

		String password = request.getParameter("password");

		String gender = request.getParameter("gender");

		if(gender.equals("Male"))

		{

			gender="��";

		}

		else

		{

			gender="��";

		}

		String iNotice = request.getParameter("inotice");

		String cNotice = request.getParameter("cnotice");

		String dNotice = request.getParameter("dnotice");

		String job = request.getParameter("job");

		

		response.setContentType("text/html;charset=utf-8");

		

		PrintWriter out = response.getWriter();

		out.println("<HTML>");

		out.println("<HEAD><TITLE>���� ���� �Է�-��� ȭ��</TITLE></HEAD>");

		out.println("<BODY>");

		out.println("<H2>���� ���� �Է�</H2>");

		out.printf("�̸�: %s <BR>",name);

		out.printf("���̵�: %s <BR>",id);

		out.printf("��ȣ: %s <BR>",password);

		out.printf("����: %s <BR>",gender);

		out.printf("���� ����: %s <BR>",noticeToHangul(iNotice));

		out.printf("���� ����: %s <BR>",noticeToHangul(cNotice));

		out.printf("��� Ȯ�� ����: %s <BR>",noticeToHangul(dNotice));

		out.printf("����: %s <BR>",job);

		out.println("</BODY>");

		out.println("</HTML>");

	

	}

 

	private String noticeToHangul(String notice) {

		// TODO Auto-generated method stub

		if(notice ==  null)

		{

			return "���� ����";

		}

		else if(notice.contentEquals("on"))

		{

			return "����";

			

		}

		else

		{

			return notice;

		}

	}

 

	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		/*

		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");

		String title = request.getParameter("title");

		String content = request.getParameter("content");

		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		out.println("<HTML>");

		out.println("<HEAD><TITLE>�Խ��� �۾���-��� ȭ��</TITLE></HEAD>");

		out.println("<BODY>");

		out.printf("�̸�:%s <BR> ",name);

		out.printf("����:%s <BR> ",title);

		out.println("--------<BR>");

		out.printf("<PRE>%s</PRE>",content);

		out.println("--------<BR>");

		out.println("����Ǿ����ϴ�.");

		out.println("</BODY>");

		out.println("</HTML>");

		*/

		

		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");

		String pw = request.getParameter("pw");

		String [] fruit = request.getParameterValues("fruit");

		String sex = request.getParameter("sex");

		String job = request.getParameter("job");

		String data = request.getParameter("data");

		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		out.println("<HTML>");

		out.println("<HEAD><TITLE>�±� ��� ��� ȭ��</TITLE></HEAD>");

		out.println("<BODY>");

		out.printf("���̵� : %s<BR>", id);

		out.printf("��й�ȣ : %s<BR>", pw);

		out.print("���� : ");

		for(String val: fruit)

		{

			out.printf("%s ", val);

		}

		out.print("<BR>");

		out.printf("���� : %s", sex);

		out.printf("���� : %s", job);

		out.println("--------<BR>");

		out.printf("<PRE>%s</PRE>", data);

		out.println("--------<BR>");

		out.println("����Ǿ����ϴ�.");

		out.println("</BODY>");

		out.println("</HTML>");

		

		

		

		

	}

 

}
