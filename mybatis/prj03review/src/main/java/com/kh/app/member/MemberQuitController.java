package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/quit")
public class MemberQuitController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MemberVo dbVo = (MemberVo)req.getSession().getAttribute("loginMemberVo");
			int result = new MemberService().quit(dbVo);
			if(result == 1) {
				System.out.println("회원탈퇴 성공");
				req.getSession().removeAttribute("loginMemberVo");
				resp.sendRedirect("/home");
			}else {
				throw new Exception("회원탈퇴 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
	}
}
