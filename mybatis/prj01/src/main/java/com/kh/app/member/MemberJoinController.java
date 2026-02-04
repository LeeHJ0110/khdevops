package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			String userNick = req.getParameter("userNick");
			
			MemberVo vo = new MemberVo();
			vo.setId(userId);
			vo.setPw(userPw);
			vo.setNick(userNick);
			
			int result = new MemberService().join(vo);
			if(result == 1){
				resp.sendRedirect("/member/login");
			}else {
				throw new Exception("회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errorMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
		
	}
}
