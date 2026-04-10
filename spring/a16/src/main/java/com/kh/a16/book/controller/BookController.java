package com.kh.a16.book.controller;

import com.kh.a16.book.dto.BookDto;
import com.kh.a16.book.entity.BookEntity;
import com.kh.a16.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class BookController {

    private final BookService bookService;

    //도서등록
    @PostMapping
    public ResponseEntity<BookDto> save(@RequestBody BookDto dto){
       BookDto respDto = bookService.save(dto);
       return ResponseEntity.status(200).body(respDto);
    }

    //도서 목록조회
    @GetMapping
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }

    //도서 상세조회
    @GetMapping("{id}")
    public BookEntity findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    //도서 삭제
    @DeleteMapping("{id}")
    public void remove(@PathVariable Long id) {
        bookService.remove(id);
    }

    // 도서 수정(제목, 가격)
    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody BookDto dto) {
        bookService.update(id, dto);
    }

}
