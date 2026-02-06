package com.kh.app05Member.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public int join(MemberVo vo) {
        return memberMapper.join(vo);
    }

    public MemberVo login(MemberVo vo) {
        return memberMapper.login(vo);
    }

    public int edit(MemberVo vo) {
        return memberMapper.edit(vo);
    }

    public int quit(String no) {
        return memberMapper.quit(no);
    }
}
