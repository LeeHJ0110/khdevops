package com.kh.app.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.app.util.JDBCTemplate;

public class BoardDao {
	public int insert(Connection conn, BoardVo vo) throws Exception {
		String sql ="""
				INSERT INTO BOARD
				(
					NO
					, TITLE
					, CONTENT
				)VALUES(
					SEQ_BOARD.NEXTVAL
					, ?
					, ?
				)
				""";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		int result = pstmt.executeUpdate();
		
		JDBCTemplate.close(pstmt);
		return result;
	}

	public ArrayList<BoardVo> selectBoardList(Connection conn) throws Exception {
		String sql ="""
				SELECT * FROM BOARD
				WHERE DEL_YN = 'N'
				ORDER BY NO DESC
				""";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BoardVo> voList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String createdAt = rs.getString("CREATED_AT");
			String updatedAt = rs.getString("UPDATED_AT");
			String hit = rs.getString("HIT");
			String delYn = rs.getString("DEL_YN");
			
			BoardVo vo = new BoardVo(no, title, content, createdAt, updatedAt, hit, delYn);
			voList.add(vo);
		}
		return voList;
	}
}
