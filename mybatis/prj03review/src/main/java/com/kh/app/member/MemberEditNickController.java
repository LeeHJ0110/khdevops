package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/editNick")
public class MemberEditNickController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/editNick.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			MemberVo dbVo = (MemberVo)req.getSession().getAttribute("loginMemberVo");
			String userNick = req.getParameter("userNick");
			
			dbVo.setNick(userNick);
			
			int result = new MemberService().editNick(dbVo);
			if(result == 1) {
				System.out.println("닉네임 변경 성공");
				resp.sendRedirect("/home");
			}else {
				throw new Exception("닉네임 변경 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
		
	}
}
