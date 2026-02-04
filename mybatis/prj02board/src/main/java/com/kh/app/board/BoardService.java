package com.kh.app.board;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;

public class BoardService {
	
	private BoardDao dao = new BoardDao();

	public int insert(BoardVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		
		int result = dao.insert(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public List<BoardVo> selectBoardList() throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<BoardVo> voList = dao.selectBoardList(ss);
		ss.close();
		return voList;
	}

	public BoardVo selectBoardByNo(String no) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.increaseHit(ss, no);
		if(result != 1) {
			ss.rollback();
			throw new Exception("게시글 조회수 증가 실패");
		}
		BoardVo vo = dao.selectBoardByNo(ss, no);
		ss.commit();
		ss.close();
		return vo;
	}

}
