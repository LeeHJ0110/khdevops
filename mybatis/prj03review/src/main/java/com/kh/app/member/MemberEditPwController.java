package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/editPw")
public class MemberEditPwController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/editPw.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MemberVo dbVo = (MemberVo)req.getSession().getAttribute("loginMemberVo");
			String userPw = req.getParameter("userPw");
			
			dbVo.setPw(userPw);
			
			int result = new MemberService().editPw(dbVo);
			if(result == 1) {
				System.out.println("비밀번호 변경 성공");
				resp.sendRedirect("/home");
			}else {
				throw new Exception("비밀번호 변경 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
		
	}
}
