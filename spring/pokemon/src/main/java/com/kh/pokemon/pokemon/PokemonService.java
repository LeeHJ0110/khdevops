package com.kh.pokemon.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonMapper pokemonMapper;

    public int insert(PokemonVo vo) {
        return pokemonMapper.insert(vo);
    }

    public int edit(PokemonVo vo) {
        return pokemonMapper.edit(vo);
    }

    public int delete(String no) {
        return pokemonMapper.delete(no);
    }

    public List<PokemonVo> selectList() {
        return pokemonMapper.selectList();
    }

    public PokemonVo detail(String no) {
        return pokemonMapper.detail(no);
    }
}
