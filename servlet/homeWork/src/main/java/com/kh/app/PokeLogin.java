package com.kh.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pokemon/login")
public class PokeLogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("id");
			String userPw = req.getParameter("pw");
			
			TrainerVo vo = new TrainerVo();
			vo.setId(userId);
			vo.setPw(userPw);
			
			TrainerVo loginTrainerVo = new PokeService().login(vo);
			
			if(loginTrainerVo == null) {
				throw new Exception("로그인 실패");
			}else {
				HttpSession session = req.getSession();
				System.out.println(loginTrainerVo.getName());
				session.setAttribute("loginTrainerVo", loginTrainerVo);
				resp.sendRedirect("/app/pokemon/list");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		}
	}
}
