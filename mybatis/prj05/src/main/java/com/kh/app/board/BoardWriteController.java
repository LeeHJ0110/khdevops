package com.kh.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.MemberVo;

@WebServlet("/board/write")
public class BoardWriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberVo loginMemberVo = (MemberVo) req.getSession().getAttribute("loginMemberVo");
		if(loginMemberVo == null) {
			req.getSession().setAttribute("alertMsg", "로그인 먼저 하세요");
			resp.sendRedirect("/home");
		}else {
			req.getRequestDispatcher("/WEB-INF/views/board/write.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MemberVo loginMemberVo = (MemberVo) req.getSession().getAttribute("loginMemberVo");
			if(loginMemberVo == null) {
				throw new Exception("로그인 먼저 하기");
			}
			
			req.setCharacterEncoding("UTF-8");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String writerNo = loginMemberVo.getNo();
			
			BoardVo vo = new BoardVo();
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriterNo(writerNo);
			
			int result = new BoardService().write(vo);
			if(result != 1) {
				throw new Exception("작성 실패");
			}
			req.getSession().setAttribute("alertMsg", "게시글 작성 성공 !");
			resp.sendRedirect("/board/list");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/error");
		}
	}
}
