use testdb;

-- 문자열 함수
SELECT empno, lower(ename), upper(ename), upper('hello')
FROM emp;

SELECT empno, concat(ename,' ',sal) as "name sal"
from emp;

SELECT empno, concat_ws(',',ename,sal) as "name,sal"
from emp;

SELECT empno, lpad(ename, 10,'*'), rpad(ename, 10, '*')
FROM emp;

SELECT ename, substr(ename,2), substr(ename,2,2)
FROM emp;

SELECT ename, length(ename), length('홍길동')
from emp;

SELECT ename, length(ename),  length('홍길동'), char_length('홍길동')
from emp;

SELECT ename, sal, replace(sal,'0','o')
from emp;

SELECT ename, sal, replace(sal,'0','o')
		,INSERT('Quadratic', 3, 4, 'What')
from emp;

SELECT ename, instr(ename,'nes')
FROM emp;

SELECT ename, ltrim('     hello     '),
Rtrim('     hello     '),
trim('     hello     ')
from emp;

SELECT ename, TRIM(LEADING 'x' FROM 'xxxxhelloxxxx'),
TRIM(Trailing 'x' FROM 'xxxxhelloxxxx'),
TRIM(both 'x' FROM 'xxxxhelloxxxx')
from emp;

SELECT ename, repeat(ename,2)
from emp;

SELECT ename, reverse(ename)
from emp;

SELECT empno, concat(ename,'     ',sal), concat(ename, space(5), sal)
from emp;

SELECT FORMAT(12332.123456, 4);
SELECT FORMAT(12332.1,4);
SELECT FORMAT(12332.2,0);
SELECT FORMAT(12332.2,2,'ko_kr');

SELECT LEFT('foobarbar', 5), RIGHT('foobarbar', 4);
-- 수치함수
SELECT ABS(2), ABS(-22);
SELECT SIGN(-32), SIGN(0),  SIGN(234);
SELECT ROUND(1234.5678), ROUND(1234.5678,2);
SELECT TRUNCATE(1.223,1), TRUNCATE(1.999,0);
SELECT CEILING(1.23), CEILING(-1.23);
SELECT FLOOR(1.23), FLOOR(-1.23);

SELECT MOD(234, 10), 253 % 7,  MOD(29,9),29 MOD 9;

-- 날짜 함수
SELECT NOW(), NOW() + 0 , SYSDATE();
SELECT NOW(), SLEEP(2), NOW();
SELECT sysdate(), SLEEP(2), sysdate();
SELECT CURDATE(),CURRENT_DATE, CURRENT_DATE();

SELECT now(),LOCALTIME(), LOCALTIME, LOCALTIMESTAMP, LOCALTIMESTAMP();
SELECT CURTIME(),CURRENT_TIME(), CURRENT_TIME;
SELECT CURTIME(), CURTIME() + 0, CURTIME(3);

SELECT DATE_ADD('2008-01-02', INTERVAL 31 DAY);

SELECT adddate(now(),3), subdate(now(),20);

	
SELECT ADDDATE(now(), INTERVAL 31 Day),
ADDDATE(now(), INTERVAL 31 YEAR),
ADDDATE(now(), INTERVAL 31 MONTH);

SELECT subdate(NOW(),31),
SUBDATE(NOW(), INTERVAL 31 DAY),
SUBDATE(NOW(), INTERVAL 31 YEAR),
SUBDATE(NOW(), INTERVAL 31 MONTH);

SELECT DATEDIFF(now(),'2007-12-30');

SELECT TIMESTAMPDIFF(MONTH,'2003-02-01','2003-05-01'),
TIMESTAMPDIFF(YEAR,now(),addDate(now(), interval 31 year )),
TIMESTAMPDIFF(MINUTE,'2003-02-01','2003-05-01 12:05:55');

SELECT last_day(now());

SELECT 
    NOW(),
    EXTRACT(YEAR FROM NOW()),
    EXTRACT(MONTH FROM NOW()),
    EXTRACT(DAY FROM NOW()),
    EXTRACT(HOUR FROM NOW()),
    EXTRACT(MINUTE FROM NOW()),
    EXTRACT(SECOND FROM NOW());

SELECT 
    DATE_FORMAT(NOW(), '%Y-%m-%d %H:$I:%S'),
    DATE_FORMAT(NOW(), '%Y년-%m월-%d일 %H시%I분%S초'),
    DATE_FORMAT(NOW(), '%Y년-%m월'),
    DATE_FORMAT(NOW(), '%H시%I분%S초')
;

SELECT 
    STR_TO_DATE('2019년02월23일', '%Y년%m월%d일'),
    STR_TO_DATE('20190223일', '%Y%m%d'),
    STR_TO_DATE('02232019', '%m%d%Y'),
    STR_TO_DATE('02/23/2019', '%m/%d/%Y'),
    STR_TO_DATE('20260415143650', '%Y%m%d%H%i%S');

SELECT empno, ename, sal, if(sal > 3000, '과장이상', '일반사원')

FROM emp;
use testdb;

SELECT DISTINCT job
FROM emp;
SELECT EMPNO, ENAME, JOB, SAL, 
CASE JOB 
WHEN 'CLERK' THEN SAL*1.1
WHEN 'SALESMAN' THEN SAL*1.2
WHEN 'MANAGER' THEN SAL*1.3
WHEN 'ANALYST' THEN SAL*1.4
ELSE sal
END as '실수령'
from emp;

SELECT EMPNO, ENAME, JOB, SAL,
CASE										
WHEN SAL > 3000 THEN '이사'		
WHEN SAL > 2500 THEN '과장'
ELSE '사원'
END as '직급'
from emp;

SELECT CAST(10 AS CHAR);
SELECT CAST('10' AS FLOAT);
SELECT CAST('10' AS UNSIGNED);
SELECT CAST('2010-02-23' AS DATE);

-- 그룹함수
SELECT JOB, SUM(sal), AVG(SAL), max(sal), min(sal), count(sal)
FROM emp
GROUP BY JOB;

SELECT DEPTNO , SUM(sal), AVG(SAL), max(sal), min(sal), count(sal), count(comm)
FROM emp
GROUP BY DEPTNO;

SELECT 
    DEPTNO,
    SUM(sal),
    AVG(SAL),
    MAX(sal),
    MIN(sal),
    COUNT(sal),
    COUNT(comm)
FROM
    emp
GROUP BY DEPTNO
HAVING SUM(sal) > 9000;
                
SELECT 
    DEPTNO ,
    SUM(sal),
    AVG(SAL),
    MAX(sal),
    MIN(sal),
    COUNT(sal)
FROM
    emp
WHERE SAL > 1000
GROUP BY DEPTNO -- 부서별
HAVING sum(sal) > 9000;

SELECT 
    SUM(sal), AVG(SAL), MAX(sal), MIN(sal), COUNT(sal)
FROM
    emp;
    
SELECT 
    COUNT(comm), count(sal), count(*)
FROM
    emp;