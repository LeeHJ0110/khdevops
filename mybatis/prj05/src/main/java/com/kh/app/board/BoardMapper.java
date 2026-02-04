package com.kh.app.board;

import org.apache.ibatis.annotations.Insert;


public interface BoardMapper {
	@Insert("""
			INSERT INTO BOARD(
				TITLE
				, CONTENT
				, WRITER_NO
			)VALUES(
				#{title}
				, #{content}
				, #{writerNo}
			)
			""")
	int write(BoardVo vo);
}
