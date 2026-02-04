package book;

import java.sql.PreparedStatement;

public class BookDeleteController {
	public void service() throws Exception {
		System.out.println("도서 번호: ");
		String title = BookManager.sc.nextLine();
		
		// SQL
		String sql = "DELETE BOOK WHERE NO = ?";
		PreparedStatement ps = BookManager.conn.prepareStatement(sql);
		ps.setString(1, title);
		
		int result = ps.executeUpdate();
		// result
		
		if(result == 1) {
			System.out.println("도서삭제 성공");
		}else {
			System.out.println("도서삭제 성공");
		}
	}
}
