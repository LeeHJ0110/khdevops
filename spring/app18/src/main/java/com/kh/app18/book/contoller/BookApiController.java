package com.kh.app18.book.contoller;

import com.kh.app18.book.dto.request.BookRequestDto;
import com.kh.app18.book.dto.response.BookResponseDto;
import com.kh.app18.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/book")
@Slf4j
@CrossOrigin
public class BookApiController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDto> save(@RequestBody BookRequestDto requestDto){
        BookResponseDto respDto = bookService.save(requestDto);
        return ResponseEntity.status(HttpStatus.OK).body(respDto);
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDto>> findAll(){
        List<BookResponseDto> voList = bookService.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(voList);
    }

    @GetMapping("{id}")
    public ResponseEntity<BookResponseDto> findById(@PathVariable Long id){
        BookResponseDto respDto = bookService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(respDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id){
        bookService.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

    @PutMapping("{id}")
    public ResponseEntity<BookResponseDto> updateTitleAndPriceById(@PathVariable Long id, @RequestBody BookRequestDto requestDto){
        BookResponseDto respDto = bookService.updateTitleAndPriceById(id, requestDto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(respDto);
    }

}
