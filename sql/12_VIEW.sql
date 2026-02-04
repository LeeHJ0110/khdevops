--VIEW
/*
    <VIEW>
        SELECT 문을 저장할 수 있는 객체이다.(논리적인 가상 테이블)
        데이터를 저장하고 있지 않으며 테이블에 대한 SQL만 저장되어 있어 VIEW 접근할 때 SQL을 수행하면서 결과값을 가져온다.
        
        [문법]
            CREATE [OR REPLACE] VIEW 뷰명
            AS 서브 쿼리;
*/
DROP VIEW V_EMPLOYEE;
CREATE OR REPLACE VIEW V_EMPLOYEE AS
SELECT EMP_NAME, PHONE, SALARY * 12 연봉 FROM EMPLOYEE
;
SELECT * FROM V_EMPLOYEE;
/*
    <뷰 칼럼에 별칭 부여>
        서브 쿼리의 SELECT 절에 함수나 산술연산이 기술되어 있는 경우 반드시 별칭을 지정해야 한다.
*/
/*
    <VIEW를 이용해서 DML(INSERT, UPDATE, DELETE) 사용>
        뷰를 통해 데이터를 변경하게 되면 실제 데이터가 담겨있는 기본 테이블에도 적용된다.
*/
/*
    <DML 구문으로 VIEW 조작이 불가능한 경우>
*/

--  1) 뷰 정의에 포함되지 않는 칼럼을 조작하는 경우
--  2) 뷰에 포함되지 않은 칼럼 중에 기본 테이블 상에 NOT NULL 제약조건이 지정된 경우
--  3) 산술 표현식으로 정의된 경우
--  4) 그룹 함수나 GROUP BY 절을 포함한 경우
--  5) DISTINCT를 포함한 경우
--  6)JOIN을 이용해 여러 테이블을 연결한 경우 
/*
    <VIEW 옵션>
        [문법]
            CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW
            AS 서브 쿼리
            [WITH CHECK OPTION]
            [WITH READ ONLY];
            
        - OR REPLACE : 기존에 동일한 뷰가 있을 경우 덮어쓰고, 존재하지 않으면 뷰를 새로 생성한다.
        - FORCE : 서브 쿼리에 기술된 테이블이 존재하지 않는 테이블이어도 뷰가 생성된다.
        - NOFORCE : 서브 쿼리에 기술된 테이블이 존재해야만 뷰가 생성된다. (기본값)
        - WITH CHECK OPTION : 서브 쿼리에 기술된 조건에 부합하지 않는 값으로 수정하는 경우 오류를 발생시킨다.
        - WITH READ ONLY : 뷰에 대해 조회만 가능(DML 수행 불가)
*/


-- 직원들 근무지역간의 평균 월급
SELECT LOCAL_NAME, ROUND(AVG(SALARY), 2) 평균월급
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
GROUP BY LOCAL_NAME
;

-- 닉네임(이메일 앞) O 들어가는 직원들 월급의 합 / 닉네임, 월급
SELECT NICK 닉네임, SUM(SALARY) 월급
FROM (
    SELECT SUBSTR(EMAIL, 0, INSTR(EMAIL, '@') - 1) NICK, SALARY
    FROM EMPLOYEE E
    JOIN JOB J
    ON E.JOB_CODE = J.JOB_CODE
    GROUP BY SUBSTR(EMAIL, 0, INSTR(EMAIL, '@') - 1), SALARY
    HAVING SUBSTR(EMAIL, 0, INSTR(EMAIL, '@') - 1) LIKE '%o%'
)
GROUP BY ROLLUP(NICK) 
;




--해외영업팀에 근무하는 사람 중 부서별 가장 최근에 채용된 사람 두명을 찾아 이름, 부서명, 고용날짜를 알려주세요. 가장 먼저 채용된 사람부터 나열해주세요.
SELECT EMP_NAME, DEPT_TITLE, HIRE_DATE
FROM (
    SELECT EMP_NAME, DEPT_TITLE, HIRE_DATE
    FROM EMPLOYEE E
    JOIN DEPARTMENT D
    ON E.DEPT_CODE = D.DEPT_ID
    WHERE DEPT_TITLE LIKE '해외%'
    ORDER BY HIRE_DATE DESC
)
WHERE HIRE_DATE IN (
    SELECT MAX(HIRE_DATE)
    FROM EMPLOYEE E
    JOIN DEPARTMENT D
    ON E.DEPT_CODE = D.DEPT_ID
    GROUP BY DEPT_TITLE
)
;
-- 급여가 350만원 이상 450만원 이하인 직원의 직원이름, 생년월일, 직급코드, 국가코드를 작성해주세요. 나이가 많은 순으로 나열해주세요.
SELECT EMP_NAME, SUBSTR(EMP_NO, 1, 6), JOB_CODE, NATIONAL_CODE
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE SALARY BETWEEN 3500000 AND 4500000
ORDER BY EMP_NO
;

--한국 혹은 일본에서 근무하는 남자 중 부서에서 급여를 가장 많이 받으며,보너스를 받는 사람의 이름, 연봉, 근무지역을 출력하시오
SELECT EMP_NAME, (SALARY + BONUS * SALARY) * 12 연봉, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE (SALARY + BONUS * SALARY) * 12 IN (
SELECT MAX((SALARY + BONUS * SALARY) * 12)
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE NATIONAL_NAME IN ('한국','일본') AND BONUS IS NOT NULL AND SUBSTR(EMP_NO, 8, 1) = 1
GROUP BY DEPT_CODE
)
ORDER BY NATIONAL_NAME DESC, SALARY
;

--모든 사원을 성별로 구분하여 이름, 성별로 표기
SELECT EMP_NAME 이름, CASE
        WHEN SUBSTR(EMP_NO, 8, 1) IN(1,3) THEN '남자'
        WHEN SUBSTR(EMP_NO, 8, 1) IN(2,4) THEN '여자'
        ELSE '잘못된 번호'
        END     성별
FROM EMPLOYEE
;
--각 부서이름별 보너스를 받는 사원수
SELECT DEPT_TITLE, COUNT(BONUS)
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
GROUP BY DEPT_TITLE
ORDER BY DEPT_TITLE
;
/*
-- 연봉은E.SALARY * 12 + E.SALARY * NVL(E.BONUS,0)로 계산했음 --

문제 1.
26년 상반기 KH주식회사의 조직개편을 준비하고자 한다.
인사 담당자 '김국비'프로는 퇴사자를 제외한 직원들을 대상으로,
각 부서의 급여 등급별 인원 수와 해당 인원들의 총 연봉 합계를
부서명의 오름차순(가나다 순)으로 조회하려 한다.
*/
SELECT DEPT_TITLE 부서명, SAL_LEVEL 급여등급, COUNT(DEPT_TITLE) 인원수, SUM(E.SALARY * 12 + E.SALARY * NVL(E.BONUS,0)) "총 연봉 합계"
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN SAL_GRADE S
ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL
WHERE ENT_YN NOT IN 'Y'
GROUP BY DEPT_TITLE, SAL_LEVEL
ORDER BY DEPT_TITLE
;
/*
KH주식회사에는 10월 10일생 직원이 있다.
그는 사실 20년전 KH주식회사의 비리로 희생된
아버지의 복수를 위해 입사한 것이다... 

이 인물은 쌉 T다운 모먼트로 일잘러로 인정받으며 승진가도를 달렸다.
이제 자신보다 더 회사에서 인정받는 인물을 하나하나씩 제거해가며
더 위로 올라가야 한다. 

돈은 곧 권력!!!!! 사랑사랑 보다 돈!
자신의 총 연봉(보너스 포함)을 기준으로,
자신보다 총 연봉이 더 높은 직원들을 “제거 대상자 리스트”로 조회하려 한다.

퇴사자와 부서가 없는 직원은 제외하여
사원명, 부서명, 직급명, 총연봉을 조회하시오!! 
*/
SELECT EMP_NAME, DEPT_TITLE, JOB_NAME, E.SALARY * 12 + E.SALARY * NVL(E.BONUS,0) 총연봉
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE E.SALARY * 12 + E.SALARY * NVL(E.BONUS,0) >= (
    SELECT SALARY * 12 + SALARY * NVL(BONUS,0)
    FROM EMPLOYEE
    WHERE SUBSTR(EMP_NO, 3, 4) = '1010'
)
;
--가장 낮은 연봉을 받는 사람들을 부서별로 이름, 연봉(보너스 포함), 부서코드, 부서명 순으로 출력, 연봉별로 내림차순 정렬, 같은 연봉이 있을 시 EMP_ID값을 통해 오름차순 정렬
SELECT EMP_NAME, SALARY * 12 * (1 + NVL(BONUS,0)) 연봉, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE SALARY IN (
    SELECT MIN(SALARY)
    FROM EMPLOYEE E
    GROUP BY DEPT_CODE
)
--ORDER BY SALARY DESC, EMP_ID
;







