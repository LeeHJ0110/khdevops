package book;

import java.sql.PreparedStatement;

public class BookUpdateController {
	public void service() throws Exception {
		System.out.println("도서 번호: ");
		String num = BookManager.sc.nextLine();
		System.out.println("도서 제목: ");
		String title = BookManager.sc.nextLine();
		System.out.println("도서 가격: ");
		String price = BookManager.sc.nextLine();
		
		// SQL
		String sql = "UPDATE BOOK SET TITLE = ?, PRICE = ? WHERE NO = ?";
		PreparedStatement ps = BookManager.conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, price);
		ps.setString(3, num);
		
		int result = ps.executeUpdate();
		// result
		
		if(result == 1) {
			System.out.println("도서삭제 성공");
		}else {
			System.out.println("도서삭제 성공");
		}
	}
}
