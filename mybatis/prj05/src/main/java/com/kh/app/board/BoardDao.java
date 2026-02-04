package com.kh.app.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BoardDao {

	public int write(SqlSession ss, BoardVo vo) {
		return ss.insert("BoardMapper.write", vo);
	}

	public List<BoardVo> selectList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectList");
	}

}
