package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCTemplate;
import util.KhUtil;

public class MemberManager {
	
	
	public void process() throws Exception {
		
		while(true) {
			
			showMenu();
			System.out.println("번호: ");
			
			int num = KhUtil.scanNum();
			if(num == 0) {
				System.out.println("초기 메뉴로 돌아가기");
				return;
			}
			callFunction(num);
		}
		
	}

	private void showMenu() {
		System.out.println("------Member-------");
		System.out.println("0. 이전으로");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 비밀번호 수정");
		System.out.println("4. 닉네임 수정");
		System.out.println("5. 회원탈퇴");
	}

	private void callFunction(int num) throws Exception {
		switch(num) {
		case 1: join(); break;
		case 2: login(); break;
		case 3: editPw(); break;
		case 4: editNick(); break;
		case 5: quit(); break;
		default: System.out.println("잘못된 번호 입니다");
		}
	}

	private void quit() throws Exception {
		System.out.println("-----회원탈퇴-----");
		String sql = "UPDATE MEMBER SET DEL_YN = 'Y' WHERE NO = ?";
		
		System.out.println("no :");
		String no = KhUtil.SC.nextLine();
		
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("회원탈퇴 성공");
		}else {
			System.out.println("회원탈퇴 실패");
		}
	}

	private void editNick() throws Exception {
		System.out.println("-----닉네임 수정-----");
		String sql = "UPDATE MEMBER SET NICK = ? WHERE NO = ? AND DEL_YN = 'N'";
		
		System.out.println("no :");
		String no = KhUtil.SC.nextLine();
		System.out.println("pw :");
		String nick = KhUtil.SC.nextLine();
		
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nick);
		pstmt.setString(2, no);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("닉네임 수정 성공");
		}else {
			System.out.println("닉네임 수정 실패");
		}
	}

	private void editPw() throws Exception {
		System.out.println("-----비밀번호 수정-----");
		String sql = "UPDATE MEMBER SET PW = ? WHERE NO = ? AND DEL_YN = 'N'";
		
		System.out.println("no :");
		String no = KhUtil.SC.nextLine();
		System.out.println("pw :");
		String pw = KhUtil.SC.nextLine();
		
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pw);
		pstmt.setString(2, no);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("비밀번호 수정 성공");
		}else {
			System.out.println("비밀번호 수정 실패");
		}
		
	}

	private void login() throws Exception {
		System.out.println("-----로그인-----");
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ? AND DEL_YN = 'N'";
		
		System.out.println("id :");
		String id = KhUtil.SC.nextLine();
		System.out.println("pw :");
		String pw = KhUtil.SC.nextLine();
		
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("로그인 성공");
			String no = rs.getString("NO");
			String mId = rs.getString("ID");
			String mPw = rs.getString("PW");
			String nick = rs.getString("NICK");
			String createdAt = rs.getString("CREATED_AT");
			String delYn = rs.getString("DEL_YN");
			
			System.out.println(no);
			System.out.println(mId);
			System.out.println(mPw);
			System.out.println(nick);
			System.out.println(createdAt);
			System.out.println(delYn);
		}else {
			System.out.println("로그인 실패");
		}
	}

	private void join() throws Exception {
		System.out.println("-----회원가입-----");
		String sql = "INSERT INTO MEMBER(NO, ID, PW, NICK) VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
		
		System.out.println("id :");
		String id = KhUtil.SC.nextLine();
		System.out.println("pw :");
		String pw = KhUtil.SC.nextLine();
		System.out.println("nick :");
		String nick = KhUtil.SC.nextLine();
		
		Connection conn = JDBCTemplate.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, nick);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		
	}
	
}