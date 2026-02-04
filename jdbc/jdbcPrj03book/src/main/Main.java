package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("======Book======");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user ="C##KH";
		String password ="1234";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Scanner sc = new Scanner(System.in);
		
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";
		
		
		Statement stmt = conn.createStatement();
		ResultSet rs =  stmt.executeQuery(sql);
		
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.print(no);
			System.out.print("\t|\t");
			System.out.print(title);
			System.out.print("\t|\t");
			System.out.print(price);
			System.out.print("\t|\t");
			System.out.print(createdAt);
			System.out.println();
		}
		
		System.out.println("도서 조회 완료");
	}

}
