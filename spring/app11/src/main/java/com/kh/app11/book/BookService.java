package com.kh.app11.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookMapper bookMapper;

    @TimerAno
    public int insert(BookVo vo) {
        log.info("서비스 메서드 호출됨");
        return bookMapper.insert(vo);
    }
}
