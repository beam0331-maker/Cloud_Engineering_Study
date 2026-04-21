use testdb;

-- 01
SELECT empno, ename,sal
FROM emp
WHERE sal >(
	SELECT sal
    FROM emp
    WHERE ename = 'BLAKE');
    
-- 02

SELECT empno, ename, hiredate
FROM emp
WHERE hiredate > (
	SELECT hiredate
    FROM emp
    WHERE ENAME = 'miller');

SELECT empno, avg(sal)
    from emp
    GROUP BY empno;

-- 03
SELECT empno, ename, sal
from emp
WHERE sal > all (
	SELECT avg(sal)
    from emp);
    
-- 04
SELECT empno, ename, deptno, sal
FROM emp
where sal in (
	SELECT max(sal)
    from emp
    GROUP BY DEPTNO
);

-- 05

SELECT *
FROM emp
WHERE sal < (
	SELECT (LOSAL+HISAL)/2
    from salgrade
	WHERE GRADE = 2
);


    
