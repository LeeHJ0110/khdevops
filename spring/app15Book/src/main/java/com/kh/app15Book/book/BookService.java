package com.kh.app15Book.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public void save(BookDto dto) {
        BookEntity entity = dto.toEntity();
        System.out.println("entity = " + entity);
        bookRepository.save(entity);
    }

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    public BookDto findById(Long id) {
        BookEntity entity = bookRepository.findById(id);
        return BookDto.from(entity);
    }

    @Transactional
    public void delete(Long id) {
        BookEntity entity = bookRepository.findById(id);
        entity.delete();
    }

    @Transactional
    public void update(BookDto dto) {
        BookEntity entity = bookRepository.findById(dto.getId());
        entity.update(dto.getTitle(),dto.getPrice());   //em이 변경하면 알아서 바꿔줌
    }
}