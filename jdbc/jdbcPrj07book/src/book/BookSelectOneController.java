package book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookSelectOneController {
	public void service() throws Exception {
		System.out.println("도서 번호: ");
		String num = BookManager.sc.nextLine();
		// SQL
		String sql = "SELECT * FROM BOOK WHERE NO = ?";
		PreparedStatement ps = BookManager.conn.prepareStatement(sql);
		ps.setString(1, num);
		
		ResultSet rs = ps.executeQuery();
		// result
		
		if(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATE_AT");
			
			System.out.print(no);
			System.out.print("|");
			System.out.print(title);
			System.out.print("|");
			System.out.print(price);
			System.out.print("|");
			System.out.print(createdAt);
			System.out.println();
		}else {
			System.out.println("도서 조회 실패");
		}
	}
}
