package com.tharini;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class sqServlet extends HttpServlet{

	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		int k =0;
		/*SESSION*/
		//HttpSession session = req.getSession();
		//k=(int)session.getAttribute("k");
		
		
		Cookie[] cookie = req.getCookies();
		
		for(Cookie c : cookie)
		{
			if(c.getName().equals("k")==true)
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("The square of sum = "+k);
	}
	
}
