package day05;

import javax.xml.crypto.Data;

class Book {
  String title;
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}

public class Test {
  public static void main(String[] args) {
    Book b1 = new Book("Java Basics"); // 생성1
    Book b2 = new Book("OOP Concepts"); // 생성2

    Book[] library = new Book[3]; // 배열로 생성3 [ , , ]

    library[0] = b1; // [ b1, , ]
    library[1] = new Book("Data Structure"); // 생성4 [ b1, Data Structure , ]

    Book b3 = library[1]; // [ b1, Data Structure , ] b3 = Data Struture

    b2 = library[0]; // [ b1, Data Structure , ] b2 = b1
 
    Book[] archive = library; // archuve 배열 새로 생성 archive = [ b1, Data Structure , ] 
    archive[2] = new Book("Algorithm"); // 생성5 archive = [ b1, Data Structure , Algortithm ]

    library[0] = null; 
    b1 = null;

    // ===== 프로그램 실행 종료 직전 (Final State) =====
    // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
  }
}


