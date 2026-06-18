CREATE table IF NOT EXISTS todo
( id int auto_increment,
userid varchar(255) not null,
description varchar(255) not null,
target_date date not null,
done boolean,
primary key(id));

CREATE TABLE IF NOT EXISTS member
( userid VARCHAR(255),
password VARCHAR(255) not null,
username varchar(255) not null,
role VARCHAR(255) DEFAULT 'USER' not null,
PRIMARY KEY(userid)
);

