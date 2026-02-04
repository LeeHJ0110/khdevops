package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("=========Member=========");
		
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String id = "C##KH";
		String pw = "1234";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, id, pw);
		
//		String sql = "INSERT INTO MEMBER(NO, ID, PW, NICK) VALUES(SEQ_MEMBER.NEXTVAL, 'USER02', '1234', 'NICK02')";
//		String sql = "UPDATE MEMBER SET PW = '0000' WHERE ID = 'USER01'";
//		String sql = "DELETE MEMBER WHERE ID = 'USER01'";
		String sql = "SELECT LPAD(NO, 2, 0) AS NO, ID, PW, NICK, CREATED_AT FROM MEMBER";
		
		
		Statement stmt = conn.createStatement();
//		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String no = rs.getString("NO");
			String memberId = rs.getString("ID");
			String memberPw = rs.getString("PW");
			String nick = rs.getString("Nick");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.print(no);
			System.out.print(" / ");
			System.out.print(memberId);
			System.out.print(" / ");
			System.out.print(memberPw);
			System.out.print(" / ");
			System.out.print(nick);
			System.out.print(" / ");
			System.out.print(createdAt);
			System.out.println();
		}
		
		
	}

}
