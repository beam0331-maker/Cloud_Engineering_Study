use workshop;

SELECT 
	STUDENT_NO,
    STUDENT_NAME    
FROM tb_student
where
	(YEAR(ENTRANCE_DATE) - YEAR(STR_TO_DATE(CONCAT('19', LEFT(STUDENT_SSN, 6)), '%Y%m%d')) + 1) = 21;
   