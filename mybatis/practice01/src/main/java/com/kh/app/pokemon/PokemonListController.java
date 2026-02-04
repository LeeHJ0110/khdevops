package com.kh.app.pokemon;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pokemon/list")
public class PokemonListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String searchText = req.getParameter("searchText");
			
			List<PokemonTrainerVo> voList = new PokemonService().selectPokemonList(searchText); 
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/pokemon/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
	}
}
