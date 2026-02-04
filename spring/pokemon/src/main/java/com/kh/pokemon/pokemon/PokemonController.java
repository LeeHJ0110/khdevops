package com.kh.pokemon.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("insert")
    @ResponseBody
    public int insert(PokemonVo vo){
        int result = pokemonService.insert(vo);
        if(result != 1){
            throw new IllegalStateException("등록 실패");
        }
        return result;
    }

    @GetMapping("edit")
    @ResponseBody
    public int edit(PokemonVo vo){
        int result = pokemonService.edit(vo);
        if(result != 1){
            throw new IllegalStateException("수정 실패");
        }
        return result;
    }

    @GetMapping("delete")
    @ResponseBody
    public int delete(String no){
        int result = pokemonService.delete(no);
        if(result != 1){
            throw new IllegalStateException("수정 실패");
        }
        return result;
    }

    @GetMapping("list")
    @ResponseBody
    public List<PokemonVo> selectList(){
        return pokemonService.selectList();
    }

    @GetMapping("detail")
    @ResponseBody
    public PokemonVo detail(String no){
        return pokemonService.detail(no);
    }
}
