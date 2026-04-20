use testdb;

show variables like 'autocommit%';
set autocommit = false;
show variables like 'autocommit%';

-- DML
-- INSERT


INSERT into dept (deptno, dname, loc) 
VALUES(41,'인사과', '서울');


INSERT into dept (deptno, dname) 
VALUES(42,'인사과');

INSERT into dept (deptno, dname, loc) 
VALUES(43,'인사과',null);

INSERT into dept
VALUES(44,'인사과',null);
-- 오류발생
INSERT into dept
VALUES(45,'인사과');

SELECT * from dept;

create table my_emp
as 
select empno, ename, sal
from emp
where 1=2;

insert into my_emp(empno, ename, sal)
select empno, ename, sal
from emp;

insert into my_emp(empno, ename, sal)
values (10, '홍길동1',500), (20, '홍길동2',500),(30, '홍길동3',500);
commit;

update my_emp
set ename = '이순신', sal = 100;
ROLLBACK;

UPDATE my_emp
set ename = '이순신', sal = 100
where empno = 7369;
ROLLBACK;

delete from my_emp;
ROLLBACK;

delete from my_emp
where empno = 7369;
ROLLBACK;

-- DDL

create table if not exists board
(
	num int PRIMARY KEY AUTO_INCREMENT,
	title varchar(100) NOT NUlL,
	author varchar(10) NOT NUlL,
	content varchar(500) NOT NUlL,
	writeday datetime DEFAULT now(),
	readcnt int DEFAULT 0
);

INSERT INTO board (title, author,content) VALUES ('테스트','홍길동','내용무');
SELECT * FROM board;

create table if not exists board2
(
	num int PRIMARY KEY AUTO_INCREMENT,
	title varchar(100) NOT NUlL,
	author varchar(10) NOT NUlL,
	content varchar(500) NOT NUlL,
	writeday datetime DEFAULT now(),
    gender char(4) CONSTRAINT CHECK (gender in ('M','F')),
	readcnt int DEFAULT 0
);

INSERT INTO board2 (title, author,content, gender ) 
VALUES ('테스트','홍길동','내용무','M');
INSERT INTO board2 (title, author,content,gender ) 
VALUES ('테스트','홍길동','내용무','F');
INSERT INTO board2(title, author,content,gender ) 
VALUES ('테스트','홍길동','내용무','남');
SELECT * FROM board;

create table if not exists board3
(
	num int AUTO_INCREMENT,
	title varchar(100) NOT NUlL,
	author varchar(10) NOT NUlL,
	content varchar(500) NOT NUlL,
	writeday datetime DEFAULT now(),
	gender char(4),
	readcnt int DEFAULT 0,
	
	CONSTRAINT PRIMARY KEY(num),
	CONSTRAINT CHECK (gender in ('M','F')),
	CONSTRAINT UNIQUE (author)
);
INSERT INTO board3 (title, author,content, gender ) 
VALUES ('테스트','홍길동','내용무','M');
SELECT * FROM board3;

create table if not exists board4
(
	num int,
	title varchar(100) NOT NUlL,
	author varchar(10) NOT NUlL,
	content varchar(500) NOT NUlL,
	writeday datetime DEFAULT now(),
	gender char(4),
	readcnt int DEFAULT 0
);	

alter table board4
modify title varchar(100) not null;	

alter table board4
add CONSTRAINT PRIMARY KEY(num);

alter table board4
add CONSTRAINT CHECK (gender in ('M','F'));

alter table board4
add CONSTRAINT UNIQUE (author);
									
INSERT INTO board4 (num,title, author,content, gender ) 
VALUES (1,'테스트','홍길동','내용무','M');           

SELECT * FROM board4;

create table if not exists board5
(
	num int,
	title varchar(100) NOT NUlL,
	author varchar(10) NOT NUlL,
	content varchar(500) NOT NUlL,
	writeday datetime DEFAULT now(),
	gender char(4),
	readcnt int DEFAULT 0
);

alter table board5
modify num INT AUTO_INCREMENT,
add CONSTRAINT PRIMARY KEY(num);

-- foreign key

create table master1
(no int PRIMARY KEY,
 name varchar(10) not null);
 
insert into master1 (no,name) values(1,'aa1');
insert into master1 (no,name) values(2,'aa2');
insert into master1 (no,name) values(3,'aa3');

create table slave1
(num int PRIMARY KEY,
 ename varchar(10) not null,
 no int ,
 CONSTRAINT FOREIGN KEY(no) REFERENCES master1 (no) ON DELETE CASCADE
 );
 
insert into slave1 (num,ename, no) values(10,'slave1',1);
insert into slave1 (num,ename, no) values(20,'slave2',2);
insert into slave1 (num,ename, no) values(30,'slave3',3);
insert into slave1 (num,ename, no) values(40,'slave4',4);
insert into slave1 (num,ename, no) values(50,'slave5',null);
commit;

DELETE from master1 where no = 1;

select * from slave1;
-- /////////////////////////////////////

CREATE TABLE master2(
no int PRIMARY KEY,
name varchar(10) not NULL
);

insert into master2 (no, name) VALUES(1,'aa1');
insert into master2 (no, name) VALUES(2,'aa2');
insert into master2 (no, name) VALUES(3,'aa3');

create table slave2
(num int PRIMARY KEY,
 ename varchar(10) not null,
no int,
CONSTRAINT foreign key (no) references master2 (no) on delete set null );

insert into slave2 (num,ename, no) values(10,'slave2',1);	
insert into slave2 (num,ename, no) values(20,'slave2',2);
insert into slave2 (num,ename, no) values(30,'slave3',3);
insert into slave2 (num,ename, no) values(40,'slave4',4);
insert into slave2 (num,ename, no) values(50,'slave5',null);

commit;

DELETE FROM master2 WHERE no = 1;
SELECT * from slave2;

-- 테이블 삭제 및 절삭
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS board2, board3;

-- trunate(rollback 불가)
TRUNCATE TABLE my_emp;

-- 컬럼 수정
create table if not exists my_dept
( no int primary key,
  name varchar(10)
);

-- 컬럼 추가
alter table my_dept
add column address varchar(20);

-- 컬럼 변경(크기변경)
alter table my_dept
modify address varchar(50);

-- 컬럼 변경(크기변경)
alter table my_dept
modify address varchar(10);

-- 컬럼 이름 변경
alter table my_dept
RENAME COLUMN address to addr;

-- 컬럼 삭제
alter table my_dept
drop name;

SELECT * FROM emp LIMIT 4;
