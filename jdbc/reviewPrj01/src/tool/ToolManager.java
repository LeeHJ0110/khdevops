package tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ToolManager {
	private final Scanner sc;
	private final Connection conn;
	
	public ToolManager() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
		String user = "C##KH";
		String pw = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pw);
		sc = new Scanner(System.in);
	}
	
	public void process() throws Exception {
		System.out.println("=====공구상점=====");
		
		while(true) {
			System.out.println();
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 공구 등록");
			System.out.println("2. 공구 수정");
			System.out.println("3. 공구 삭제");
			System.out.println("4. 공구 목록조회");
//			System.out.println("5. 재고 감소");
			
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 0: System.out.println("프로그램 종료"); return;
			case 1: insert(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: selectList(); break;
//			case 5: decrease(); break;
			}
		}
	}
	
	public void insert() throws Exception {
		System.out.println("공구 등록");
		System.out.print("도구 이름: ");
		String x = sc.nextLine();
		System.out.print("도구 가격: ");
		String y = sc.nextLine();
		System.out.print("도구 갯수: ");
		String z = sc.nextLine();
		
		
		//SQL
		String sql = "INSERT INTO TOOLS(NO, NAME, PRICE, COUNT) VALUES(SEQ_TOOLS.NEXTVAL, ?, ?, ?)";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		pstmt.setString(2, y);
		pstmt.setString(3, z);
		//execute
		int result = pstmt.executeUpdate();	
		
		//result || rs
		if(result == 1) {
			System.out.println("공구 등록 성공");
		}else {
			System.out.println("공구 등록 실패");
		}
	}
	
	public void update() throws Exception {
		System.out.println("공구 수정");
		showNumber();
		System.out.print("도구 번호: ");
		String num = sc.nextLine();
		if(!selectOne(num)) {
			return;
		}
		System.out.print("도구 이름: ");
		String x = sc.nextLine();
		System.out.print("도구 가격: ");
		String y = sc.nextLine();
		System.out.print("도구 갯수: ");
		String z = sc.nextLine();
		
		
		//SQL
		String sql = "UPDATE TOOLS SET NAME = ?, PRICE = ?, COUNT = ? WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		pstmt.setString(2, y);
		pstmt.setString(3, z);
		pstmt.setString(4, num);
		
		//execute
		int result = pstmt.executeUpdate();	
		
		//result || rs
		if(result == 1) {
			System.out.println("공구 수정 성공");
		}else {
			System.out.println("공구 수정 실패");
		}
	}
	
	public void delete() throws Exception {
		System.out.println("공구 삭제");
		showNumber();
		System.out.print("도구 번호: ");
		String x = sc.nextLine();
		
		
		//SQL
		String sql = "DELETE TOOLS WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, x);
		//execute
		int result = pstmt.executeUpdate();	
		
		//result || rs
		if(result == 1) {
			System.out.println("공구 삭제 성공");
		}else {
			System.out.println("공구 삭제 실패");
		}
	}
	
//	public void decrease() throws Exception{
//		System.out.println("재고 감소");
//		showNumber();
//		System.out.print("도구 번호: ");
//		String num = sc.nextLine();
//		if(!selectOne(num)) {
//			return;
//		}
//		System.out.print("재고 감소량: ");
//		String x = sc.nextLine();
//		System.out.println(getCount(num));
//		if(getCount(num) > Integer.parseInt(x)) {
//			System.out.println("감소량이 재고량보다 높습니다.");
//			return;
//		}
//		
//		//SQL
//		String sql = "UPDATE TOOLS SET COUNT = COUNT - ? WHERE NO = ?";
//		//pstmt
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		//setString?
//		pstmt.setString(1, x);
//		pstmt.setString(2, num);
//		//execute
//		int result = pstmt.executeUpdate();	
//		
//		//result || rs
//		if(result == 1) {
//			System.out.println("공구 수정 성공");
//		}else {
//			System.out.println("공구 수정 실패");
//		}
//	}
	
	public boolean selectOne(String num) throws Exception {
		//SQL
		String sql = "SELECT * FROM TOOLS WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, num);
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs
		System.out.println("번호 | 이름 | 가격 | 재고 | 생성일자");
		if(rs.next()) {
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String count = rs.getString("COUNT");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.print(no);
			System.out.print(" | ");
			System.out.print(name);
			System.out.print(" | ");
			System.out.print(price);
			System.out.print(" | ");
			System.out.print(count);
			System.out.print(" | ");
			System.out.print(createdAt);
			System.out.println();
			
			return true;
		}
		System.out.println("공구 조회 실패");
		return false;
		
	}
	
	public void selectList() throws Exception {
		System.out.println("공구 목록조회");
		//SQL
		String sql = "SELECT * FROM TOOLS ORDER BY NO DESC";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs
		
		System.out.println("번호 | 이름 | 가격 | 재고 | 생성일자");
		while(rs.next()) {
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String count = rs.getString("COUNT");
			String createdAt = rs.getString("CREATED_AT");
			
			System.out.print(no);
			System.out.print(" | ");
			System.out.print(name);
			System.out.print(" | ");
			System.out.print(price);
			System.out.print(" | ");
			System.out.print(count);
			System.out.print(" | ");
			System.out.print(createdAt);
			System.out.println();
		}
	}
	
	public void showNumber() throws Exception {
		String sql = "SELECT NO FROM TOOLS";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs	
		System.out.println("조회 가능 번호");
		while(rs.next()) {
			String no = rs.getString("NO");
			System.out.print(no + ", ");
		}
		System.out.println();
	}
	
	public int getCount(String num) throws Exception {
		String sql = "SELECT COUNT FROM TOOLS WHERE NO = ?";
		//pstmt
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//setString?
		pstmt.setString(1, num);
		//execute
		ResultSet rs = pstmt.executeQuery();
		//result || rs	
		System.out.println("조회 가능 번호");
		if(rs.next()) {
			return rs.getInt("NO");
		}
		return 0;
	}
	
}
