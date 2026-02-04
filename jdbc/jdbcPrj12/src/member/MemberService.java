package member;

import java.sql.Connection;

import main.Main;

import static db.JDBCTemplate.*;

public class MemberService {
	
	private final MemberDao dao = new MemberDao();
	
	public int join(MemberVo vo, String pw2) throws Exception{
		
		vo.setId(vo.getId().trim());
		vo.setPw(vo.getPw().trim());
		vo.setNick(vo.getNick().trim());
		
		//vaildation
		checkIdLenght(vo.getId());
		checkPwLenght(vo.getPw());
	    checkSamePw(vo.getPw(), pw2);
	    checkNick(vo.getNick());
		  
		Connection conn = getConn();
		int result = dao.join(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}
	
	private void checkIdLenght(String id) {
		if(id.length() < 4 || id.length() > 12) {
	       throw new IllegalStateException("[MEMBER-10010] 아이디 길이 확인 필요");
	    }
	}
	private void checkPwLenght(String pw) {
	    if(pw.length() < 4 || pw.length() > 12) {
	       throw new IllegalStateException("[MEMBER-10011] 비밀번호 길이 확인 필요");
	    }
	}
	private void checkSamePw(String pw, String pw2) {
	    if(!pw.equals(pw2)) {
	       throw new IllegalStateException("[MEMBER-10012] 비밀번호 일치여부 확인 필요");
	    }
	}
	private void checkNick(String nick) {
		if(nick.length() < 2 || nick.length() > 6) {
	       throw new IllegalStateException("[MEMBER-10013] 닉네임 길이 확인 필요");
	    }
		if(nick.contains("관리자")) {
	       throw new IllegalStateException("[MEMBER-10014] 닉네임 금지어 체크");
	    }
	}
	
	public MemberVo login(MemberVo vo) throws Exception{
		checkIdLenght(vo.getId());
		checkPwLenght(vo.getPw());
		
	    Connection conn = getConn();
	    MemberVo dbVo = dao.login(conn, vo);
	    close(conn);
	  
	    
		return dbVo;
	}
	public int editPw(String pw, String newPw, String newPw2) throws Exception {
		
		if(!Main.loginMemberVo.getPw().equals(pw)) {
			System.out.println(Main.loginMemberVo.getPw());
			System.out.println(pw);
			throw new IllegalArgumentException("[MEMBER-10031] 비밀번호 확인 필요");
		}
		
		checkPwLenght(newPw);
		checkSamePw(newPw, newPw2);
		
		Connection conn = getConn();
		int result = dao.editPw(conn, newPw, Main.loginMemberVo.getNo());
		close(conn);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public int editNick(MemberVo vo) throws Exception {
		checkNick(vo.getNick());
		
		Connection conn = getConn();
		
		MemberVo dbVo = dao.selectOneByNo(conn, Main.loginMemberVo.getNo());
		
		checkSamePw(dbVo.getPw(), vo.getPw());
		
		int result = dao.editNick(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public int quit() throws Exception {
		Connection conn = getConn();
		int result = dao.quit(conn);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}


}
