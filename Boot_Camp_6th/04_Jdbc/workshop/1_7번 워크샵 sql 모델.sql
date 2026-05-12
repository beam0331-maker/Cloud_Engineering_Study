use workshp;
SET AUTOCOMMIT = 0;


select
	TERM_NO,
	STUDENT_NO,
	STUDENT_NAME,
	rpad(substr(STUDENT_SSN,1,8),14,'*') as STUDENT_SSN,
	concat(substr(STUDENT_ADDRESS,1,10),'...') as STUDENT_ADDRESS,
	date_format(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE,
	ABSENCE_YN,
	COACH_PROFESSOR_NO,
    point,
    case when point between 0 and 1.9 then "F 학점"
		 when point between 2.0 and 2.9 then "D 학점"
         when point between 3.0 and 3.4 then "C 학점"
         when point between 3.5 and 3.9 then "B 학점"
         else "A 학점"
	end
    POINT    
	from tb_student join tb_grade using (STUDENT_NO)
    order by TERM_NO
    ;
        
select	
	STUDENT_NO,
	s.DEPARTMENT_NO,
	STUDENT_NAME,
	rpad(substr(STUDENT_SSN,1,8),14,'*') as STUDENT_SSN,
	concat(substr(STUDENT_ADDRESS,1,10),'...') as STUDENT_ADDRESS,
	date_format(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE,
	ABSENCE_YN,
	COACH_PROFESSOR_NO,
	TERM_NO,
    CLASS_NAME,
    case when point between 0 and 1.9 then "F 학점"
		 when point between 2.0 and 2.9 then "D 학점"
         when point between 3.0 and 3.4 then "C 학점"
         when point between 3.5 and 3.9 then "B 학점"
         else "A 학점"
	end as GRAD 
from tb_student s join tb_grade g using (STUDENT_NO)	
				  join tb_class c using (CLASS_NO)									
order by TERM_NO
;


ROLLBACK;