package com.kh.app05Member.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberMapper {
    @Insert("""
        INSERT INTO MEMBER(
            ID
            ,PW
            ,NICK
        )VALUES(
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
        AND ID = #{id}
        AND PW = #{pw}
    """)
    MemberVo login(MemberVo vo);

    @Update("""
        UPDATE MEMBER
            SET NICK = #{nick}
        WHERE NO = #{no}
    """)
    int edit(MemberVo vo);

    @Update("""
        UPDATE MEMBER
            SET QUIT_YN='Y'
        WHERE NO = #{no}
    """)
    int quit(String no);
}
