-- PROCEDURE, FUCTION
---------------------------------------------------
/*
    <FUNCTION>
        프로시저와 사용 용도가 비슷하지만
        프로시저와 다르게 OUT 변수를 사용하지 않아도 실행 결과를 되돌려 받을 수 있다.(RETURN )
        
        [문법]
            CREATE FUNCTION 함수명
            (
                매개변수 1 타입,
                매개변수 2 타입,
                ...
            )
            RETURN 데이터타입
            IS
                선언부
            BEGIN
                실행부
                
                RETRUN 반환값; -- 프로시저랑 다르게 RETURN 구문이 추가된다.
            EXCEPTION
                예외처리부
            END [함수명];
            /
*/
CREATE OR REPLACE FUNCTION BONUS_CALC
(
    V_EMP_ID EMPLOYEE.EMP_ID%TYPE
)
RETURN NUMBER
IS
    V_SAL EMPLOYEE.SALARY%TYPE;
    V_BONUS EMPLOYEE.BONUS%TYPE;
BEGIN
    SELECT SALARY, NVL(BONUS, 0)
    INTO V_SAL, V_BONUS
    FROM EMPLOYEE
    WHERE EMP_ID = V_EMP_ID;
    
    RETURN (V_SAL + (V_SAL * V_BONUS)) * 12;
END;
/

SELECT BONUS_CALC(200) FROM DUAL;

DROP SEQUENCE ABC;
CREATE SEQUENCE SEQ_MEMBER NOCACHE NOCYCLE;

CREATE OR REPLACE FUNCTION ABC
RETURN NUMBER
IS
    X NUMBER;
BEGIN
    SELECT SEQ_MEMBER.NEXTVAL
    INTO X
    FROM DUAL;
    
    RETURN X;
END;
/

SELECT ABC FROM DUAL;
---------------------------------------------------
/*
    <CURSOR>
        SQL 문의 처리 결과(처리 결과가 여러 행(ROW))를 담고 있는 객체이다.
        커서 사용 시 여러 행으로 나타난 처리 결과에 순차적으로 접근이 가능하다.
        
        [커서 속성]
            커서명%NOTFOUND : 커서 영역에 남아있는 ROW 수가 없다면 TURE, 아니면 FALSE
            커서명%FOUND    : 커서 영역에 남아있는 ROW 수가 한 개 이상일 경우 TRUE, 아니면 FALSE
            커서명%ISOPEN   : 커서가 OPEN 상태인 경우 TRUE, 아니면 FALSE
            커서명%ROWCOUNT : SQL 처리 결과로 얻어온 행(ROW)의 수
        
        [사용 방법]
            1) CURSOR 커서명 IS ..     : 커서 선언
            2) OPEN 커서명;            : 커서 오픈
            3) FETCH 커서명 INTO 변수, ...   : 커서에서 데이터 추출(한 행씩 데이터를 가져온다.)
            4) CLOSE 커서명            : 커서 닫기
        
        [문법]
            CURSOR 커서명 IS [SELECT 문]
            
            OPEN 커서명;
            FETCH 커서명 INTO 변수;
            ...
            
            CLOSE 커서명;
*/

