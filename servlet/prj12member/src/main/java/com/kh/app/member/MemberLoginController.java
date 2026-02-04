package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			
			MemberVo vo = new MemberVo();
			vo.setId(userId);
			vo.setPw(userPw);
			
			MemberVo loginMemberVo = new MemberService().login(vo);
			
			if(loginMemberVo == null) {
				new Exception("로그인 실패");
			}else {
				HttpSession session = req.getSession();
				session.setAttribute("loginMemberVo", loginMemberVo);
				
				resp.sendRedirect("/app/home");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
