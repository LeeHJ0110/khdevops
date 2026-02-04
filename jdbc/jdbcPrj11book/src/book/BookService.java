package book;

import java.sql.Connection;
import java.util.List;

import static db.JDBCTemplate.*;

public class BookService {
	
	private final BookDao dao = new BookDao();
	
	public int insert(BookVo vo) throws Exception {
		if(vo.getTitle().length() < 1) {
			new IllegalArgumentException("[BOOK-10001]도서 제목 길이 너무 짧음");
		}
		if(Integer.parseInt(vo.getPrice()) < 1) {
			new IllegalArgumentException("[BOOK-10002]도서 제목 길이 너무 짧음");
		}
		
		Connection conn = getConn();
		int result = dao.insert(conn, vo);
		
		if(result == 1 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}
	
	public int edit(BookVo vo) throws Exception {
		if(vo.getPrice().length() < 1) {
			new IllegalArgumentException("가격은 0보다 작을 수 없습니다");
		}
		Connection conn = getConn();
		int result = dao.edit(conn, vo);
		
		if(result == 1 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}
	
	public int delete(String no) throws Exception{
		Connection conn = getConn();
		int result = dao.delete(conn, no);
		
		if(result == 1 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public List<BookVo> selectList() throws Exception {
		Connection conn = getConn();
		List<BookVo> result = dao.selectList(conn);
		
		close(conn);
		
		return result;
	}
	
	public List<BookVo> searchByTitle(String title) throws Exception {
		Connection conn = getConn();
		List<BookVo> result = dao.searchByTitle(conn, title);
		
		close(conn);
		
		return result;
	}
}
