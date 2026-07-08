<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.Cookie" %>

<%
String username = request.getParameter("name");
String password = request.getParameter("pass");

if(username.equalsIgnoreCase("administrator@kce.ac.in"))
{
    RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
    rd.forward(request,response);
}
else
{
    String[] userdata = username.split("@");

    Cookie cookie = new Cookie("username", userdata[0]);
    response.addCookie(cookie);

    RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
    rd.forward(request,response);
}
%>