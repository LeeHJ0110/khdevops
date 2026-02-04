package com.kh.app.trainer;

import org.apache.ibatis.session.SqlSession;

import static com.kh.app.db.SqlSessionTemplate.*;

public class TrainerService {
	
	private TrainerDao dao = new TrainerDao();
	
	public int join(TrainerVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.join(ss, vo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public TrainerVo login(TrainerVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		TrainerVo result = dao.login(ss, vo);
		ss.close();
		return result;
	}

}
