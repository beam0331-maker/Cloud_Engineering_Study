use workshop;
-- SQL_Workshop04
-- 34
UPDATE tb_department
SET CAPACITY = CAPACITY*1.1;

SELECT CAPACITY
FROM tb_department;
ROLLBACK;

-- 35
UPDATE tb_student
SET STUDENT_ADDRESS = "서울시 종로구 숭인동 181-21"
WHERE STUDENT_NO = 'a413042';

SELECT STUDENT_ADDRESS
FROM tb_student
WHERE STUDENT_NO = 'a413042';
ROLLBACK;
  
-- 36
UPDATE tb_student
SET STUDENT_SSN = substr(STUDENT_SSN,1,6);

SELECT STUDENT_SSN
FROM tb_student;
ROLLBACK;

-- 37

UPDATE tb_grade
SET POINT = 3.5
WHERE TERM_NO = 200501 AND 
	STUDENT_NO = (
		SELECT STUDENT_NO
		FROM tb_student s JOIN tb_department t USING(DEPARTMENT_NO)
		WHERE s.STUDENT_NAME = '김명훈' and t.DEPARTMENT_NAME = '의학과') and
	CLASS_NO = (
		SELECT CLASS_NO
        From tb_class
        WHERE CLASS_NAME = '피부생리학')
;

SELECT *
FROM tb_grade
WHERE tERM_NO = 200501 AND 
	STUDENT_NO = (
		SELECT STUDENT_NO
		FROM tb_student s JOIN tb_department t USING(DEPARTMENT_NO)
		WHERE s.STUDENT_NAME = '김명훈' and t.DEPARTMENT_NAME = '의학과') and
	CLASS_NO = (
		SELECT CLASS_NO
        From tb_class
        WHERE CLASS_NAME = '피부생리학');
ROLLBACK;

-- 38
DELETE FROM tb_grade
WHERE STUDENT_NO in (
	SELECT STUDENT_NO
    FROM tb_student
    WHERE ABSENCE_YN = 'y');
    
SELECT STUDENT_NAME, ABSENCE_YN
FROM tb_student JOIN tb_grade USING(STUDENT_NO);
ROLLBACK;


