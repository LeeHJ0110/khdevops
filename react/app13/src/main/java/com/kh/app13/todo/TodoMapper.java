package com.kh.app13.todo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("""
            SELECT *
            FROM TODO
            ORDER BY NO DESC
            """)
    List<TodoVo>  getTodoList();

    @Insert("""
            INSERT INTO TODO
            (
                TITLE
            )
            VALUES
            (
                #{title}
            )
            """)
    int insertTodo(TodoVo todoVo);
}