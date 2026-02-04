package video;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCConnection;
import main.Main;
import util.UtilManager;

public class VideoManager {
	
	public void process() throws Exception {

		while (true) {

			printMenu();

			System.out.print("번호: ");
			int num = UtilManager.scanNum();

			if (num == 0) {
				System.out.println("돌아가기");
				return;
			}

			executeFunction(num);
			System.out.println();
		}

	}

	private void printMenu() {
		System.out.println("-----영상 메뉴-----");
		System.out.println("0. 돌아가기");
		System.out.println("1. 영상 등록");
		System.out.println("2. 영상 수정");
		System.out.println("3. 영상 삭제");
		System.out.println("4. 영상 상세조회");
		System.out.println("5. 영상 목록조회");
	}

	private void executeFunction(int num) throws Exception {
		switch (num) {
		case 1: upload(); break;
		case 2: edit(); break;
		case 3: delete(); break;
		case 4: selectOne(); break;
		case 5: selectAll(); break;
		default: System.out.println("잘못된 번호입니다.");
		}
	}
	
	private void upload() throws Exception {
		
		System.out.println("----영상 등록----");
		
		System.out.print("제목 : ");
		String title = UtilManager.SC.nextLine();
		System.out.print("주소 : ");
		String url = UtilManager.SC.nextLine();
		
		String sql = "INSERT INTO VIDEO(NO, TITLE, URLS, MAKER_ID) "
				+ "VALUES(SEQ_VIDEO.NEXTVAL, ? ,?, ?)";
		
		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, url);
		pstmt.setString(3, Main.loginMemberId);
		
		int result = pstmt.executeUpdate();
		
		if (result == 1) {
			System.out.println("영상 등록 성공");
			return;
		}
		System.out.println("영상 등록 실패");
	}
	private void edit() throws Exception {
		
		System.out.println("----영상 수정----");
		
		System.out.print("번호 : ");
		String no = UtilManager.SC.nextLine();
		System.out.print("번호 : ");
		String title = UtilManager.SC.nextLine();
		System.out.print("번호 : ");
		String url = UtilManager.SC.nextLine();
		System.out.print("번호 : ");
		String id = UtilManager.SC.nextLine();
		
		String sql = "UPDATE VIDEO SET TITLE = ? , URLS = ?,  "
				+ "MAKER_ID = ?, UPDATED_AT = SYSDATE  "
				+ "WHERE NO = ? AND DEL_YN = 'N'";
		
		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, url);
		pstmt.setString(3, id);
		pstmt.setString(4, no);
		
		int result = pstmt.executeUpdate();
		
		if (result == 1) {
			System.out.println("영상 수정 성공");
			return;
		}
		System.out.println("영상 수정 실패");
	}
	private void delete() throws Exception {
		
		System.out.println("----영상 삭제----");
		
		System.out.print("번호 : ");
		String no = UtilManager.SC.nextLine();
		
		String sql = "UPDATE VIDEO SET DEL_YN = 'Y' WHERE NO = ?";
		
		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		
		int result = pstmt.executeUpdate();
		
		if (result == 1) {
			System.out.println("영상 삭제 성공");
			return;
		}
		System.out.println("영상 삭제 실패");
	}
	
	private void selectOne() throws Exception {

		System.out.println("----영상 상세조회----");

		System.out.print("번호 : ");
		String no = UtilManager.SC.nextLine();

		String sql = "SELECT * FROM VIDEO WHERE NO = ? AND DEL_YN = 'N'";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			System.out.println(
			        rs.getString("NO") + " | " +
			        rs.getString("TITLE") + " | " +
			        rs.getString("URLS") + " | " +
			        rs.getString("MAKER_ID") + " | " +
			        rs.getString("UPDATED_AT") + " | " +
			        rs.getString("CREATED_AT")
			    );
			return;
		}
		System.out.println("조회 실패");
	}

	private void selectAll() throws Exception {

		System.out.println("영상 목록조회");

		String sql = "SELECT * FROM VIDEO WHERE DEL_YN = 'N'";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			
		    System.out.print(rs.getString("NO") + " | ");
		    System.out.print(rs.getString("TITLE") + " | ");
		    System.out.print(rs.getString("URLS") + " | ");
		    System.out.print(rs.getString("MAKER_ID") + " | ");
		    System.out.print(rs.getString("UPDATED_AT") + " | ");
		    System.out.print(rs.getString("CREATED_AT"));
		    System.out.println();
		}

	}
}
