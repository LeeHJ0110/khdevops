package com.kh.app13.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/todo")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class TodoApiController {

    private final TodoService todoService;

    @GetMapping
    public TodoListRespVo getTodoList(){
        List<TodoVo> voList = todoService.getTodoList();
        TodoListRespVo todoListRespVo = new TodoListRespVo();
        todoListRespVo.setMsg("select OK ~~~");
        todoListRespVo.setVoList(voList);
        return todoListRespVo;
    }

    @PostMapping
    @CrossOrigin
    public TodoInsertRespVo insertTodo(@RequestBody TodoVo todoVo){
        int result = todoService.insertTodo(todoVo);
        TodoInsertRespVo respVo = new TodoInsertRespVo();
        respVo.setResult(result + "");
        return respVo;
    }

}
