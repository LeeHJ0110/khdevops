package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCTemplate;
import main.Main;

public class MemberDao {

	public int join(Connection conn, MemberVo vo) throws Exception {
		String sql = """
				INSERT INTO MEMBER(
				    ID
				    , PW
				    , NICK
				) 
				VALUES(
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
		
		MemberVo dbVo = null;
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String pw = rs.getString("PW");
			String nick = rs.getString("NICK");
			String createdAt = rs.getString("CREATED_AT");
			String updateAt = rs.getString("UPDATE_AT");
			String quitYn = rs.getString("QUIT_YN");
			
			dbVo = new MemberVo(no, id, pw, nick, createdAt, updateAt, quitYn);
		}
		
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);
		return dbVo;
	}

	public int editPw(Connection conn, String newPw, String no) throws Exception {
		String sql = "UPDATE MEMBER SET PW = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, newPw);
		pstmt.setString(2, no);
		int result = pstmt.executeUpdate();
		JDBCTemplate.close(pstmt);
		
		return result;
	}

	public MemberVo selectOneByNo(Connection conn, String no) throws Exception {
		String sql = "SELECT * FROM MEMBER WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo dbVo = null;
		if(rs.next()) {
			String iNo = rs.getString("NO");
			String id = rs.getString("ID");
			String pw = rs.getString("PW");
			String nick = rs.getString("NICK");
			String createdAt = rs.getString("CREATED_AT");
			String updateAt = rs.getString("UPDATE_AT");
			String quitYn = rs.getString("QUIT_YN");
			dbVo = new MemberVo(iNo, id, pw, nick, createdAt, updateAt, quitYn);
		}
		
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return dbVo;
	}

	public int editNick(Connection conn, MemberVo vo) throws Exception {
		String sql = """
				UPDATE MEMBER
				    SET NICK = ?
				WHERE NO = ?
				""";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getNick());
		pstmt.setString(2, Main.loginMemberVo.getNo());
		int result = pstmt.executeUpdate();
		
		JDBCTemplate.close(pstmt);
		
		return result;
	}

	public int quit(Connection conn) throws Exception {
		String sql = "UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, Main.loginMemberVo.getNo());
		int result = pstmt.executeUpdate();
		JDBCTemplate.close(pstmt);
		
		return result;
	}

}
