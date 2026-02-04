package com.kh.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/detail")
public class BoardDetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			BoardVo vo = new BoardService().selectBoardByNo(no);
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/board/detail.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
		
	}
}
