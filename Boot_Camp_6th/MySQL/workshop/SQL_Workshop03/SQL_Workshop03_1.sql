use workshop;
-- SQL_Workshop03_1_문제

-- 16
SELECT STUDENT_NAME as '동일이름',
	COUNT(*) as '동명이인수'
FROM tb_student
GROUP BY STUDENT_NAME
HAVING COUNT(*) > 1 ;

-- 17
SELECT
	STUDENT_NAME as '동일이름',
    STUDENT_NO as '학번',
    STUDENT_ADDRESS as "거주지 주소"
FROM tb_student
WHERE
	substr(STUDENT_NO,1,1) = '9'
    and (STUDENT_ADDRESS LIKE ('%경기도%') or STUDENT_ADDRESS LIKE ('%강원도%'))
ORDER BY STUDENT_NAME;

-- 18
SELECT PROFESSOR_NAME, PROFESSOR_SSN
FROM
	tb_professor p join tb_department d USING(DEPARTMENT_NO)
WHERE 
	DEPARTMENT_NAME = '법학과'
ORDER BY PROFESSOR_SSN;

-- 19
SELECT CLASS_NAME, DEPARTMENT_NAME
FROM tb_class c join tb_department USING(DEPARTMENT_NO);

-- 20
SELECT DISTINCT CLASS_NAME, PROFESSOR_NAME
FROM tb_class_professor 
join tb_class using(CLASS_NO)
join tb_professor USING(PROFESSOR_NO);





