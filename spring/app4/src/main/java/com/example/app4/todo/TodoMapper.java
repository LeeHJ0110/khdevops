package com.example.app4.todo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {
    @Insert("""
        INSERT INTO TODO(
            TITLE
        )VALUES(
            #{title}
        )
    """)
    int insert(TodoVo vo);

    @Select("""
        SELECT *
        FROM TODO
        ORDER BY NO DESC
    """)
    List<TodoVo> selectList();

    @Select("""
        SELECT *
        FROM TODO
        WHERE NO = #{no}
        ORDER BY NO DESC
    """)
    TodoVo selectOneByNo(String no);

    @Update("""
        UPDATE TODO
            SET IS_DONE = 'Y'
        WHERE NO = #{no}
    """)
    int update(TodoVo vo);

    @Delete("""
        DELETE TODO
        WHERE NO = #{no}
    """)
    int delete(String no);
}
