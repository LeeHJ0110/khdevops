package com.kh.app.board;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.app.util.JDBCTemplate;

public class BoardService {
	
	public int insert(BoardVo vo) throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		int result = new BoardDao().insert(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		return result;
	}

	public ArrayList<BoardVo> selectBoardList() throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConn();
		//DAO
		ArrayList<BoardVo> voList = new BoardDao().selectBoardList(conn);
		//close
		JDBCTemplate.close(conn);
		return voList;
	}
}
