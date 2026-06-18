use workshop;

select STUDENT_NAME
from tb_student
WHERE DEPARTMENT_NO = (
	SELECT DEPARTMENT_NO
    From tb_department
    WHERE DEPARTMENT_NAME = '국어국문학과' ) 
    and ABSENCE_YN = 'y'
    and STUDENT_SSN like ('%-2%')
;


