package com.kh.app08.member;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("join")
    public int join(MemberVo vo, MultipartFile f) throws IOException {
        return memberService.join(vo, f);
    }
    @PostMapping("login")
    public String login(@RequestBody MemberVo vo, HttpSession session){
        MemberVo dbVo = memberService.login(vo);
        if(dbVo == null){
            throw new IllegalStateException("로그인 실패");
        }
        session.setAttribute("loginMemberVo", dbVo);
        System.out.println(dbVo);
        return """
                {"msg" : "OK"}
                """;
    }
}
