package com.kh.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/write")
public class BoardInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/board/write.jsp").forward(req, resp);
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
			
			int result = new BoardSerivce().write(vo);
			
			if(result == 1) {
				resp.sendRedirect("/board/list");
			}else {
				throw new Exception("게시글 작성 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
		
		
	}
}
