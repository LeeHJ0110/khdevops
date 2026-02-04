package com.kh.app.member;

import org.apache.ibatis.session.SqlSession;

public class MemberDao {

	public int join(SqlSession ss, MemberVo vo) throws Exception {
		return ss.insert("MemberMapper.join", vo);
	}

	public MemberVo login(SqlSession ss, MemberVo vo) throws Exception {
		return ss.selectOne("MemberMapper.login", vo);
	}

}
