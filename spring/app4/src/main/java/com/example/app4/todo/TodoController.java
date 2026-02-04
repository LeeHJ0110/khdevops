package com.example.app4.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("todo")
@ResponseBody
@CrossOrigin
public class TodoController {

    @Autowired
    private TodoService todoService;

    //insert
    @PostMapping
    public int insert(TodoVo vo){
        int result = todoService.insert(vo);
        return result;
    }

    //selectList
    @GetMapping
    public List<TodoVo> selectList(){
        List<TodoVo> voList = todoService.selectList();
        return voList;
    }

    //selectOne
    @GetMapping("detail")
    public TodoVo selectOneByNo(String no){
        TodoVo vo = todoService.selectOneByNo(no);
        return vo;
    }

    //update(clear)
    @PutMapping
    public int update(TodoVo vo){
        int result = todoService.update(vo);
        return result;
    }

    //delete
    @DeleteMapping
    public int delete(String no){
        int result = todoService.delete(no);
        return result;
    }
}
