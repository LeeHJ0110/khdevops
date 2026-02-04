package com.kh.app.member;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int join(MemberVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		MemberMapper mapper = ss.getMapper(MemberMapper.class);
		int result = mapper.join(vo);
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

}
