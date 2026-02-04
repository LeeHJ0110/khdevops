package com.kh.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pokemon/insert")
public class PokemonInsert extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		try {
			String name = req.getParameter("name");
			String type = req.getParameter("type");
			String level = req.getParameter("level");
			String owner = req.getParameter("owner");
			
			PokemonVo vo = new PokemonVo();
			vo.setName(name);
			vo.setType(type);
			vo.setLevel(level);
			vo.setOwner(owner);
			
			int result = new PokeService().insert(vo);	
			
			if(result == 1) {
				resp.sendRedirect("/app/pokemon/list");
			}else {
				throw new Exception("[ERROR-M001] join fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", "포켓몬 입력중 에러");
			req.getRequestDispatcher("/WEB-INF/views/error.jsp");
		}
		
	}
}
