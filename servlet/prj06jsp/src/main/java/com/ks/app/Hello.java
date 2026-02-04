package com.ks.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nick = req.getParameter("nick");
		String height = req.getParameter("height");
		String weight = req.getParameter("weight");
		String age = req.getParameter("age");
		String food = req.getParameter("food");
		
		req.setAttribute("a", nick);
		req.setAttribute("b", height);
		req.setAttribute("c", weight);
		req.setAttribute("d", age);
		req.setAttribute("e", food);
		
		req.getRequestDispatcher("/hello.jsp").forward(req, resp);
	}
}
