use workshop;

CREATE TABLE subject(
subno int PRIMARY KEY UNIQUE NOT NULL,
subname varchar(20) NOT NULL,
term varchar(1) CHECK (term IN(1,2)),
type varchar(4) CHECK (type IN('필수','선택'))
);

create table student
( studno int PRIMARY KEY,
stuname varchar(10) );

CREATE TABLE sugang(
studno int UNIQUE NOT NULL,
subno int UNIQUE NOT NULL,
regdate date,
resut int,
PRIMARY KEY(studno, subno),
FOREIGN KEY(studno) REFERENCES student (studno),
FOREIGN KEY(subno) REFERENCES subject (subno)
);

