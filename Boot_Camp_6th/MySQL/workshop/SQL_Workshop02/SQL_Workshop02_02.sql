use worshop;

SELECT 
	PROFESSOR_NAME, 
    PROFESSOR_SSN
FROM 
	tb_professor
WHERE 
	not char_length(PROFESSOR_NAME) = 3;

