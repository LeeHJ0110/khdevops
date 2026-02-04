package book;

import java.sql.PreparedStatement;

public class BookInsertController{
	public void service() throws Exception {
		// data
		System.out.println("도서 제목: ");
		String title = BookManager.sc.nextLine();
		System.out.println("도서 가격: ");
		String price = BookManager.sc.nextLine();
		
		// SQL
		String sql = "INSERT INTO BOOK(NO, TITLE, PRICE) VALUES(SEQ_BOOK.NEXTVAL, ?, ?)";
		PreparedStatement ps = BookManager.conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, price);
		
		int result = ps.executeUpdate();
		// result
		
		if(result == 1) {
			System.out.println("도서등록 성공");
		}else {
			System.out.println("도서등록 실패");
		}
		
	}
}
