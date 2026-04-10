package com.kh.app17.book.service;

import com.kh.app17.book.dto.request.BookInsertRequestDto;
import com.kh.app17.book.dto.response.BookResponseDto;
import com.kh.app17.book.entity.BookEntity;
import com.kh.app17.book.resository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public BookResponseDto save(BookInsertRequestDto dto) {
        BookEntity entity = dto.toEntity();
        bookRepository.save(entity);
        return BookResponseDto.from(entity);
    }


    public List<BookResponseDto> findAll() {
        List<BookEntity> entityList = bookRepository.findAll();
        return entityList.stream().map(BookResponseDto::from).toList();
    }

    public BookResponseDto findById(Long id) {
        BookEntity entity = bookRepository.findById(id);
        return BookResponseDto.from(entity);
    }

    @Transactional
    public void delete(Long id) {
        BookEntity entity = bookRepository.findById(id);
        entity.delete();
    }

    @Transactional
    public BookResponseDto update(Long id, BookInsertRequestDto requestDto) {
        BookEntity entity = bookRepository.findById(id);
        entity.change(requestDto.getTitle(), requestDto.getPrice());
        return BookResponseDto.from(entity);
    }
}
