DROP TABLE IF EXISTS `sample_table`;

create table IF NOT EXISTS sample_table (
  id int(10) not null AUTO_INCREMENT,
  sample_name varchar(100) not null,
  code varchar(20) not null,
  create_datetime datetime not null,
  primary key(id)
);

DROP TABLE IF EXISTS `1F005`;

CREATE TABLE IF NOT EXISTS 1F005 (
	uid int(10) NOT NULL AUTO_INCREMENT,
	`성명` varchar(20),
	`나이` varchar(20),
	primary key(uid)
);

CREATE TABLE IF NOT EXISTS article (
	id int(10) NOT NULL AUTO_INCREMENT,
	`이름` varchar(200) NULL,
	primary key(id)
);

CREATE TABLE IF NOT EXISTS sheet (
	id int(10) NOT NULL AUTO_INCREMENT,
	`성명` varchar(200) NULL,
	`평균` varchar(200) NULL,
	`석차` int(10) NULL,
	`home` varchar(10) NULL,
	primary key(id)
);

CREATE TABLE IF NOT EXISTS grade (
	sid int(10) NOT NULL AUTO_INCREMENT,
	parentId int(10) NULL,
	primary key(sid)
);