package com.kh.app.trainer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/trainer/join")
public class TrainerJoinController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/trainer/join.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			String userNick = req.getParameter("userNick");
			
			TrainerVo vo = new TrainerVo();
			vo.setId(userId);
			vo.setPw(userPw);
			vo.setNick(userNick);
			
			int result = new TrainerService().join(vo);
			if(result != 1) {
				throw new Exception("가입 오류");
			}
			resp.sendRedirect("/home");
			
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
	}
}
