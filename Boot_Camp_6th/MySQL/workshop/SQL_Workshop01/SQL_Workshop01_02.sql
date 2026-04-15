use workshop;

SELECT concat(DEPARTMENT_NAME, '의 정원은',CAPACITY,'명 입니다.' ) as "학과별 정원"
from tb_department;
