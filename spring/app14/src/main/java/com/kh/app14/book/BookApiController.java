package com.kh.app14.book;

import com.kh.app14.book.dto.BookInsertRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
@Slf4j
public class BookApiController {

    private final BookService bookService;

    @PostMapping
    public void insert(BookInsertRequestDto dto){
        bookService.insert(dto);
    }

    @GetMapping
    public List<BookEntity> selectList(){
        return bookService.selectList();
    }

    @GetMapping("{id}")
    public Optional<BookEntity> selectOne(@PathVariable Long id){
        return bookService.findById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, String title, Integer price){
        bookService.update(id,title,price);
    }

}
