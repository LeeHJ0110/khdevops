package com.kh.app.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTamplate;

public class BoardSerivce {
	
	private BoardDao dao = new BoardDao();
	
	public int write(BoardVo vo) throws Exception {
		SqlSession ss = SqlSessionTamplate.getSqlSession();
		int result = dao.write(vo, ss);
		if(result != 1) {
			throw new Exception("write fail");
		}
		ss.commit();
		ss.close();
		return result;
	}

	public List<BoardVo> list(Map<String, String> map) throws Exception {
		SqlSession ss = SqlSessionTamplate.getSqlSession();
		List<BoardVo> voList = dao.list(ss, map);
		ss.close();
		return voList;
	}

}
