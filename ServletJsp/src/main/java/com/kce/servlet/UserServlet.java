package com.kce.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession();
		//String user =(String) session.getAttribute("username");
		Cookie[] cookies = request.getCookies();
		String user = "";
		if (cookies != null) {
	        for (Cookie cookie : cookies) {
	            if ("username".equals(cookie.getName())) {
	                user = cookie.getValue();
	                break;
	            }
	        }
	    }
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>");
		out.println("welcome to user page " + user + "</h1></body></html>");
		
	}

}
