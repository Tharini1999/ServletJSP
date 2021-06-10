package com.tharini;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		
		/*Cookies*/
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		/*SESSION*/
		//HttpSession session = req.getSession();
		//session.setAttribute("k",k);
		//res.sendRedirect("sq");
		
		/*URL REWRITING*/
		//res.sendRedirect("sq?k="+k); //url rewriting
		
		
		/*REQUEST DISPATCHER*/
		//req.setAttribute("result",result);
		//RequestDispatcher rq = req.getRequestDispatcher("sq");
		//rq.forward(req, res);
		
	}
}

