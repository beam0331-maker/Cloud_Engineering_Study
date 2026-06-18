use workshop;

select
	STUDENT_NO,
    DEPARTMENT_NO,
    STUDENT_NAME,
    rpad(substr(STUDENT_SSN,1,8),14,'*') as STUDENT_SSN,
	concat(substr(STUDENT_ADDRESS,1,10),'...') as STUDENT_ADDRESS,
	date_format(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE,
	ABSENCE_YN,
    COACH_PROFESSOR_NO
from tb_student;