-- db 선택
use testdb;

select * from dept;
select *
from dept;

select * from emp;

select empno, ename,job, hiredate
from emp;

select hiredate, empno, ename, job, hiredate
from emp;

select empno, ename, sal*1.1, round(sal*1.1)
FROM emp;
-- 별칭
select empno as 사번, ename as 성명, sal 급여, sal*12 as "연 봉", '홍길동'
FROM emp;
-- 리터럴
select empno as 사번, '서울', ename as 성명, sal 급여, sal*12 as "연 봉", '홍길동'
FROM emp;

-- null 값 연산

select empno, ename, sal, comm, comm+100
from emp;

select empno, ename, sal, comm, (sal*12) + comm as 연봉
from emp;

select empno, ename, sal, comm,
		(sal*12) + comm as 연봉1,
		(sal*12) + ifnull(comm,0) as 연봉2
from emp;

-- distinct 중복제거
select DISTINCT deptno
from emp;

select DISTINCT job
from emp;

-- 비교연ㅅ나자.
select *
from emp
where sal = 3000;

select *
from emp
where sal != 3000;

select *
from emp
where ename = 'SMITH';

select *
from emp
where ename = 'smith';

select *
from emp
where hiredate = '1980-12-17';

select *
from emp
where hiredate > '1980-12-17';

-- 범위 연산자
select *
from emp
where sal between 3000 and 5000;

select *
from emp
where hiredate between '1981-10-17' and '1981-12-17';

-- IN 연산자

select *				
from emp				
where sal IN (800,3000,1500);	

select *				
from emp
where ename IN ('SMITH','FORD');
select *				
from emp
where hiredate IN ('1981-12-03','1980-12-19');

-- is null
select *				
from emp
where comm is null; -- job이 SALESMAN이 아닌 레코드 

select *				
from emp
where comm is not null; -- job이 SALESMAN이 아닌 레코드

-- LIKE
select *				
from emp	
where ename like '%A%';

select *				
from emp	
where ename like '%N';

select *				
from emp	
where ename like 'A%';

select *				
from emp	
where ename like '_____R';

select *				
from emp	
where ename like '_____R%';

-- and or not
select *				
from emp
where ename = 'SMITH' and sal > 3000;

select *				
from emp
where ename = 'SMITH' or sal > 3000;

select *				
from emp
where ename != 'SMITH';

select *				
from emp
where NOT ename = 'SMITH';

select *
from emp
where NOT sal between 3000 and 5000;

select *				
from emp				
where not sal IN (800,3000,1500);	

select *				
from emp	
where not ename like 'A%';

-- 정렬
select *
from emp
order by sal;	-- 오름차순

select *
from emp
order by sal desc;	-- 내림차순

select *
from emp
order by hiredate desc; -- 내림차순

select *
from emp
order by sal desc, hiredate;

select *
from emp
order by sal desc, hiredate desc;

select ename, ename, sal as salary, hiredate
from emp
order by salary desc, 4 desc;
