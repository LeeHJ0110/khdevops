package com.kh.app.member;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.app.db.JDBCTemplate;

public class MemberService {

	public int join(MemberVo vo) throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		int result = new MemberDao().join(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public ArrayList<MemberVo> selectMemberList() throws Exception {
		Connection conn = JDBCTemplate.getConn();

		ArrayList<MemberVo> voList = new MemberDao().selectMemberList(conn);
		JDBCTemplate.close(conn);
		return voList;
	}

	public MemberVo login(MemberVo vo) throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		MemberVo loginMemberVo = new MemberDao().login(conn, vo);
		
		JDBCTemplate.close(conn);
		
		return loginMemberVo;
	}

}
