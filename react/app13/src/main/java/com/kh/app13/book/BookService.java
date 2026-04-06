package com.kh.app13.book;

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
    private final BookMapper bookMapper;

    @Transactional
    public int insertBook(BookVo bookVo) {
        return bookMapper.insertBook(bookVo);
    }

    public List<BookVo> getBookVoList() {
        return bookMapper.getBookList();
    }
}
