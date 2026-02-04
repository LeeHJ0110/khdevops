package pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PokemonManager {
	
	private final Connection conn;
	private final Scanner sc;
	
	public PokemonManager() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String pw = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pw);
		sc = new Scanner(System.in);
		
	}
	
	public void process() throws Exception {
		System.out.println("=====포켓몬 도감=====");
		
		while(true) {
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 포켓몬 등록");
			System.out.println("2. 포켓몬 수정");
			System.out.println("3. 포켓몬 삭제");
			System.out.println("4. 포켓몬 상세조회");
			System.out.println("5. 포켓몬 목록조회");
			
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 0: System.out.println("프로그램을 종료 합니다"); return;
			case 1: insert(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: selectOne(); break;
			case 5: selectList(); break;
			default : System.out.println("잘못된 번호 입니다");
			}
		}
		
	}
	
	public void insert() throws Exception {
		
		System.out.print("name: ");
		String x = sc.nextLine();
		
		//SQL
		String sql = "INSERT INTO POKEMON(NO, NAME) VALUES(SEQ_POKEMON.NEXTVAL, ?)";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		//execute
		int result = pstmt.executeUpdate();	
		
		//result || rs
		if(result == 1) {
			System.out.println("포켓몬 등록 성공");
		}else {
			System.out.println("포켓몬 등록 실패");
		}
		
	}
	
	public void update() throws Exception {
		
		System.out.println("no: ");
		String y = sc.nextLine();
		System.out.println("name: ");
		String x = sc.nextLine();
		//SQL
		String sql = "UPDATE POKEMON SET NAME = ? WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		pstmt.setString(2, y);
		//execute
		int result = pstmt.executeUpdate();
		//result || rs
		if(result == 1) {
			System.out.println("포켓몬 수정 성공");
		}else {
			System.out.println("포켓몬 수정 실패");
		}
		
	}
	public void delete() throws Exception {
		System.out.println("no: ");
		String x = sc.nextLine();
		//SQL
		String sql = "DELETE POKEMON WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		//execute
		int result = pstmt.executeUpdate();
		//result || rs
		if(result == 1) {
			System.out.println("포켓몬 삭제 성공");
		}else {
			System.out.println("포켓몬 삭제 실패");
		}
	}
	public void selectOne() throws Exception {
		System.out.println("no: ");
		String x = sc.nextLine();
		//SQL
		String sql = "SELECT * FROM POKEMON WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs
		if(rs.next()) {
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.println("no: " + no);
			System.out.println("name: " + name);
			System.out.println("createdAt: " + createdAt);
		}else {
			System.out.println("포켓몬 조회 실패");
		}
	}
	public void selectList() throws Exception {
		//SQL
		String sql = "SELECT * FROM POKEMON ORDER BY NO DESC";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs
		
		System.out.println("번호 | 이름 | 생성일자");
		while(rs.next()) {
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.print(no);
			System.out.print(" | ");
			System.out.print(name);
			System.out.print(" | ");
			System.out.print(createdAt);
			System.out.println();
		}
	}
	
}
