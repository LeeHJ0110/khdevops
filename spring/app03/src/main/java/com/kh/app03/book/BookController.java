package com.kh.app03.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("book")
public class BookController {

    //D(ependency)I(njection)
    @Autowired
    private BookService bookService;

    //등록
    @GetMapping("insert")
    @ResponseBody
    public int insert(BookVo vo){
        int result = bookService.insert(vo);
        if(result != 1){
            throw new IllegalStateException();
        }
        return result;
    }
    //가격수정
    @GetMapping("edit")
    @ResponseBody
    public int edit(String no, String price){
        Map<String, String> map = new HashMap<>();
        map.put("no",no);
        map.put("price",price);

        int result = bookService.edit(map);
        if(result != 1){
            throw new IllegalStateException();
        }
        return result;
    }
    //도서삭제
    @GetMapping("delete")
    @ResponseBody
    public int delete(String no){
        int result = bookService.delete(no);
        if(result != 1){
            throw new IllegalStateException();
        }
        return result;
    }
    //도서목록
    @GetMapping("list")
    @ResponseBody
    public List<BookVo> selectList(){
        return bookService.selectList();
    }
    //도서상세
    @GetMapping("detail")
    @ResponseBody
    public BookVo detail(String no){
        return bookService.selectByNo(no);
    }



}
