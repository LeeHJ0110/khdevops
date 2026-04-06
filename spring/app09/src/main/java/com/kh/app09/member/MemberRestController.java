package com.kh.app09.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("member")
@Slf4j
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("join")
    public int join(@RequestBody MemberVo vo){
        return memberService.join(vo);
    }

    @PostMapping("login")
    public MemberVo login(@RequestBody MemberVo vo) {
        return memberService.login(vo);
    }
}
