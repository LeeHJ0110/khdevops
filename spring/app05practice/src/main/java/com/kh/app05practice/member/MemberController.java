package com.kh.app05practice.member;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("join")
    public int join(MemberVo vo){
        int result = memberService.join(vo);
        if(result != 1){
            throw new IllegalStateException();
        }
        return result;
    }

    @PostMapping("login")
    public String login(MemberVo vo, HttpSession session){
        MemberVo loginMemberVo = memberService.login(vo);
        session.setAttribute("loginMemberVo", loginMemberVo);
        return "login ok";
    }

    @PutMapping
    public int editNick(MemberVo vo, HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        vo.setNo(loginMemberVo.getNo());
        return memberService.editNick(vo);
    }

    @DeleteMapping
    public int delete(HttpSession session){
        MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
        return memberService.delete(loginMemberVo.getNo());
    }

}


