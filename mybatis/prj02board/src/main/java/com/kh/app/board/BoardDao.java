package com.kh.app.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BoardDao {

	public int insert(SqlSession ss, BoardVo vo) {
		return ss.insert("BoardMapper.write", vo);
	}

	public List<BoardVo> selectBoardList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectBoardAll");
	}

	public BoardVo selectBoardByNo(SqlSession ss, String no) {
		return ss.selectOne("BoardMapper.selectBoardByNo", no);
	}

	public int increaseHit(SqlSession ss, String no) {
		return ss.update("BoardMapper.increaseHit", no);
	}

}
