package com.kh.app13.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class TodoService {

    private final TodoMapper todoMapper;

    public List<TodoVo>  getTodoList() {
        return todoMapper.getTodoList();
    }

    @Transactional(readOnly = false)
    public int insertTodo(TodoVo todoVo) {
        return todoMapper.insertTodo(todoVo);
    }
}