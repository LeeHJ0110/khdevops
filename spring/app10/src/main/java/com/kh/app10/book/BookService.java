package com.kh.app10.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class BookService {

    private final BookMapper bookMapper;

    @Transactional
    public int insert(BookVo vo) {
        int result = bookMapper.insert(vo);
        vo.setTitle(vo.getTitle() +" 오늘만 공짜");
        vo.setPrice("0");
        int result2 = bookMapper.insert(vo);
        log.info("result : " + result);
        return result;
    }

}
