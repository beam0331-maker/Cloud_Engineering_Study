-- SQL_Workshop02_2
use workshop;

-- 01번
SELECT 
	sum( if(left(STUDENT_NO,2) = 'a1',1,0) ) as '학생수'
FROM tb_student
GROUP BY DEPARTMENT_NO
having DEPARTMENT_NO = '003'
;

-- 02번
SELECT
	CATEGORY as '계열'
    , DEPARTMENT_NAME as '학과이름'
    , CAPACITY as '정원'
from tb_department
WHERE CATEGORY like '공학'
HAVING CAPACITY BETWEEN 20 AND 30;
;

-- 03번
SELECT
	CATEGORY as '계열'
	, COUNT(*) as '학과수'
FROM tb_department
GROUP BY CATEGORY
having CATEGORY like '%학%'
ORDER BY '학과수';ALTER;

-- 04번
SELECT
	PROFESSOR_NAME as '교수이름', 
    left(PROFESSOR_SSN,2) as '출생년도', 
    PROFESSOR_ADDRESS as '주소'
FROM tb_professor
WHERE DEPARTMENT_NO = 002
ORDER BY left(PROFESSOR_SSN,2);

-- 05
SELECT
	DEPARTMENT_NO as '학과번호' ,
    STUDENT_NAME as	'학생이름' ,
    if(ABSENCE_YN = 'y', '휴학','정상') as '휴학여부'
FROM tb_student
WHERE
	DEPARTMENT_NO = 001 
    and
    left(STUDENT_ADDRESS,2) = '서울'
ORDER BY STUDENT_NAME;

    

