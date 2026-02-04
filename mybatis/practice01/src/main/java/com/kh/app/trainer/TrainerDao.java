package com.kh.app.trainer;

import org.apache.ibatis.session.SqlSession;

public class TrainerDao {

	public int join(SqlSession ss, TrainerVo vo) {
		return ss.insert("TrainerMapper.join", vo);
	}

	public TrainerVo login(SqlSession ss, TrainerVo vo) {
		return ss.selectOne("TrainerMapper.login", vo);
	}

}
