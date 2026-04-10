package com.kh.a16.book.service;

import com.kh.a16.book.dto.BookDto;
import com.kh.a16.book.entity.BookEntity;
import com.kh.a16.book.repository.BookRepository;
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
    public BookDto save(BookDto dto) {
        BookEntity entity = dto.toEntity();
        bookRepository.save(entity);
        return BookDto.from(entity);
    }

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    public BookEntity findById(Long id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public void remove(Long id) {
        BookEntity entity = bookRepository.findById(id);
        bookRepository.remove(entity);
    }

    @Transactional
    public void update(Long id, BookDto dto) {
        BookEntity entity = bookRepository.findById(id);
        entity.change(dto.getTitle(),dto.getPrice());
    }
}
