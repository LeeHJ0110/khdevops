package com.kh.app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pokemon/list")
public class PokemonList extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ArrayList<PokemonVo> voList = new PokeService().pokeList(); 
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", "포켓몬목록 조회중 에러 발생");
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		try {
			String owner = req.getParameter("owner");
			if(owner.isEmpty()) {
				doGet(req, resp);
			}
			
			ArrayList<PokemonVo> voList = new PokeService().selectPokeList(owner); 
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", "포켓몬목록 조회중 에러 발생");
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		}
	}
}
