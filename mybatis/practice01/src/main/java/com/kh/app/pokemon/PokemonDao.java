package com.kh.app.pokemon;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class PokemonDao {

	public int insert(SqlSession ss, PokemonVo vo) {
		return ss.insert("PokemonMapper.insert",vo);
	}

	public List<PokemonTrainerVo> selectPokemonList(SqlSession ss, String searchText) {
		return ss.selectList("PokemonMapper.selectList", searchText);
	}

	public PokemonTrainerVo detail(SqlSession ss, String no) {
		return ss.selectOne("PokemonMapper.detail", no);
	}

}
