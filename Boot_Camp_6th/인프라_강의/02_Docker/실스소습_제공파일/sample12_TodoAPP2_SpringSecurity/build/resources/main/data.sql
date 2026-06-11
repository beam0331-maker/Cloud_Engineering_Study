insert ignore into todo( id, userid, description, target_date, done)
values( 1000, 'hong4832', 'Learn Java', DATE_ADD(NOW(), Interval 1 YEAR), false);

insert ignore into todo( id, userid, description, target_date, done)
values( 1001, 'KIM4832', 'Learn SQL', DATE_ADD(NOW(), Interval 1 MONTH), false);
insert ignore into todo( id, userid, description, target_date, done)
values( 1002, 'KIM4832', 'Learn SpringBoot', DATE_ADD(NOW(), Interval 10 DAY), false);

insert ignore into member (userid, password, username, role)
values( 'hong4832', '1234','홍길동','ADMIN');
insert ignore into member (userid, password, username, role)
values( 'KIM4832', '1234','김유신','USER');