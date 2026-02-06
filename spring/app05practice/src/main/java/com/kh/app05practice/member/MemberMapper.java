package com.kh.app05practice.member;

import org.apache.ibatis.annotations.*;

@Mapper
public interface MemberMapper {
    @Insert("""
        INSERT INTO MEMBER(
            ID
            ,PW
            ,NICK
        )VALUES (
            #{id}
            ,#{pw}
            ,#{nick}
        )
    """)
    int join(MemberVo vo);

    @Select("""
        SELECT *
        FROM MEMBER
        WHERE QUIT_YN = 'N'
    """)
    MemberVo login(MemberVo vo);

    @Update("""
        UPDATE MEMBER
            SET NICK = #{nick}
        WHERE NO = #{no}
    """)
    int editNick(MemberVo vo);

    @Update("""
        UPDATE MEMBER
            SET QUIT_YN = 'Y'
        WHERE NO = #{no}
    """)
    int delete(String no);
}
