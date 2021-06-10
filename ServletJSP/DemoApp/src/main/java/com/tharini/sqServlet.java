package com.tharini;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet{

	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = (int)req.getAttribute("result");
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("The square of sum = "+k);
	}
	
}
