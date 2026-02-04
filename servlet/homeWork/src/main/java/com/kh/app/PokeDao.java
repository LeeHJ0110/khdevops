package com.kh.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.app.db.JDBCTemplate;

public class PokeDao {

	public int insert(Connection conn, PokemonVo vo) throws Exception {
		String sql ="""
				INSERT INTO POKEMON(
					NO
					, NAME
					, TYPE
					, LEVELS
					, OWNER
				)VALUES(
					SEQ_POKEMON.NEXTVAL
					, ?
					, ?
					, ?
					, ?
				)
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getType());
		pstmt.setString(3, vo.getLevel());
		pstmt.setString(4, vo.getOwner());
		int result = pstmt.executeUpdate();
		
		return result;
	}

	public ArrayList<PokemonVo> pokeList(Connection conn) throws Exception {
		String sql = """
				SELECT *
				FROM POKEMON
				ORDER BY NO DESC
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<PokemonVo> voList = new ArrayList<PokemonVo>();
	      while(rs.next()) {
	         String no = rs.getString("NO");
	         String name = rs.getString("NAME");
	         String type = rs.getString("TYPE");
	         String level = rs.getString("LEVELS");
	         String owner = rs.getString("OWNER");
	         PokemonVo vo = new PokemonVo(no, name, type, level, owner);
	         voList.add(vo);
	      }//while
	      
	      return voList;
	}
	public ArrayList<PokemonVo> selectPokeList(Connection conn, String iOwner) throws Exception {
		String sql = """
				SELECT *
				FROM POKEMON
				WHERE OWNER = ?
				ORDER BY NO DESC
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, iOwner);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<PokemonVo> voList = new ArrayList<PokemonVo>();
	      while(rs.next()) {
	         String no = rs.getString("NO");
	         String name = rs.getString("NAME");
	         String level = rs.getString("LEVELS");
	         String type = rs.getString("TYPE");
	         String owner = rs.getString("OWNER");
	         PokemonVo vo = new PokemonVo(no, name, type, level, owner);
	         voList.add(vo);
	      }//while
	      
	      return voList;
	}

	public TrainerVo login(Connection conn, TrainerVo vo) throws Exception {
		String sql = """
				SELECT *
				FROM POKEMON_TRAINER
				WHERE ID = ?
				AND PW = ?
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		ResultSet rs = pstmt.executeQuery();
		
		TrainerVo loginTrainerVo = null;
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String pw = rs.getString("PW");
			String name = rs.getString("NAME");
			loginTrainerVo = new TrainerVo(no, id, pw, name);
		}
		
		return loginTrainerVo;
		
	}

	public int join(Connection conn, TrainerVo vo) throws Exception {
		String sql = """
					INSERT INTO POKEMON_TRAINER(
						NO
						, ID
						, PW
						, NAME
					)VALUES(
						SEQ_TRAINER.NEXTVAL
						, ?
						, ?
						, ?
					)
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		pstmt.setString(3, vo.getName());
		int result = pstmt.executeUpdate();
		
		JDBCTemplate.close(pstmt);
		
		return result;
				
				
	}

}
