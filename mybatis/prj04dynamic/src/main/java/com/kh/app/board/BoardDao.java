package com.kh.app.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class BoardDao {

	public int write(BoardVo vo, SqlSession ss) {
		return ss.insert("BoardMapper.write", vo);
	}

	public List<BoardVo> list(SqlSession ss, Map<String, String> map) {
		return ss.selectList("BoardMapper.selectBoard", map);
	}

}
