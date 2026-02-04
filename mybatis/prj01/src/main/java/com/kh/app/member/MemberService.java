package com.kh.app.member;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;


public class MemberService {

	public int join(MemberVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		
		int result = new MemberDao().join(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		ss.close();
		return result;
		
	}

	public MemberVo login(MemberVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		
		MemberVo dbVo = new MemberDao().login(ss, vo);
		
		ss.close();
		
		return dbVo;
	}

}
