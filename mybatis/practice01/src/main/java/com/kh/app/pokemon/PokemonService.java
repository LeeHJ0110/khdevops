package com.kh.app.pokemon;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;

public class PokemonService {
	private PokemonDao dao = new PokemonDao();
	
	public int insert(PokemonVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.insert(ss, vo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public List<PokemonTrainerVo> selectPokemonList(String searchText) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<PokemonTrainerVo> voList = dao.selectPokemonList(ss , searchText);
		ss.close();
		return voList;
	}

	public PokemonTrainerVo detail(String no) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		PokemonTrainerVo vo = dao.detail(ss , no);
		ss.close();
		return vo;
	}

}
