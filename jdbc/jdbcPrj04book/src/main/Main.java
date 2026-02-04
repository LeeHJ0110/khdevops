package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String password = "1234";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Scanner sc=  new Scanner(System.in);
		
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";

		PreparedStatement pstmt =  conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			String no = rs.getString ("NO");
			String title = rs.getString ("TITLE");
			String price = rs.getString ("PRICE");
			String createdAt = rs.getString ("CREATED_AT");
			
			System.out.println(no);
			System.out.println(title);
			System.out.println(price);
			System.out.println(createdAt);
		}
		
		
		
	}
}
