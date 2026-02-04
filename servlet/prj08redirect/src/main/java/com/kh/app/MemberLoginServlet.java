package com.kh.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		
		// DB와 데이터 일치 여부 검증
		boolean isOk = userId.equals("user01") && userPw.equals("1234");
		if(isOk) {
			resp.sendRedirect("/app/home");
		}else {
			resp.sendRedirect("/app/error");
		}
		
	}
}
