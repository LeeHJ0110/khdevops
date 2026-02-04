package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			
			MemberVo vo = new MemberVo();
			vo.setId(userId);
			vo.setPw(userPw);
			
			MemberVo dbVo = new MemberService().login(vo);
			
			if(dbVo == null) {
				throw new Exception("로그인 실패");
			}else {
				req.getSession().setAttribute("loginMemberVo", dbVo);
				resp.sendRedirect("/home");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
		
	}
}
