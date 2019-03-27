package lab.web.servlet;

 

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebInitParam;

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

/**

 * Servlet implementation class NewServlet

 */

@WebServlet

(urlPatterns = {"/LifeCycle.do"},

initParams = { @WebInitParam (name = "email", value = "gctserf@gmail.com")

,@WebInitParam(name = "userid", value = "eomyb")})

 

public class LifeCycle extends HttpServlet

{

 private static final long serialVersionUID = 1L;

 private ServletConfig config; //servlet ������ ��� ��ü

 

 public LifeCycle()

 {

  super();

 

  System.out.println("���� ������ ȣ��");

 }

 

 

public void init(ServletConfig config) throws ServletException

{
 this.config = config; //servlet�� ���� ������ config�� ���� �ȴ�. 
 System.out.println("init() �޼��� ȣ��");
}

public void destroy()

{
 System.out.println("destroy() �޼��� ȣ��");
}

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  // TODO Auto-generated method stub

  System.out.println("doGet() ȣ���");

  response.setContentType("text/html;charset=utf-8");

  PrintWriter out = response.getWriter();

  String email = config.getInitParameter("email");

  String userid = config.getInitParameter("userid");

  out.println("����� �̸���: "+ email);

  out.println("����� ���̵� : "+userid);

 }

 

}

 
