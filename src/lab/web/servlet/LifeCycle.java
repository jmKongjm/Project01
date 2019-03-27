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

 private ServletConfig config; //servlet 정보를 담는 객체

 

 public LifeCycle()

 {

  super();

 

  System.out.println("서블릿 생성자 호출");

 }

 

 

public void init(ServletConfig config) throws ServletException

{
 this.config = config; //servlet에 관한 정보가 config에 들어가게 된다. 
 System.out.println("init() 메서드 호출");
}

public void destroy()

{
 System.out.println("destroy() 메서드 호출");
}

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  // TODO Auto-generated method stub

  System.out.println("doGet() 호출됨");

  response.setContentType("text/html;charset=utf-8");

  PrintWriter out = response.getWriter();

  String email = config.getInitParameter("email");

  String userid = config.getInitParameter("userid");

  out.println("사용자 이메일: "+ email);

  out.println("사용자 아이디 : "+userid);

 }

 

}

 
