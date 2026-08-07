/*[실습] 제출용 */

-- 아래 문제는 'practice2' 데이터베이스 생성 후 진행 합니다.
DROP DATABASE IF EXISTS practice2;
CREATE DATABASE practice2;
USE practice2;

-- [문제 1]아래 조건에 맞는 members 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: members
-- 컬럼 정보
-- member_id (회원번호): 정수, Primary Key, 자동 증가
-- member_name (회원이름): 문자열(50), NULL 허용 안함
-- email (이메일): 문자열(100), Unique, NULL 허용 안함
-- join_date (가입일): 날짜/시간, Default 현재 날짜/시간
-- is_active (활성여부): 논리형(bool), Default true
CREATE TABLE members (
    member_id INT AUTO_INCREMENT        , member_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE  , join_date DATETIME DEFAULT NOW( ),
    is_active BOOLEAN DEFAULT TRUE,
    constraint PRIMARY KEY (member_id)
)

-- [문제 2]

-- 아래 조건에 맞는 products 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: products
-- 컬럼 정보
-- product_id (상품번호): 정수, Primary Key, 자동 증가
-- product_name (상품명): 문자열(100), NULL 허용 안함
-- price (가격): 정수, unsigned, NULL 허용 안함
-- stock (재고수량): 정수, Default 0, NULL 허용 안함
-- created_at (등록일): 날짜/시간, Default 현재 날짜/시간
CREATE TABLE products (
    product_id INT AUTO_INCREMENT , product_name VARCHAR(100) NOT NULL,
    price INT UNSIGNED NOT NULL   , stock INT DEFAULT(0) NOT NULL,
    created_at DATETIME DEFAULT NOW(),
    constraint PRIMARY KEY(product_id)
)

-- [문제 3]

-- 아래 조건에 맞는 orders 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: orders
-- 컬럼 정보
-- order_id (주문번호): bigint, Primary Key, 자동 증가
-- member_id (회원번호): 정수, Foreign Key → members(member_id)
-- order_date (주문일): 날짜/시간, Default 현재 날짜/시간
-- total_price (총금액): int unsigned, NULL 허용 안함
CREATE TABLE orders (
    order_id BIGINT AUTO_INCREMENT , member_id INT ,
    order_date DATETIME DEFAULT now( )         , total_price INT UNSIGNED NOT NULL ,
    constraint PRIMARY key( order_id),
    constraint FOREIGN KEY( member_id ) REFERENCES members( member_id )
)

-- [문제 4]
-- 아래 조건에 맞는 order_items 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: order_items
-- 컬럼 정보
-- item_id (항목번호): 정수, Primary Key, 자동 증가
-- order_id (주문번호): bigint, Foreign Key → orders(order_id)
-- product_id (상품번호): 정수, Foreign Key → products(product_id)
-- quantity (수량): 정수, Default 1
-- price (단가): int unsigned, NULL 허용 안함
CREATE TABLE order_items (
    item_id int AUTO_INCREMENT , order_id BIGINT, 
    product_id int , quantity int DEFAULT(1),
    price INT UNSIGNED NOT NULL,
    constraint PRIMARY KEY( item_id ) ,
    constraint FOREIGN KEY( order_id ) REFERENCES orders (order_id) ,
    constraint FOREIGN KEY( product_id ) REFERENCES products(product_id)
)


-- [문제 5]

-- 아래 조건에 맞는 students 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: students
-- 컬럼 정보
-- student_id (학번): 문자열(10), Primary Key
-- student_name (이름): 문자열(30), NULL 허용 안함
-- major (전공): 문자열(50)
-- grade (학년): tinyint unsigned
-- enrolled_date (입학일): date
CREATE TABLE students (
    student_id VARCHAR(10) , student_name VARCHAR(30) NOT NULL ,
    major VARCHAR (50) , grade TINYINT UNSIGNED , 
    enrolled_date DATE,
    constraint PRIMARY KEY ( student_id )
)


-- [문제 6]

-- 아래 조건에 맞는 employees 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: employees
-- 컬럼 정보
-- emp_id (사번): int, Primary Key, 자동 증가
-- emp_name (이름): varchar(40), NULL 허용 안함
-- salary (급여): int unsigned, NULL 허용 안함
-- hire_date (입사일): date, NULL 허용 안함
-- department (부서): varchar(50)
CREATE TABLE employees (
    emp_id int AUTO_INCREMENT , emp_name VARCHAR(40) NOT NULL , 
    salary INT UNSIGNED NOT NULL , hire_date DATE NOT NULL , 
    department VARCHAR(50) ,
    constraint PRIMARY KEY ( emp_id )
)


-- [문제 7]

-- 아래 조건에 맞는 boards 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: boards
-- 컬럼 정보
-- board_id (게시물번호): int, Primary Key, 자동 증가
-- title (제목): varchar(200), NULL 허용 안함
-- content (내용): text, NULL 허용 안함
-- writer_id (작성자회원번호): int, Foreign Key → members(member_id)
-- created_at (작성일): datetime, Default 현재 날짜/시간
CREATE TABLE boards (
    board_id int AUTO_INCREMENT , title VARCHAR(200) NOT NULL , 
    content TEXT NOT NULL , writer_id INT ,
    created_at DATETIME DEFAULT now() ,
    constraint PRIMARY KEY(board_id) ,
    constraint FOREIGN KEY(writer_id) REFERENCES members( member_id )
)


-- [문제 8]

-- 아래 조건에 맞는 comments 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: comments
-- 컬럼 정보
-- comment_id (댓글번호): int, Primary Key, 자동 증가
-- board_id (게시물번호): int, Foreign Key → boards(board_id)
-- writer_id (작성자회원번호): int, Foreign Key → members(member_id)
-- content (댓글내용): varchar(300), NULL 허용 안함
-- created_at (작성일): datetime, Default 현재 날짜/시간
CREATE TABLE comments (
    comment_id int AUTO_INCREMENT , board_id INT,
    writer_id INT , content VARCHAR(300) NOT NULL,
    created_at DATETIME DEFAULT now(),
    constraint PRIMARY KEY(comment_id) ,
    constraint FOREIGN KEY(board_id) REFERENCES boards(board_id) ,
    constraint FOREIGN KEY(writer_id) REFERENCES members(member_id)
)


-- [문제 9]

-- 아래 조건에 맞는 payments 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: payments
-- 컬럼 정보
-- payment_id (결제번호): bigint, Primary Key, 자동 증가
-- order_id (주문번호): bigint, Foreign Key → orders(order_id)
-- payment_amount (결제금액): int unsigned, NULL 허용 안함
-- payment_method (결제수단): varchar(30)
-- payment_date (결제일): datetime, Default 현재 날짜/시간
CREATE TABLE payments (
    payment_id BIGINT AUTO_INCREMENT , order_id BIGINT ,
    payment_amount INT UNSIGNED NOT NULL , payment_method VARCHAR(30) ,
    payment_date DATETIME DEFAULT now() ,
    constraint PRIMARY KEY(payment_id) ,
    constraint FOREIGN key(order_id) REFERENCES orders(order_id)
)



-- [문제 10]

-- 아래 조건에 맞는 reviews 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: reviews
-- 컬럼 정보
-- review_id (리뷰번호): int, Primary Key, 자동 증가
-- product_id (상품번호): int, Foreign Key → products(product_id)
-- member_id (회원번호): int, Foreign Key → members(member_id)
-- rating (평점): tinyint unsigned, NULL 허용 안함
-- review_text (리뷰내용): text
-- created_at (작성일): datetime, Default 현재 날짜/시간
CREATE TABLE reviews (
    review_id int AUTO_INCREMENT , product_id INT ,
    member_id int , rating TINYINT UNSIGNED NOT NULL ,
    review_text TEXT , created_at DATETIME DEFAULT now() ,
    constraint PRIMARY KEY (review_id) ,
    constraint FOREIGN KEY(product_id) REFERENCES products(product_id) ,
    constraint FOREIGN KEY( member_id) REFERENCES members(member_id)
)