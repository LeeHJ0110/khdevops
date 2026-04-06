package com.kh.app.boardReply;

import com.kh.app.member.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/board/reply")
@RequiredArgsConstructor
@Slf4j
public class ReplyRestController {

    private final ReplyService replyService;

    //댓글 등록
    @PostMapping
    public ResponseEntity<Map<String, Object>> insert(@RequestBody ReplyVo vo , HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        if(loginMemberVo == null){
            throw new IllegalStateException("[R-111] login require");
        }
        String loginMemberNo = loginMemberVo.getNo();
        vo.setWriterNo(loginMemberNo);
        int result = replyService.insert(vo);

        if(result != 1){
            throw new IllegalArgumentException("[R-110] reply insert fail ...");
        }

        Map<String, Object> map = new HashMap<>();
        map.put("result", result);
        return ResponseEntity.ok(map);
    }

    //댓글 목록 조회
    @GetMapping
    public List<ReplyVo> selectList(ReplyVo vo){
        List<ReplyVo> voList = replyService.selectList(vo.getBoardNo());
        return voList;
    }

    //댓글 삭제
    @DeleteMapping
    public int del(@RequestBody ReplyVo vo , HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        String loginMemberNo = loginMemberVo.getNo();
        vo.setWriterNo(loginMemberNo);
        int result = replyService.del(vo);
        return result;
    }

}