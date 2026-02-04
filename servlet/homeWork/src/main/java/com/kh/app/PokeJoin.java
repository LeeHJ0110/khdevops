package com.kh.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pokemon/join")
public class PokeJoin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("id");
			String userPw = req.getParameter("pw");
			String userName = req.getParameter("name");
			
			TrainerVo vo = new TrainerVo();
			vo.setId(userId);
			vo.setPw(userPw);
			vo.setName(userName);
			
			int result = new PokeService().join(vo);
			if(result == 1) {
				resp.sendRedirect("/app/pokemon/login");
			}else {
				throw new Exception("트레이너 가입 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		}
	}
}
