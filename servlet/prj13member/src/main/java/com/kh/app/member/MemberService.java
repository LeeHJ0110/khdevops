package com.kh.app.member;

import java.sql.Connection;

import static com.kh.app.db.JDBCTemplate.*;

public class MemberService {

	public int join(MemberVo vo) throws Exception {
		Connection conn = getConn();
		
		int result = new MemberDao().join(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}

		close(conn);
		
		return result;
	}

	public MemberVo login(MemberVo vo) throws Exception {
		Connection conn = getConn();
		
		MemberVo loginMemberVo = new MemberDao().login(conn,vo);
		
		close(conn);
		
		return loginMemberVo;
	}

}
