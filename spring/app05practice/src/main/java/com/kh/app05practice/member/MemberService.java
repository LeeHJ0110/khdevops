package com.kh.app05practice.member;

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

    public int editNick(MemberVo vo) {
        return memberMapper.editNick(vo);
    }

    public int delete(String no) {
        return memberMapper.delete(no);
    }
}
