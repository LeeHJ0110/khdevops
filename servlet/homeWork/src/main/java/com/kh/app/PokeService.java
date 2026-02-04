package com.kh.app;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.app.db.JDBCTemplate;

import static com.kh.app.db.JDBCTemplate.*;

public class PokeService {

	public int insert(PokemonVo vo) throws Exception {
		Connection conn = getConn();
		
		int result = new PokeDao().insert(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public ArrayList<PokemonVo> pokeList() throws Exception {
		Connection conn = JDBCTemplate.getConn();

		ArrayList<PokemonVo> voList = new PokeDao().pokeList(conn);
		JDBCTemplate.close(conn);
		return voList;
	}
	public ArrayList<PokemonVo> selectPokeList(String owner) throws Exception {
		Connection conn = JDBCTemplate.getConn();

		ArrayList<PokemonVo> voList = new PokeDao().selectPokeList(conn, owner);
		JDBCTemplate.close(conn);
		return voList;
	}

	public TrainerVo login(TrainerVo vo) throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		TrainerVo loginTrainerVo = new PokeDao().login(conn, vo);
		
		JDBCTemplate.close(conn);
		return loginTrainerVo;
		
	}

	public int join(TrainerVo vo) throws Exception {
		Connection conn = JDBCTemplate.getConn();
		int result = new PokeDao().join(conn, vo);
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);;
		}
		JDBCTemplate.close(conn);
		return result;
	}
}
