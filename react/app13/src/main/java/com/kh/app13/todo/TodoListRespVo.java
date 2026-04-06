package com.kh.app13.todo;

import lombok.Data;

import java.util.List;

@Data
public class TodoListRespVo {
    private String msg;
    private List<TodoVo> voList;
}
