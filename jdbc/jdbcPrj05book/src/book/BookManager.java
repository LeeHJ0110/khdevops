package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookManager {
	
	private Connection conn = null;
	private Scanner sc = new Scanner(System.in);
	
	public void process() throws Exception {
		
		initialize();
		
		while(true) {
			System.out.println("----메뉴----");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서수정");
			System.out.println("3. 도서삭제");
			System.out.println("4. 도서조회");
			System.out.println("5. 도서목록등록");
			
			System.out.print("메뉴 번호: ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 0 : return;
			case 1 : insert(); break;
			case 2 : update(); break;
			case 3 : delete(); break;
			case 4 : selectOne(); break;
			case 5 : selectList(); break;
			default: System.out.println("잘못된 번호 입니다");
			}
			
		}
		
	}
	
	public void initialize() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String pw = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pw);
	}
	
	public void insert() throws Exception {
		System.out.print("title: ");
		String x = sc.nextLine();
		System.out.print("price: ");
		String y = sc.nextLine();
		
		String sql = "INSERT INTO BOOK(NO, TITLE, PRICE) VALUES(SEQ_BOOK.NEXTVAL, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, x);
		pstmt.setString(2, y);
		int result = pstmt.executeUpdate();		
		
		if(result == 1) {
			System.out.println("도서 등록 성공");
		}else {
			System.out.println("도서 등록 실패");
		}
	}
	
	public void update() throws Exception {
		System.out.print("number: ");
		String x = sc.nextLine();
		System.out.print("price: ");
		String y = sc.nextLine();
		
		String sql = "UPDATE BOOK SET PRICE = ? WHERE NO = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, y);
		pstmt.setString(2, x);
		int result = pstmt.executeUpdate();
	
		if(result == 1) {
			System.out.println("도서 수정 성공");
		}else {
			System.out.println("도서 수정 실패");
		}
	}
	
	public void delete() throws Exception {
		System.out.print("number: ");
		String x = sc.nextLine();
		
		String sql = "DELETE BOOK WHERE NO = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, x);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("도서 삭제 성공");
		}else {
			System.out.println("도서 삭제 실패");
		}
	}
	
	public void selectOne() throws Exception {
		System.out.print("number: ");
		String x = sc.nextLine();
		
		String sql = "SELECT * FROM BOOK WHERE NO = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, x);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.println("No : " + no);
			System.out.println("Title : " + title);
			System.out.println("Price : " + price);
			System.out.println("Created At : " + createdAt);
		}else {
			System.out.println("조회 실패");
		}
		
	}
	
	public void selectList() throws Exception {
		
		String sql = "SELECT * FROM BOOK ORDER BY NO DESC";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		System.out.print("번호");
		System.out.print("|");
		System.out.print("제목");
		System.out.print("|");
		System.out.print("가격");
		System.out.print("|");
		System.out.print("등록일시");
		System.out.println();

		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String price = rs.getString("PRICE");
			String createdAt = rs.getString("CREATED_AT");
			
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
