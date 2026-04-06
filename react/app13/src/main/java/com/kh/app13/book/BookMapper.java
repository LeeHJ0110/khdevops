package com.kh.app13.book;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Insert("""
            INSERT INTO BOOK(
                TITLE
                ,PRICE
            )VALUES(
                #{title}
                ,#{price}
            )
            """)
    int insertBook(BookVo bookVo);

    @Select("""
            SELECT *
            FROM BOOK
            ORDER BY NO DESC
            """)
    List<BookVo> getBookList();
}
