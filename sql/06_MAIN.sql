--JOIN
/*
    <JOIN>
        두 개의 이상의 테이블에서 데이터를 조회하고자 할 때 사용하는 구문이다.
        
        1. 등가 조인(EQUAL JOIN) / 내부 조인(INNER JOIN)
            연결시키는 칼럼의 값이 일치하는 행들만 조인되서 조회한다.(일치하는 값이 없는 행은 조회 X)
            
            1) 오라클 전용 구문
                [문법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1, 테이블2
                    WHERE 테이블1.칼럼명 = 테이블2.칼럼명;
                
                - FROM 절에 조회하고자 하는 테이블들을 콤마(,)로 구분하여 나열한다.
                - WHERE 절에 매칭 시킬 칼럼명에 대한 조건을 제시한다.
            
            2) ANSI 표준 구문
                [문법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1
                    [INNER] JOIN 테이블2 ON (테이블1.칼럼명 = 테이블2.칼럼명);
                
                - FROM 절에 기준이 되는 테이블을 기술한다.
                - JOIN 절에 같이 조회하고자 하는 테이블을 기술 후 매칭 시킬 칼럼에 대한 조건을 기술한다.
                - 연결에 사용하려는 칼럼명이 같은 경우 ON 구문 대신에 USING(칼럼명) 구문을 사용한다.
*/
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE
;

SELECT * 
FROM DEPARTMENT
;

SELECT EMP_NAME, DEPT_CODE,  DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
;
-- EMPLOYEE 테이블과 JOB 테이블을 조인하여 사원명, 직급코드, 직급명 조회
SELECT EMP_NAME, EMPLOYEE.JOB_CODE, JOB_NAME
FROM EMPLOYEE 
JOIN JOB
ON EMPLOYEE.JOB_CODE = JOB.JOB_CODE
;
-- EMPLOYEE 테이블과 JOB 테이블을 조인하여 직급이 대리인 사원의 사번, 사원명, 직급명, 급여를 조회
SELECT EMP_ID, EMP_NAME, JOB_NAME, SALARY
FROM EMPLOYEE
JOIN JOB
ON EMPLOYEE.JOB_CODE =JOB.JOB_CODE
WHERE JOB_NAME = '대리'
;

--모든 사원의 이름, 부서코드, 부서명 조회 (부서코드가 없어도)
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT
ON EMPLOYEE.DEPT_CODE = DEPARTMENT.DEPT_ID
;
/*
    2. 다중 JOIN
        여러 개의 테이블 조인하는 경우에 사용한다.
*/
-- EMPLOYEE, DEPARTMENT, LOCATION 테이블을 다중 JOIN 하여 사번, 사원명, 부서명, 지역명 조회
SELECT *
FROM EMPLOYEE
JOIN DEPARTMENT
ON EMPLOYEE.DEPT_CODE = DEPARTMENT.DEPT_ID
JOIN LOCATION
ON DEPARTMENT.LOCATION_ID = LOCATION.LOCAL_CODE
;
/*
    3. 외부 조인 (OUTTER JOIN)
        테이블 간의 JOIN 시 일치하지 않는 행도 포함시켜서 조회가 가능하다.
        단, 반드시 기준이되는 테이블(컬럼)을 지정해야 한다. (LEFT/RIGHT/(+))
*/

/*
    4. 카테시안곱(CARTESIAN PRODUCT) / 교차 조인(CROSS JOIN)
        조인되는 모든 테이블의 각 행들이 서로서로 모두 매핑된 데이터가 검색된다.
        테이블의 행들이 모두 곱해진 행들의 조합이 출력 -> 과부화의 위험
*/
/*
    5. 비등가 조인(NON EQUAL JOIN)
        조인 조건에 등호(=)를 사용하지 않는 조인문을 비등가 조인이라고 한다.
        지정한 칼럼 값이 일치하는 경우가 아닌, 값의 범위에 포함되는 행들을 연결하는 방식이다.
        ( = 이외에 비교 연산자 >, <, >=, <=, BETWEEN AND, IN, NOT IN 등을 사용한다.)
        ANSI 구문으로는 JOIN ON 구문으로만 사용이 가능하다. (USING 사용 불가)
*/
-- EMPLOYEE 테이블과 SAL_GRADE 테이블을 비등가 조인하여 사원명, 급여, 급여 등급 조회
SELECT EMP_NAME, SALARY, SAL_LEVEL
FROM EMPLOYEE E
JOIN SAL_GRADE S
ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL
;
/*
    6. 자체 조인(SELF JOIN)
        같은 테이블을 다시 한번 조인하는 경우에 사용한다.
*/
-- EMPLOYEE 테이블을 SELF JOIN 하여 사번, 사원명, 부서 코드, 사수 사번, 사수 이름 조회
SELECT E.EMP_ID, E.EMP_NAME, E.DEPT_CODE, E.MANAGER_ID, M.EMP_NAME
FROM EMPLOYEE E
JOIN EMPLOYEE M
ON E.MANAGER_ID = M.EMP_ID
;
---------------- 실습 문제 ----------------
-- 1. DEPARTMENT 테이블과 LOCATION 테이블의 조인하여 부서 코드, 부서명, 지역 코드, 지역명을 조회
SELECT DEPT_ID, DEPT_TITLE, LOCAL_CODE, LOCAL_NAME
FROM DEPARTMENT D
JOIN LOCATION L
ON D.LOCATION_ID = LOCAL_CODE
;

-- 2. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 보너스를 받는 사원들의 사번, 사원명, 보너스, 부서명을 조회
SELECT EMP_ID, EMP_NAME, BONUS, DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE BONUS IS NOT NULL
;

-- 3. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 인사관리부가 아닌 사원들의 사원명, 부서명, 급여를 조회
SELECT EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE DEPT_TITLE != '인사관리부' OR DEPT_TITLE IS NULL
;

-- 4. EMPLOYEE 테이블, DEPARTMENT 테이블, LOCATION 테이블의 조인해서 사번, 사원명, 부서명, 지역명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
LEFT JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
;

-- 5. 사번, 사원명, 부서명, 지역명, 국가명 조회
SELECT EMP_ID, EMP_NAME, LOCAL_NAME, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
;
-- 6. 사번, 사원명, 부서명, 지역명, 국가명, 급여 등급 조회 (NON EQUAL JOIN 사용)
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, LOCAL_NAME, NATIONAL_NAME, SAL_LEVEL
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
JOIN SAL_GRADE S
ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL
;

------------------------- 종합 실습 문제 -------------------------
-- 1. 직급이 대리이면서 ASIA 지역에서 근무하는 직원들의 사번, 사원명, 직급명, 부서명, 근무지역, 급여를 조회하세요.
SELECT EMP_ID, EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME, SALARY
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE J.JOB_NAME = '대리' AND L.LOCAL_NAME LIKE 'ASIA%'
;

-- 2. 70년대생 이면서 여자이고, 성이 전 씨인 직원들의 사원명, 주민번호, 부서명, 직급명을 조회하세요.
SELECT EMP_NAME, EMP_NO, DEPT_TITLE, JOB_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NO LIKE '7%' AND EMP_NAME LIKE '전%'
;
-- 3. 보너스를 받는 직원들의 사원명, 보너스, 연봉, 부서명, 근무지역을 조회하세요.
SELECT EMP_NAME, BONUS, SALARY * 12, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE BONUS IS NOT NULL
;
-- 4. 한국과 일본에서 근무하는 직원들의 사원명, 부서명, 근무지역, 근무 국가를 조회하세요.
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE NATIONAL_NAME IN('한국', '일본')
;
-- 5. 각 부서별 평균 급여를 조회하여 부서명, 평균 급여(정수 처리)를 조회하세요.
SELECT DEPT_TITLE, ROUND(AVG(SALARY))
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
GROUP BY DEPT_TITLE
;
-- 6. 각 부서별 총 급여의 합이 1000만원 이상인 부서명, 급여의 합을 조회하시오.
SELECT DEPT_TITLE, SUM(SALARY)
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
GROUP BY DEPT_TITLE
HAVING SUM(SALARY) >= 10000000
;
-- 7. 사번, 사원명, 직급명, 급여 등급, 구분을 조회 (NON EQUAL JOIN 사용)
SELECT EMP_ID, EMP_NAME, JOB_NAME, SAL_LEVEL, 
    CASE WHEN SAL_LEVEL IN('S1','S2') THEN '고급'
    WHEN SAL_LEVEL IN('S3','S4') THEN '중급'
    WHEN SAL_LEVEL IN('S5','S6') THEN '초급'
    ELSE '보통'
    END 구분
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN SAL_GRADE S ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL
;
-- 8. 보너스를 받지 않는 직원들 중 직급 코드가 J4 또는 J7인 직원들의 사원명, 직급명, 급여를 조회하시오.
SELECT EMP_NAME, JOB_NAME, SALARY
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE BONUS IS NULL AND E.JOB_CODE IN('J4','J7')
;
-- 9. 부서가 있는 직원들의 사원명, 직급명, 부서명, 근무 지역을 조회하시오.
SELECT EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE DEPT_CODE IS NOT NULL
;
-- 10. 해외영업팀에 근무하는 직원들의 사원명, 직급명, 부서 코드, 부서명을 조회하시오
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE DEPT_TITLE LIKE '해외%'
;
-- 11. 이름에 '형'자가 들어있는 직원들의 사번, 사원명, 직급명을 조회하시오.
SELECT EMP_ID, EMP_NAME, JOB_NAME
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '%형%'
;
