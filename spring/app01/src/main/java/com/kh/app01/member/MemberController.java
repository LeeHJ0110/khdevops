package com.kh.app01.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("member/join")
    public String join(){
        return "member/join";
    }

    @PostMapping("member/join")
    public String join(MemberVo vo) throws Exception {
        int result = service.join(vo);
        if (result != 1){
            throw new Exception("가입 실패");
        }
        return "redirect:/member/login";
    }
}
