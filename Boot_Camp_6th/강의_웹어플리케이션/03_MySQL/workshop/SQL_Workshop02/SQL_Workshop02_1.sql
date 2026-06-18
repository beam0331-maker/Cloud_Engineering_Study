-- SQL_Workshop02_1
use worshop;

-- 01
SELECT 
	STUDENT_NO as '학번', STUDENT_NAME as '이름', ENTRANCE_DATE as '입학년도'
FROM tb_student
WHERE
	DEPARTMENT_NO = 002
ORDER BY ENTRANCE_DATE;

-- 02
SELECT 
	PROFESSOR_NAME, 
    PROFESSOR_SSN
FROM 
	tb_professor
WHERE 
	not char_length(PROFESSOR_NAME) = 3;
    
-- 03
SELECT
	PROFESSOR_NAME as '교수이름' ,     
	TIMESTAMPDIFF(year,STR_TO_DATE(CONCAT('19', PROFESSOR_SSN), '%Y%m%d'),now()) as '나이'
FROM tb_professor
WHERE
	PROFESSOR_SSN like ('%-1%')
ORDER BY PROFESSOR_SSN desc;

-- 04
SELECT 
	right(PROFESSOR_NAME,2) as '나이'	
FROM tb_professor;

-- 05
SELECT 
	STUDENT_NO,
    STUDENT_NAME    
FROM tb_student
where
	(YEAR(ENTRANCE_DATE) - YEAR(STR_TO_DATE(CONCAT('19', LEFT(STUDENT_SSN, 6)), '%Y%m%d')) + 1) = 21;

-- 06
SELECT date_format('2020-12-25','%W');

-- 08
SELECT
	STUDENT_NO,
	STUDENT_NAME
FROM tb_student
WHERE
	NOT STUDENT_NO like 'A%';

-- 09
SELECT
	round(AVG(POINT),1) as '평점'
FROM tb_grade
WHERE 
	STUDENT_NO = 'a517178'
GROUP BY STUDENT_NO;

-- 10
SELECT 
	DEPARTMENT_NO as '학과번호',
    COUNT(DEPARTMENT_NO) as '학생수(명)'
FROM tb_student
GROUP BY DEPARTMENT_NO;

-- 11
SELECT COUNT(*)
FROM tb_student
WHERE COACH_PROFESSOR_NO is null
GROUP BY COACH_PROFESSOR_NO;

-- 12
SELECT
	left(TERM_NO,4) as '년도'
    , round(avg(POINT),1) as '년도 별 평점'
FROM tb_grade
WHERE 
	STUDENT_NO = 'a112113'
GROUP BY left(TERM_NO,4);

-- 13
SELECT
	DEPARTMENT_NO as '학과코드명'
    , sum(if(ABSENCE_YN = 'y',1,0)) as "휴학생 수"
FROM tb_student
GROUP BY DEPARTMENT_NO;


-- 14
SELECT 
	STUDENT_NAME as '동명이름'
    , COUNT(*) as "동명인 수"
FROM tb_student
GROUP BY STUDENT_NAME
HAVING COUNT(STUDENT_NAME) > 1
;

