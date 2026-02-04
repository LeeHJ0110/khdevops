package com.kh.app.trainer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/trainer/login")
public class TrainerLoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String userId = req.getParameter("userId");
			String userPw = req.getParameter("userPw");
			
			TrainerVo vo = new TrainerVo();
			vo.setId(userId);
			vo.setPw(userPw);
			
			TrainerVo dbVo = new TrainerService().login(vo);
			if(dbVo == null) {
				throw new Exception("로그인 실패");
			}else {
				req.getSession().setAttribute("loginTrainerVo", dbVo);
				resp.sendRedirect("/home");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
	}
}
