package com.kh.app13.book;

import lombok.Data;

import java.util.List;

@Data
public class BookListRespVo {
    private List<BookVo> voList;
    private String msg;
}
