use workshop;

SELECT
	PROFESSOR_NAME as '교수이름' ,     
	TIMESTAMPDIFF(year,STR_TO_DATE(CONCAT('19', PROFESSOR_SSN), '%Y%m%d'),now()) as '나이'
FROM tb_professor
WHERE
	PROFESSOR_SSN like ('%-1%')
ORDER BY PROFESSOR_SSN desc;
