package com.kh.app09.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class MemberService {

    private final MemberMapper memberMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public int join(MemberVo vo) {

        String encodedPw = bCryptPasswordEncoder.encode(vo.getPw());
        vo.setPw(encodedPw);

        return memberMapper.join(vo);
    }

    public MemberVo login(MemberVo vo) {
        MemberVo dbVo = memberMapper.login(vo);
        boolean isMatch = bCryptPasswordEncoder.matches(vo.getPw(), dbVo.getPw());
        if(!isMatch){
            throw new IllegalStateException("비번틀림");
        }
        return dbVo;
    }
}
