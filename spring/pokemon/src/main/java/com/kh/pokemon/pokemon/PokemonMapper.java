package com.kh.pokemon.pokemon;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PokemonMapper {
    @Insert("""
        INSERT INTO POKEMON(
            NAME
            , TYPE
            , ABILITY
        )VALUES (
            #{name}
            ,#{type}
            ,#{ability}
        )
        """)
    int insert(PokemonVo vo);

    @Update("""
        UPDATE POKEMON
            SET ABILITY = #{ability}
        WHERE NO = #{no}
    """)
    int edit(PokemonVo vo);

    @Delete("""
        DELETE POKEMON
        WHERE NO = #{no}
    """)
    int delete(String no);

    @Select("""
        SELECT *
        FROM POKEMON
        ORDER BY NO DESC
    """)
    List<PokemonVo> selectList();

    @Select("""
        SELECT *
        FROM POKEMON
        WHERE NO = #{no}
    """)
    PokemonVo detail(String no);
}
