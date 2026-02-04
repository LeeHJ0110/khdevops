package com.kh.app.board;

import java.io.IOException;
import java.net.http.HttpClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			BoardVo vo = new BoardVo();
			vo.setTitle(title);
			vo.setContent(content);
			
			int result = new BoardService().insert(vo);
			
			if(result == 1) {
				resp.sendRedirect("/board/list");
			}else {
				throw new Exception("BOARD INSERT ERROR");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("errorMsg", e.getMessage());
			resp.sendRedirect("/error");
		}
		
	}
}
