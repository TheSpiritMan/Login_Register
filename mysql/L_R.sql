drop database if exists L_R;
create database L_R;
use L_R;

create table StudentDetails(
name char(50) not null,
address varchar(50) not null,
program varchar(50) not null,
contactno bigint unsigned not null,
rollno int unsigned not null,
password varchar(100) not null
);

use L_R;

create table TeacherDetails( 
name char(50) not null,
address varchar(50) not null,
program varchar(50) not null,
contactno bigint unsigned not null,
idno int unsigned not null,
password varchar(100) not null 
);
