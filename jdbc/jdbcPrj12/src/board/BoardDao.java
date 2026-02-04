package board;

import static db.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public int insert(Connection conn, BoardVo vo) throws Exception {
		String sql = """
				INSERT INTO BOARD(
				    TITLE
				    , CONTENT
				    , WRITER_NO
				)
				VALUES(
				    ?
				    , ?
				    , ?
				)
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		pstmt.setString(3, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public int updateTitleByNo(Connection conn, BoardVo vo) throws Exception {
		String sql = "UPDATE BOARD SET TITLE = ?, UPDATED_AT = SYSDATE WHERE NO = ? AND WRITER_NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getNo());
		pstmt.setString(3, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		return result;
	}

	public int updateContentByNo(Connection conn, BoardVo vo) throws Exception {
		String sql = "UPDATE BOARD SET CONTENT = ?, UPDATED_AT = SYSDATE WHERE NO = ? AND WRITER_NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getContent());
		pstmt.setString(2, vo.getNo());
		pstmt.setString(3, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		return result;
	}

	public int updateBoardByNo(Connection conn, BoardVo vo) throws Exception {
		String sql = "UPDATE BOARD SET TITLE = ?, CONTENT = ?, UPDATED_AT = SYSDATE WHERE NO = ? AND WRITER_NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		pstmt.setString(3, vo.getNo());
		pstmt.setString(4, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		return result;
	}
	
	public int deleteBoardByNo(Connection conn, BoardVo vo) throws Exception  {
		String sql = "UPDATE BOARD SET DEL_YN = 'Y' WHERE NO = ? AND WRITER_NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getNo());
		pstmt.setString(2, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		return result;
	}

	public List<BoardVo> selectAll(Connection conn) throws Exception {
		String sql = """
				SELECT 
				    B.NO
				    , B.TITLE
				    , M.NICK    WRITER_NICK
				    , B.HIT
				FROM BOARD B
				JOIN MEMBER M ON B.WRITER_NO = M.NO
				WHERE DEL_YN = 'N'
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<BoardVo> voList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String writerNick = rs.getString("WRITER_NICK");
			String hit = rs.getString("HIT");
			
			BoardVo vo = new BoardVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setWriterNick(writerNick);
			vo.setHit(hit);
			voList.add(vo);
		}
		close(rs);
		close(pstmt);
		
		return voList;
	}

	public BoardVo selectOneByNo(Connection conn, String iNo) throws Exception {
		String sql = """
				SELECT 
				    B.NO
				    , B.TITLE
				    , B.CONTENT
				    , B.WRITER_NO
				    , B.HIT
				    , B.CREATED_AT
				    , B.UPDATED_AT
				    , M.NICK AS WRITER_NICK
				FROM BOARD B
				JOIN MEMBER M ON B.WRITER_NO = M.NO
				WHERE B.NO = ?
				AND B.DEL_YN = 'N'
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, iNo);
		ResultSet rs = pstmt.executeQuery();
		
		BoardVo vo = new BoardVo();
		if(rs.next()) {
			
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String hit = rs.getString("HIT");
			String createdAt = rs.getString("CREATED_AT");
			String updatedAt = rs.getString("UPDATED_AT");
			String writerNick = rs.getString("WRITER_NICK");
			
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setHit(hit);
			vo.setCreatedAt(createdAt);
			vo.setUpdateAt(updatedAt);
			vo.setWriterNick(writerNick);
		}
		close(rs);
		close(pstmt);
		
		return vo;
	}
	
	public int increaseHit(Connection conn, String no) throws Exception {
		String sql = "UPDATE BOARD SET HIT = HIT + 1 WHERE NO = ? AND DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		return result;
		
	}

	public List<BoardVo> searchByWriterNick(Connection conn, String serchValue) throws Exception {
		String sql = """
				SELECT 
				    B.NO
				    , B.TITLE
				    , B.CONTENT
				    , B.WRITER_NO
				    , B.HIT
				    , B.CREATED_AT
				    , B.UPDATED_AT
				    , M.NICK AS WRITER_NICK
				FROM BOARD B
				JOIN MEMBER M ON B.WRITER_NO = M.NO
				WHERE NICK LIKE '%' || ? || '%'
				AND B.DEL_YN = 'N'
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, serchValue);
		ResultSet rs = pstmt.executeQuery();
		
		List<BoardVo> voList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String hit = rs.getString("HIT");
			String createdAt = rs.getString("CREATED_AT");
			String updatedAt = rs.getString("UPDATED_AT");
			String writerNick = rs.getString("WRITER_NICK");
			
			BoardVo vo = new BoardVo(no, title, content, null, writerNick, hit, createdAt, updatedAt, null);
			voList.add(vo);
		}
		return voList;
	}
	

}
