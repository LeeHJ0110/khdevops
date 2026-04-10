package com.kh.app13.book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class BookApiController {
    private final BookService bookService;

    @GetMapping
    public BookListRespVo getBookList(){
        List<BookVo> voList = bookService.getBookVoList();
        BookListRespVo bookListRespVo = new BookListRespVo();
        bookListRespVo.setMsg("도서목록 가져옴");
        bookListRespVo.setVoList(voList);
        return bookListRespVo;
    }

    @PostMapping
    public BookInsertRespVo insertBook(@RequestBody BookVo bookVo){
        int result = bookService.insertBook(bookVo);
        BookInsertRespVo respVo = new BookInsertRespVo();
        System.out.println(respVo);
        respVo.setResult(result + "");
        return respVo;
    }
}
