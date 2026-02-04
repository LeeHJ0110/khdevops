-- TRIGGER
/*
    <TRIGGER>
        테이블이 INSERT, UPDATE, DELETE 등 DML 구문에 의해서 변경될 경우
        자동으로 실행될 내용을 정의해놓는 객체이다.
        
        * 트리거의 종류
          1) SQL 문의 실행 시기에 따른 분류
            - BEFORE TRIGGER : 해당 SQL 문장 실행 전에 트리거를 실행한다.
            - AFTER TRIGGER : 해당 SQL 문장 실행 후에 트리거를 실행한다.
          
          2) SQL 문에 의해 영향을 받는 행에 따른 분류
            - 문장 트리거 : 해당 SQL 문에 한 번만 트리거를 실행한다.
            - 행 트리거 : 해당 SQL 문에 영향을 받는 행마다 트리거를 실행한다.
            
        [문법]
            CREATE OR REPLACE TRIGGER 트리거명
            BEFORE|AFTER INSERT|UPDATE|DELETE ON 테이블명
            [FOR EACH ROW]
            DECLARE
                선언부
            BEGIN
                실행부
            EXCEPTION
                예외처리부
            END;
            /
*/
DROP SEQUENCE SEQ_PRODUCT;
CREATE SEQUENCE SEQ_PRODUCT NOCACHE NOCYCLE;
DROP SEQUENCE SEQ_ORDER;
CREATE SEQUENCE SEQ_ORDER NOCACHE NOCYCLE;

DROP TABLE PRODUCT;
CREATE TABLE PRODUCT(
    NO          NUMBER          CONSTRAINT PRODUCT_PK PRIMARY KEY
    , TITLE     VARCHAR2(100)   CONSTRAINT PRODUCT_TITLE_NN NOT NULL
    , STOCK     NUMBER          DEFAULT 0 CONSTRAINT PRODUCT_STOCK_CK CHECK(STOCK>0)
);
DROP TABLE "ORDER";
CREATE TABLE "ORDER"(
    NO          NUMBER  CONSTRAINT OTDER_PK PRIMARY KEY
    , PNO       NUMBER  CONSTRAINT OTDER_PNO_NN NOT NULL REFERENCES PRODUCT(NO)
    , COUNT     NUMBER  CONSTRAINT OTDER_COUNT_NN NOT NULL
);

--더미 데이터 준비
INSERT INTO PRODUCT (NO, TITLE, STOCK) VALUES(SEQ_PRODUCT.NEXTVAL,'핸드폰', 50);
INSERT INTO "ORDER" (NO, PNO, COUNT) VALUES(SEQ_ORDER.NEXTVAL, 2, 1);

SELECT * FROM PRODUCT;
SELECT * FROM "ORDER";

CREATE OR REPLACE TRIGGER TRG_DECREASE_STOCK
AFTER INSERT ON "ORDER"
FOR EACH ROW

DECLARE
BEGIN
    UPDATE PRODUCT
    SET
        STOCK = STOCK - :NEW.COUNT
    WHERE NO = :NEW.PNO
    ;
END;
/




