package com.kh.app.board;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String searchType = req.getParameter("searchType");
			String t = req.getParameter("t");
			String c = req.getParameter("c");
			
			Map<String, String> map = new HashMap<String, String>();
			map.put("x", t);
			map.put("y", c);
			map.put("searchType", searchType);
			
			List<BoardVo> voList = new BoardSerivce().list(map);
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
	}
}
