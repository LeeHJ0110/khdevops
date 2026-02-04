package book;

import static db.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public int insert(Connection conn, BookVo vo) throws Exception {
		String sql = "INSERT INTO BOOK(NO, TITLE, PRICE) VALUES(SEQ_BOOK.NEXTVAL, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getPrice());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}
	public int edit(Connection conn, BookVo vo) throws Exception {
		String sql = "UPDATE BOOK SET PRICE = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getPrice());
		pstmt.setString(2, vo.getNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}
	
	public int delete(Connection conn, String no) throws Exception {
		String sql = "DELETE BOOK WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}
	public List<BookVo> selectList(Connection conn) throws Exception {
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()){
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setPrice(price);
			vo.setCreatedAt(createdAt);
			
			voList.add(vo);
		}
		
		close(rs);
		close(pstmt);
		
		return voList;
	}
	
	public List<BookVo> searchByTitle(Connection conn, String iTitle) throws Exception{
		String sql = "SELECT * FROM BOOK WHERE TITLE LIKE ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%" + iTitle + "%");
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()){
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setPrice(price);
			vo.setCreatedAt(createdAt);
			
			voList.add(vo);
		}
		
		close(rs);
		close(pstmt);
		
		return voList;
		
		
	}
}
