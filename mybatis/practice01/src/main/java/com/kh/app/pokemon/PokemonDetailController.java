package com.kh.app.pokemon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pokemon/detail")
public class PokemonDetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			PokemonTrainerVo vo = new PokemonService().detail(no);
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/pokemon/detail.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
		
	}
}
