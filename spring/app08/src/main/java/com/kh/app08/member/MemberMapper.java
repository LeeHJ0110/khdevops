package com.kh.app08.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.multipart.MultipartFile;

@Mapper
public interface MemberMapper {
    @Insert("""
        INSERT INTO MEMBER(
            ID
            , PW
            , NICK
            , PROFILE
            , ORIGIN_NAME  
        )VALUES (
            #{id}
            ,#{pw}
            ,#{nick}
            ,#{profile}
            ,#{originName}
        )
    """)
    int join(MemberVo vo);

    @Select("""
        SELECT *
        FROM MEMBER
        WHERE ID = #{id}
        AND PW = #{pw}
        AND QUIT_YN = 'N'
    """)
    MemberVo login(MemberVo vo);
}
