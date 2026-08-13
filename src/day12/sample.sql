-- day12 Exam2 연동
CREATE DATABASE mydb0813;
USE mydb0813;
CREATE TABLE board(
    NO INT AUTO_INCREMENT ,
    content VARCHAR(255) ,
    writer VARCHAR(30) ,
    constraint PRIMARY KEY( no )
);
INSERT INTO board( content , writer )VALUES( "안녕하세요" , "유재석" ) , ( "하하" , "강호동" );




CREATE TABLE test(no int AUTO_INCREMENT PRIMARY KEY, name VARCHAR(30) );

