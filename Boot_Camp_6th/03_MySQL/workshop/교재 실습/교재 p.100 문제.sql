use testdb;

-- 교재 p.100 문제
-- 01
SELECT empno, ename,deptno, dname
FROM dept NATURAL JOIN emp
ORDER BY ename ;

-- 02
SELECT empno, ename, sal, d.deptno, d.dname
FROM emp e JOIN dept d on e.deptno = d.deptno
WHERE sal >= 2000
ORDER BY sal DESC ;

-- 03
SELECT empno, ename, job, sal, d.deptno, d.dname
FROM emp e JOIN dept d on e.deptno = d.deptno
WHERE job = 'MANAGER' and
	  sal >= 2500
ORDER BY job;

-- 04
SELECT empno, ename, sal, grade
FROM emp e JOIN salgrade s on e.sal BETWEEN s.LOSAL and s.HISAL
WHERE GRADE = 4
ORDER BY sal DESC;

-- 05
SELECT empno,ename,dname,sal,grade
FROM emp e LEFT OUTER JOIN dept d USING(deptno)	
    JOIN salgrade s on e.sal BETWEEN s.LOSAL and s.HISAL
ORDER BY grade DESC;

-- 06
SELECT
	e.ename as '사원'
	, m.ename as '관리자'
FROM emp e JOIN emp m ON e.mgr = m.empno;

-- 07
SELECT
	e.ename as '사원'
	, m.ename as '관리자1'
    , m2.ename as '관리자2'
FROM 
	emp e JOIN emp m ON e.mgr = m.empno 
		  JOIN emp m2 On m.mgr = m2.empno ;
          
-- 08
SELECT 
    e.ENAME AS '사원',
    m.ENAME AS '관리자1',
    m2.ENAME AS '관리자2'
FROM emp e
-- [1단계] 사원(e)을 기준으로 관리자1(m)을 붙입니다. (상사가 없는 사장님도 보존)
LEFT JOIN emp m ON e.MGR = m.EMPNO
-- [2단계] 관리자1(m)을 기준으로 관리자2(m2)를 붙입니다. (임원들도 보존)
LEFT JOIN emp m2 ON m.MGR = m2.EMPNO;
          
-- 09
SELECT ename, dname, DEPTNO
FROM emp e JOIN dept d USING(DEPTNO)
WHERE DEPTNO = 20;

-- 10
SELECT ename, comm, dname
FROM emp e join dept USING(DEPTNO)
WHERE 
	e.comm is not null
	and e.comm > 0;

-- 11
SELECT ename, dname
FROM emp NATURAL join dept 
WHERE
	ename like '%A%';
    
-- 12
SELECT ename, sal, hiredate, loc
FROM emp NATURAL join dept 
where loc = 'dallas' and sal >= 1500;

-- 13
SELECT
	e.ENAME as '사원',
    m.ENAME as '관리자',
    e.sal
FROM emp e JOIN emp m ON e.MGR = m.EMPNO
WHERE e.sal > m.sal;

-- 14
SELECT dname as '부서명', count(*) as '인원수'
FROM emp NATURAL join dept
where year(hiredate) < 1982
group by dname;

-- 15
SELECT ename, sal, hiredate, dname
FROM emp e join dept d on e.DEPTNO = d.DEPTNO
WHERE
2024 - substr(str_to_date(hiredate, '%Y-%m-%d'),1,4) < 40
;
