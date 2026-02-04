--------------------------------------------------
-- 시퀀스 삭제
--------------------------------------------------
DROP SEQUENCE SEQ_MEMBER;
DROP SEQUENCE SEQ_BOARD;

--------------------------------------------------
-- 테이블 삭제
--------------------------------------------------
DROP TABLE MEMBER CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;

--------------------------------------------------
-- 시퀀스 생성
--------------------------------------------------
CREATE SEQUENCE SEQ_MEMBER NOCACHE NOCYCLE;
CREATE SEQUENCE SEQ_BOARD NOCACHE NOCYCLE;

--------------------------------------------------
-- 테이블 생성
--------------------------------------------------
CREATE TABLE MEMBER(
    NO          NUMBER          DEFAULT SEQ_MEMBER.NEXTVAL CONSTRAINT MEMBER_PK PRIMARY KEY
    ,ID         VARCHAR2(100)   CONSTRAINT MEMBER_ID_NN NOT NULL CONSTRAINT MEMBER_ID_UQ UNIQUE
    ,PW         VARCHAR2(100)   CONSTRAINT MEMBER_PW_NN NOT NULL
    ,NICK       VARCHAR2(100)   CONSTRAINT MEMBER_NICK_NN NOT NULL CONSTRAINT MEMBER_NICK_UQ UNIQUE
    ,CREATED_AT TIMESTAMP       DEFAULT SYSDATE
    ,UPDATED_AT TIMESTAMP       DEFAULT SYSDATE
    ,QUIT_YN    CHAR(1)         DEFAULT 'N' CONSTRAINT MEMBER_QUIT_YN_CK CHECK( QUIT_YN IN ('Y','N') )
);


CREATE TABLE BOARD(
    NO              NUMBER          DEFAULT SEQ_BOARD.NEXTVAL CONSTRAINT BOARD_PK PRIMARY KEY
    ,TITLE          VARCHAR2(100)   CONSTRAINT BOARD_TITLE_NN NOT NULL
    ,CONTENT        VARCHAR2(4000)  CONSTRAINT BOARD_CONTENT_NN NOT NULL
    ,WRITER_NO      NUMBER          CONSTRAINT BOARD_FK REFERENCES MEMBER(NO)
    ,HIT            NUMBER          DEFAULT 0 CONSTRAINT BOARD_HIT_CK CHECK(HIT >= 0)
    ,CREATED_AT     TIMESTAMP       DEFAULT SYSDATE
    ,UPDATED_AT     TIMESTAMP       DEFAULT SYSDATE
    ,DEL_YN         CHAR(1)         DEFAULT 'N' CONSTRAINT BOARD_DEL_YN_CK CHECK( DEL_YN IN ('Y', 'N') )
);



