package com.kh.app05Member.member;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("member")
public class MemberRestController {
    @Autowired
    private MemberService memberService;

    //가입
    @PostMapping("join")
    private int join(@RequestBody MemberVo vo){
        int result = memberService.join(vo);
        if(result != 1){
            throw new IllegalStateException();
        }
        return result;
    }
    //로그인
    @PostMapping("login")
    public String login(@RequestBody MemberVo vo, HttpSession session){
        MemberVo loginMemberVo = memberService.login(vo);
        session.setAttribute("loginMemberVo",loginMemberVo);
        if(loginMemberVo == null){
            throw new IllegalStateException();
        }
        return """
                {"msg":"OK"}
                """;
    }

    //닉네임수정
    @PutMapping
    public int edit(@RequestBody MemberVo vo, HttpSession session){
        MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
        String no = loginMemberVo.getNo();
        vo.setNo(no);
        int result = memberService.edit(vo);

        return result;
    }

    //탈퇴하기
    @DeleteMapping
    public int quit(HttpSession session){
        MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
        String no = loginMemberVo.getNo();
        int result = memberService.quit(no);
        return result;
    }

}
