package com.kh.app05practice.member;

import lombok.Data;

@Data
public class MemberVo {
    private String no;
    private String id;
    private String pw;
    private String nick;
    private String created_at;
    private String updated_at;
    private String quit_yn;
}
