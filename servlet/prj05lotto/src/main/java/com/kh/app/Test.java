package com.kh.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Test extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String max_ = req.getParameter("max");
		int max = max_ == null ? 45 : Integer.parseInt(max_);
		int random = (int)(Math.random() * max) + 1;
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>" + random + "</h1>");
	}
}
