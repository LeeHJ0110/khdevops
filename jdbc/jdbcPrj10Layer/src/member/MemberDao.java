package member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.JDBCTemplate;

public class MemberDao {
	
	public int join(MemberVo vo) throws Exception {
		String sql = "INSERT INTO MEMBER(NO, ID, PW, NICK) "
				+ "VALUES(SEQ_MEMBER.NEXTVAL , ?, ?, ?)";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		pstmt.setString(3, vo.getNick());
		return pstmt.executeUpdate();
	}
	
}
