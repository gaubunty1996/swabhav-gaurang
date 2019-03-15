package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        System.out.println("inside authservlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("inside authservlet's doget()");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside authservlet's doget()");
		String uname=request.getParameter("inputUser");  
		String pass=request.getParameter("inputPass"); 
		PrintWriter out = response.getWriter();
		if(uname.equals("admin") && pass.equals("admin")){
		    out.println("Welcome,"+uname);
		    System.out.println("Welcome");
		}

		else{
		    out.println("<h1 style='color:red'>Invalid user please login again!!</h1><br>");
		    out.println("<a href='views/login.html'>login.html</a>");
		}
	}

}
