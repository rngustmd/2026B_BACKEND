
-- 현재 자바프로젝트 폴더 내 -> src -> 'database' 폴더 생성
-- 'database' 폴더 내 day01.sql 파일 생성

# 한줄주석
-- 한줄주석
/* 여러주석 */

-- 데이터베이스란? 여러 데이터들을 집합/공간
-- 데이터베이스서버란? 여러 데이터베이스들을 저장한 PC/프로그램( MYSQL , 3306 )

-- [1]
-- 1. SQL 문법 작성한다. 2. ;세미콜론 마침 3. 실행할SQL문법에 커서 두고 CTRL+엔터 또는 RUN
SHOW DATABASES; -- 연결된 DB서버내 모든 데이터베이스 목록 확인

-- [2] 데이터베이스 로컬 경로
SHOW VARIABLES LIKE 'databir';

-- [3] 데이터베이스 생성 , 주의할점 : SQL문법은 대소문자 구분하지 않는다.
CREATE DATABASE mydb0804; -- 연결된 DB서버내 특정한 데이터베이스 생성

-- [4] 데이터베이스 삭제 , 주의할점 : 없는 데이트베이스명 삭제 불가능
DROP DATABASE mydb0804;
DROP DATABASE IF EXISTS mydb0804;

-- [5] 데이터베이스 활성화 : 연결된 DB서버내 여러개 DB 중 조작할 DB 선택
USE mydb0804;

-- [활용] : 프로젝트 데이터베이스 생성
DROP DATABASE IF EXISTS test0804;
CREATE DATABASE test0804;
USE test0804;