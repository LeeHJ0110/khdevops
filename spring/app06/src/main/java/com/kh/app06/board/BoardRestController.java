package com.kh.app06.board;


import com.kh.app06.member.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardRestController {

    private final BoardService boardService;

    //작성
    @PostMapping("write")
    public int write(@RequestBody BoardVo vo, HttpSession session){
        MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");

        if(loginMemberVo == null){
            throw new IllegalStateException("로그인 먼저 하세요");
        }
        vo.setWriterNo(loginMemberVo.getNo());
        return boardService.write(vo);
    }

    //목록조회(+검색)
    @GetMapping
    public List<BoardVo> selectList(){
        return boardService.selectList();
    }

    //상세조회
    @GetMapping("{no}")
    public BoardVo selectByNo(@PathVariable String no){
        return boardService.selectByNo(no);
    }

    //제목,내용 수정
    @PutMapping
    public int update(@RequestBody BoardVo vo, HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        if(loginMemberVo == null){
            throw new IllegalStateException("로그인 먼저 하세요");
        }
        vo.setWriterNo(loginMemberVo.getNo());

        return boardService.update(vo);
    }

    //삭제
    @DeleteMapping
    public int delete(@RequestBody String no,HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        if(loginMemberVo == null){
            throw new IllegalStateException("로그인 먼저 하세요");
        }
        BoardVo boardVo = new BoardVo();
        boardVo.setWriterNo(loginMemberVo.getNo());
        boardVo.setNo(no);
        return boardService.delete(boardVo);
    }
}
