use testdb;

-- whdls
-- cross join
SELECT*
FROM emp CROSS JOIN dept;

SELECT*
FROM emp NATURAL JOIN dept;

SELECT
	empno, ename, sal, dname
FROM emp NATURAL JOIN dept;

SELECT
	emp.empno, emp.ename, emp.sal, dept.dname, dept.deptno
FROM emp NATURAL JOIN dept;

SELECT
	e.empno, e.ename, e.sal, d.dname, d.deptno
FROM emp e NATURAL JOIN dept d;

-- 검색조건
SELECT
	e.empno, e.ename, e.sal, d.dname, d.deptno
FROM emp e NATURAL JOIN dept d
WHERE d.dname = 'sales';

-- using(공통컬럼)
SELECT *
FROM emp INNER JOIN dept USING(deptno);

SELECT *
FROM emp JOIN dept USING(deptno);

SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e INNER JOIN dept d USING(deptno);

-- ON 조건식
SELECT *
FROM emp JOIN dept ON emp.deptno  = dept.deptno;

SELECT ename, sal, dname, loc
FROM emp JOIN dept ON emp.deptno  = dept.deptno;

SELECT ename, sal, dname, loc, emp.deptno
FROM emp JOIN dept ON emp.deptno  = dept.deptno;
-- non-equi 조인
SELECT *
FROM emp e JOIN salgrade s ON e.sal BETWEEN s.losal AND	s.hisal;

SELECT ename, sal, grade, losal, hisal
FROM emp e JOIN salgrade s ON e.sal BETWEEN s.losal AND	s.hisal;

SELECT ename, deptno, dname, sal, grade
FROM emp e JOIN dept USING(deptno)
			JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal;

SELECT ename, e.deptno, dname, sal, grade
FROM emp e JOIN dept d ON e.deptno = d.deptno
		  JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal;
-- outer 조인
SELECT *
FROM  emp RIGHT OUTER JOIN dept USING(deptno);

SELECT *
FROM  emp RIGHT OUTER JOIN dept ON emp.deptno = dept.deptno;	

SELECT *
FROM  emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno;

--  신입사원
insert into emp (empno, ename,job,mgr,hiredate,sal,comm,deptno)
values ( 9000, '홍길동', 'SALESMAN', 7499, NOW(), 700, 0, null );
commit; 

SELECT ename, sal, dname, loc
FROM emp join dept on emp.deptno = dept.deptno;

SELECT ename
FROM emp LEFT join dept on emp.deptno = dept.deptno;

-- SELF JOIN
SELECT e.ename as '사원' , m.ename as '매니저'
FROM emp e JOIN emp m ON e.mgr = m.empno;

-- 서브 쿼리 (서브쿼리)
SELECT sal
FROM emp
WHERE ename = 'SMITH';

SELECT empno, ename, sal
FROM emp
WHERE sal > 800;

SELECT empno, ename, sal
FROM emp
WHERE sal > ( SELECT sal
			  FROM emp
			  WHERE ename = 'SMITH');


-- ex1.  emp테이블에서 사원번호가 7521 의 업무와 동일하고 급여가 7934보다 많은 사원의 정보(사원번호,이름,job,hiredate,sal)출력?
SELECT empno, job, hiredate, sal 
FROM emp
WHERE 
job = ( SELECT job
		FROM emp
		WHERE empno = 7521)
AND
sal > ( SELECT sal
		FROM emp
		WHERE empno = '7934');
 
 -- ex2.  emp테이블에서 급여의 평균보다 적은 급여를 받는 사원 정보 출력(사원번호,이름,job,hiredate,sal)?
 SELECT empno, ename, job, hiredate,sal
 FROM emp
 WHERE 
 sal < ( SELECT AVG(sal)
		 FROM emp);
-- ex3.  emp테이블에서 20번 부서의 최소급여보다 많은 모든 부서를 출력? (부서명, 최소급여)

SELECT deptno, dname, min(sal)
FROM emp e JOIN dept d USING(deptno)
GROUP BY deptno
HAVING min(sal) > (
	SELECT min(sal)
	FROM emp
	WHERE deptno = 20);

-- ex1. emp테이블에서 업무별로 최소급여를 받는 사원정보 출력(사원번호,이름,job,hiredate,sal)
SELECT empno, ename, job, hiredate, sal 
FROM emp
WHERE sal IN (
	SELECT min(sal)
	FROM emp
	GROUP BY job);
    
-- ex2. emp 테이블에서 job이 manager인 사원의 최소급여보다 적은 급여를 받는 사원 정보(사원번호,이름,job,hiredate,sal)
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal < (
	SELECT min(sal)
	FROM emp
	WHERE job = 'MANAGER');
    
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal < ALL (
	SELECT sal
	FROM emp
	WHERE job = 'MANAGER');

-- ex3. emp 테이블에서 job이 manager인 사원의 최대급여보다 적은 급여를 받는 사원 정보 (사원번호,이름,job,hiredate,sal)				  			  
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal < (
	SELECT MAX(sal)
	FROM emp
	WHERE job = 'MANAGER');
 
 SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal > ANY (
	SELECT MAX(sal)
	FROM emp
	WHERE job = 'MANAGER');


-- ex4. emp 테이블에서 job이 manager인 사원의 최대급여보다 적은 급여를 받는 사원 정보 (사원번호,이름,job,hiredate,sal)				  
				
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal < (
	SELECT MAX(sal)
	FROM emp
	WHERE job = 'MANAGER');

SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal < (
	SELECT sal
	FROM emp
	WHERE job = 'MANAGER');


-- ex5. emp 테이블에서 job이 manager인 사원의 최대급여보다 많은 급여를 받는 사원 정보 (사원번호,이름,job,hiredate,sal)				  
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal > (
	SELECT MAX(sal)
	FROM emp
	WHERE job = 'MANAGER');
    
SELECT empno, ename, job, hiredate, sal
FROM emp
WHERE sal > ALL (
	SELECT sal
	FROM emp
	WHERE job = 'MANAGER');    
    
  
-- EXISTS
SELECT *
FROM emp
WHERE EXISTS (
	SELECT ename
	FROM emp
	WHERE sal = 800);
    
SELECT *
FROM emp
WHERE EXISTS (
	SELECT ename
	FROM emp
	WHERE sal = 8000);


