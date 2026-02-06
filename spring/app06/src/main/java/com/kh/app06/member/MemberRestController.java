package com.kh.app06.member;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberRestController {

    private final MemberService memberService;
    
    //회원가입
    @PostMapping("join")
    public int join(@RequestBody MemberVo vo){
        return memberService.join(vo);
    }

    //로그인
    @PostMapping("login")
    public String login(@RequestBody MemberVo vo , HttpSession session){
        MemberVo x = memberService.login(vo);
        if(x == null){
            return """
                {"msg" : "BAD"}
                """;
        }
        session.setAttribute("loginMemberVo" , x);
        return """
                {"msg" : "GOOD"}
                """;
    }


    //닉네임변경
    @PutMapping
    public int editNick(@RequestBody MemberVo vo, HttpSession session){
        MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
        if(loginMemberVo == null){
            throw new IllegalStateException("로그인 먼저 하세요");
        }
        vo.setNo(loginMemberVo.getNo());
        return memberService.editNick(vo);
    }

    //탈퇴하기
    @DeleteMapping
    public int quit(HttpSession session){
        MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
        if(loginMemberVo == null){
            throw new IllegalStateException("로그인 먼저 하세요");
        }
        return memberService.quit(loginMemberVo.getNo());
    }

}
