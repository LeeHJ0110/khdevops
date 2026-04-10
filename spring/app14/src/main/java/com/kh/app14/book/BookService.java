package com.kh.app14.book;

import com.kh.app14.book.dto.BookInsertRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public void insert(BookInsertRequestDto dto){
        BookEntity entity = new BookEntity();
        entity.setTitle(dto.getTitle());
        entity.setPrice(dto.getPrice());
        BookEntity obj = bookRepository.save(entity);
        
    }

    public List<BookEntity> selectList() {
        return bookRepository.findAll();
    }

    public Optional<BookEntity> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public void update(Long id, String title, Integer price) {
        Optional<BookEntity> x = bookRepository.findById(id);
        BookEntity entity = x.get();//
        entity.setTitle(title);
        entity.setPrice(price);
    }
}
