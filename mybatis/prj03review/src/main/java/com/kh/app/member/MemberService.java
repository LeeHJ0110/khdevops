package com.kh.app.member;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;

public class MemberService {
	
	private MemberDao dao = new MemberDao();
	
	public int join(MemberVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.join(ss, vo);
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
		MemberVo dbVo = dao.login(ss, vo);
		ss.close();
		return dbVo;
	}

	public int editPw(MemberVo dbVo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.editPw(ss, dbVo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public int editNick(MemberVo dbVo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.editNick(ss, dbVo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public int quit(MemberVo dbVo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.quit(ss, dbVo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

}
