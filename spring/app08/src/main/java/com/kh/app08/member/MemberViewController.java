package com.kh.app08.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberViewController {
    @GetMapping("join")
    public void join(){

    }
    @GetMapping("login")
    public void login(){

    }
}
