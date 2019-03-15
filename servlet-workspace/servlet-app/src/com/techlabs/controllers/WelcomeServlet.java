package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
		System.out.println("welcome servlet created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("inside doget()");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("developer");
		for(int i = 0; i < 7; i=i+1) {
		if(name!=null && !name.equals("null") && name!=""){
		    
		    out.println("<h"+i+">Welcome to servlet, "+name+"</h"+i+">");
		}
		else{
		    
		    out.println("<h"+i+">Welcome to servlet</h"+i+">");
		}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside dopost()");
		
		//doGet(request, response);
	}
	

}
