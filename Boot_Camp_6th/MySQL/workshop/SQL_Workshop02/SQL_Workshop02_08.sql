use workshop;

SELECT
	STUDENT_NO,
	STUDENT_NAME
FROM tb_student
WHERE
	NOT STUDENT_NO like 'A%';


