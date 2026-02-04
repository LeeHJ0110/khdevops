package com.kh.app.member;

import org.apache.ibatis.session.SqlSession;

public class MemberDao {

	public int join(SqlSession ss, MemberVo vo) {
		return ss.insert("MemberMapper.join",vo);
	}

	public MemberVo login(SqlSession ss, MemberVo vo) {
		return ss.selectOne("MemberMapper.login", vo);
	}

	public int editPw(SqlSession ss, MemberVo dbVo) {
		return ss.update("MemberMapper.editPw", dbVo);
	}

	public int editNick(SqlSession ss, MemberVo dbVo) {
		return ss.update("MemberMapper.editNick", dbVo);
	}

	public int quit(SqlSession ss, MemberVo dbVo) {
		return ss.update("MemberMapper.quit", dbVo);
	}


}
