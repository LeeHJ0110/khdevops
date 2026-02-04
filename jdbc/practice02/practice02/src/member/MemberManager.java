package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCConnection;
import main.Main;
import util.UtilManager;

public class MemberManager {
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
		System.out.println("-----계정 메뉴-----");
		System.out.println("0. 돌아가기");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 계정 수정");
		System.out.println("4. 계정 탈퇴");
		System.out.println("5. 계정 상세조회");
		System.out.println("6. 계정 목록조회");
	}

	private void executeFunction(int num) throws Exception {
		switch (num) {
		case 1: join(); break;
		case 2: login(); break;
		case 3: edit(); break;
		case 4: delete(); break;
		case 5: selectOne(); break;
		case 6: selectAll(); break;
		default: System.out.println("잘못된 번호입니다.");
		}
	}

	private void join() throws Exception {

		System.out.println("----회원가입----");

		System.out.print("아이디 : ");
		String id = UtilManager.SC.nextLine();

		System.out.print("비밀번호 : ");
		String pw = UtilManager.SC.nextLine();

		System.out.print("닉네임 : ");
		String name = UtilManager.SC.nextLine();

		String sql = "INSERT INTO MEMBER(NO, ID, PW, NICK) VALUES(SEQ_MEMBER.NEXTVAL , ?, ?, ?)";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);

		int result = pstmt.executeUpdate();

		if (result == 1) {
			System.out.println("회원가입 성공");
			return;
		}
		System.out.println("회원가입 실패");
	}
	
	private void edit() throws Exception {

		System.out.println("----계정 수정----");

		System.out.print("아이디 : ");
		String id = UtilManager.SC.nextLine();

		System.out.print("비밀번호 : ");
		String pw = UtilManager.SC.nextLine();

		System.out.print("닉네임 : ");
		String name = UtilManager.SC.nextLine();

		String sql = "UPDATE MEMBER SET PW = ?, NICK = ? WHERE ID = ?";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pw);
		pstmt.setString(2, name);
		pstmt.setString(3, id);

		int result = pstmt.executeUpdate();

		if (result == 1) {
			System.out.println("계정 수정 성공");
			return;
		}
		System.out.println("계정 수정 실패");
	}
	
	private void delete() throws Exception {
		
		System.out.println("----계정 삭제----");
		
		System.out.print("번호 : ");
		String no = UtilManager.SC.nextLine();
		
		String sql = "UPDATE MEMBER SET DEL_YN = 'Y' WHERE NO = ?";
		
		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		
		int result = pstmt.executeUpdate();
		
		if (result == 1) {
			System.out.println("계정 삭제 성공");
			return;
		}
		System.out.println("계정 삭제 실패");
	}

	private void login() throws Exception {

		System.out.println("----로그인----");

		System.out.print("아이디 : ");
		String id = UtilManager.SC.nextLine();

		System.out.print("비밀번호 : ");
		String pw = UtilManager.SC.nextLine();

		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ? AND DEL_YN = 'N'";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getString("NICK") + "님 환영합니다");
			Main.loginMemberId = rs.getString("ID");
			return;
		}
		System.out.println("로그인 실패");
		

	}
	
	private void selectOne() throws Exception {

		System.out.println("----계정 상세조회----");

		System.out.print("번호 : ");
		String no = UtilManager.SC.nextLine();

		String sql = "SELECT * FROM MEMBER WHERE NO = ? AND DEL_YN = 'N'";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			System.out.println(
			        rs.getString("NO") + " | " +
			        rs.getString("ID") + " | " +
			        rs.getString("PW") + " | " +
			        rs.getString("NICK") + " | " +
			        rs.getString("CREATED_AT")
			    );
			return;
		}
		System.out.println("조회 실패");
	}

	private void selectAll() throws Exception {

		System.out.println("계정 목록조회");

		String sql = "SELECT * FROM MEMBER WHERE DEL_YN = 'N'";

		Connection conn = JDBCConnection.getConnetion();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
		    System.out.println(
		        rs.getString("NO") + " | " +
		        rs.getString("ID") + " | " +
		        rs.getString("PW") + " | " +
		        rs.getString("NICK") + " | " +
		        rs.getString("CREATED_AT")
		    );
		}

	}
}
