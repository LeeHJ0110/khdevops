package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, pw);
		
//		String sql = "INSERT INTO BOOK(TITLE, PRICE) VALUES('데미안', 2000)";
//		String sql = "UPDATE BOOK SET PRICE = 500";
//		String sql = "DELETE BOOK WHERE TITLE = '어린왕자'";
		String sql = "SELECT * FROM BOOK";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String title = rs.getString("title");
			int price = rs.getInt("price");
			
			System.out.println(title + "의 가격은 " + price + "원");
		}
	}

}