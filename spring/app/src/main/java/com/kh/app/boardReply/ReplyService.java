package com.kh.app.boardReply;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class ReplyService {

    private final ReplyMapper replyMapper;

    @Transactional
    public int insert(ReplyVo vo) {
        return replyMapper.insert(vo);
    }

    public List<ReplyVo> selectList(String boardNo) {
        return replyMapper.selectList(boardNo);
    }

    @Transactional
    public int del(ReplyVo vo) {
        return replyMapper.del(vo);
    }

}