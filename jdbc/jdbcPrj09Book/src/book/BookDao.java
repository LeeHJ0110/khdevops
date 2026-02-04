package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.JDBCTemplate;

public class BookDao {
	
	public int insert(BookVo vo) throws Exception {
		String sql = "INSERT INTO BOOK(NO, TITLE, PRICE) VALUES (SEQ_BOOK.NEXTVAL, ?, ?)";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getPrice());
		return pstmt.executeUpdate();
	}
	
	public int update(BookVo vo) throws Exception  {
		String sql = "UPDATE BOOK SET PRICE = ? WHERE NO = ?";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1, vo.getPrice());
		pstmt.setString(2, vo.getNo());
		return pstmt.executeUpdate();
	}
	
	public int delete(String no) throws Exception  {
		String sql = "DELETE BOOK WHERE NO = ?";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		return pstmt.executeUpdate();
	}
	public ArrayList<BookVo> selectListDesc() throws Exception  {
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo(no, title, price, createdAt);
			voList.add(vo);
		}
		return voList;
	}
	public ArrayList<BookVo> selectListAsc() throws Exception  {
		String sql = "SELECT * FROM BOOK ORDER BY NO";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo(no, title, price, createdAt);
			voList.add(vo);
		}
		return voList;
	}
	public ArrayList<BookVo> searchByTitle(String iTitle) throws Exception  {
		String sql = "SELECT * FROM BOOK WHERE TITLE LIKE ?";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%" + iTitle + "%");
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo(no, title, price, createdAt);
			voList.add(vo);
		}
		return voList;
	}
	public ArrayList<BookVo> searchByPrice(String iPrice) throws Exception  {
		String sql = "SELECT * FROM BOOK WHERE PRICE = ?";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, iPrice);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BookVo> voList = new ArrayList<BookVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			BookVo vo = new BookVo(no, title, price, createdAt);
			voList.add(vo);
		}
		return voList;
	}
	public BookVo selectOneByNo(String iNo) throws Exception  {
		String sql = "SELECT * FROM BOOK WHERE NO = ?";
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, iNo);
		ResultSet rs = pstmt.executeQuery();
		
		BookVo vo = null;
		if(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			vo = new BookVo(no, title, price, createdAt);
		}
		return vo;
	}
	
}
