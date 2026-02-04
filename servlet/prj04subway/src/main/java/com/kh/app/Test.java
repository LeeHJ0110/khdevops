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
		String age_ = req.getParameter("age");
		int age = Integer.parseInt(age_);
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		if(age < 20) {
			pw.write("<h1>미성년자 요금은 1000원 입니다</h1>");
		}else if(age < 65) {
			pw.write("<h1>성인 요금은 1500원 입니다</h1>");
		}else {
			pw.write("<h1>노약자 요금은 500원 입니다</h1>");
		}
	}
}
