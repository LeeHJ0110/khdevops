package book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookSelectListController {
	public void service() throws Exception {
		
		// SQL
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";
		
		PreparedStatement ps = BookManager.conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
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
		}
	}
}
