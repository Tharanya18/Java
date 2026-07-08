package com.kce.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//form data reading
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		
		if( username.equalsIgnoreCase("administrator@kce.ac.in")) {
			RequestDispatcher rd = request.getRequestDispatcher("AdminServlet");
			rd.forward(request ,  response);
		}
		else {
			//HttpSession session = request.getSession();
			String userdata[] = username.split("@");
			//session.setAttribute("username" , userdata[0]);
			Cookie c = new Cookie("username" , userdata[0]);
			response.addCookie(c);
			RequestDispatcher rd =  request.getRequestDispatcher("UserServlet");
			rd.forward(request, response);
			
		}
		out.close();
	}
	

}
