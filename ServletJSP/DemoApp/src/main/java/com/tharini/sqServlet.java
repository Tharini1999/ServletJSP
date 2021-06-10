package com.tharini;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
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
		
		
		/*Cookie*/
		//Cookie[] cookie = req.getCookies();
		
		//for(Cookie c : cookie)
		//{
			//if(c.getName().equals("k")==true)
			//{
				//k=Integer.parseInt(c.getValue());
			//}
		//}
		k = (int)req.getAttribute("k");
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("The square of sum = "+k);
		
		
		/*SERVLET CONTEXT*/
		//ServletContext context =  getServletContext();
		//String name = context.getInitParameter("name");
		//String dob = context.getInitParameter("dob");
		//out.println(name+" "+dob);
		
		/*SERVLET CONFIG*/
		ServletConfig cig =  getServletConfig();
		String name = cig.getInitParameter("name");
		out.println(name);
		
		
		
	}
	
}
