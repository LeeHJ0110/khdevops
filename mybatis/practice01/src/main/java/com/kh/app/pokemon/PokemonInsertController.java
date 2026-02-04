package com.kh.app.pokemon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.trainer.TrainerVo;

@WebServlet("/pokemon/insert")
public class PokemonInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getSession().getAttribute("loginTrainerVo")== null) {
			req.getSession().setAttribute("alertMsg", "로그인을 먼저 해주세요");
			resp.sendRedirect("/home");
		}else {
			req.getRequestDispatcher("/WEB-INF/views/pokemon/insert.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			TrainerVo dbVo = (TrainerVo)req.getSession().getAttribute("loginTrainerVo");
			String name = req.getParameter("pokeName");
			String type = req.getParameter("pokeType");
			String abil = req.getParameter("pokeAbil");
			String no = dbVo.getNo();
			
			PokemonVo vo = new PokemonVo();
			vo.setName(name);
			vo.setType(type);
			vo.setAbility(abil);
			vo.setTrainerNo(no);
			
			int result = new PokemonService().insert(vo);
			if(result != 1) {
				throw new Exception("포켓몬 추가 실패");
			}
			req.getSession().setAttribute("alertMsg", "등록 성공");
			resp.sendRedirect("/home");
			
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
	}
}
