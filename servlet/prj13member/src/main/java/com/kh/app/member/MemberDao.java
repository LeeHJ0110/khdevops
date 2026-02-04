package com.kh.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.app.db.JDBCTemplate;

public class MemberDao {

	public int join(Connection conn, MemberVo vo) throws Exception {
		String sql = """
				INSERT INTO MEMBER(
					ID
					, PW
					, NICK
				)VALUES(
					?
					, ?
					, ?
				)
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		pstmt.setString(3, vo.getNick());
		int result = pstmt.executeUpdate();
		
		JDBCTemplate.close(pstmt);
		
		return result;
	}

	public MemberVo login(Connection conn, MemberVo vo) throws Exception {
		String sql = """
				SELECT *
				FROM MEMBER
				WHERE ID = ?
				AND PW = ?
				AND QUIT_YN = 'N'
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo loginMemberVo = null;
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String pw = rs.getString("PW");
			String nick = rs.getString("NICK");
			String createdAt = rs.getString("CREATED_AT");
			String updatedAt = rs.getString("UPDATED_AT");
			String quitYn = rs.getString("QUIT_YN");
			
			loginMemberVo = new MemberVo(no, id, pw, nick, createdAt, updatedAt, quitYn);
		}
		
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return loginMemberVo;
		
	}

}
