package com.kh.app.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	public int write(BoardVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		BoardMapper mapper = ss.getMapper(BoardMapper.class);
		int result = mapper.write(vo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
		
	}

	public List<BoardVo> selectList() throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<BoardVo> voList = dao.selectList(ss);
		ss.close();
		return voList;
	}

}
