package com.kh.app15Book.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class BookApiController {

    private final BookService bookService;

    @PostMapping
    public void save(@RequestBody BookDto dto){
        bookService.save(dto);
    }

    @GetMapping
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }

    @GetMapping("{id}")
    public BookDto findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody BookDto dto){
        dto.setId(id);
        bookService.update(dto);
    }


}//class