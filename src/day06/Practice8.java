package day06;

public class Practice8 {
    public static void main(String[] args) {
        
        // [1]
        Book b1 = new Book( "이것이 자바다" , "신용권", 30000);
        Book b2 = new Book( "자바의 정석" , "남궁성", 28000);
        System.out.println(b1.title + " , " + b1.author + " , " + b1.price);
        System.out.println(b2.title + " , " + b2.author + " , " + b2.price);
        
        // [2]
        Rectangle r1 = new Rectangle(10 , 5);
        System.out.println(  "사각형의 넓이: " + r1.width * r1.height);

        // [3]
        BankAccount ba = new BankAccount( "111-222-3333" , "유재석" , 10000 );
        System.out.println("잔액: " + ba.balance);
        ba.deposit(5000);
        System.out.println("입금 후 잔액: " + ba.balance );
        ba.withdraw(3000);
        System.out.println("출금 후 잔액: " + ba.balance);

        // [4]
        /*[문제 4] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        1. Goods 클래스에 생성자를 두 개 만드세요(오버로딩).
        2. 기본 생성자: name은 "미정", price는 0으로 초기화
        3. 매개변수가 있는 생성자: name과 price를 매개변수로 받아 초기화
        4. main 함수에서 기본 생성자로 객체 하나, 매개변수가 있는 생성자로 ("콜라", 2000) 정보를 가진 객체 하나를 각각 생성
        하고, 두 객체의 정보를 모두 출력하세요.*/
        Goods g1 = new Goods();
        Goods g2 = new Goods( "콜라" , 2000 );
        System.out.println( g1.name4 + " , " + g1.price4 );
        System.out.println( g2.name4 + " , " + g2.price4 );

        // [5]
        /*[문제 5] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
        1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
        2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.*/

        Member m = new Member();
        System.out.println( m.id + " , " + m.isLogin );


        



    } // main end

} // class end
// [1]
class Book{
    String title;
    String author;
    int price;

    Book(){}

    Book( String title , String author , int price ){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
// [2]
class Rectangle{
    int width;
    int height;

    Rectangle(){}

    Rectangle( int width , int height ){
        this.width = width;
        this.height = height;
    }
}
// [3]
class BankAccount{ // class란? 객체(인스턴스) 만들기 위한 설계도( 실체가 아니다. )
    // * 클래스(설계도)가 동일하더라도 객체(인스턴스)는 new 마다 서로 다른 실체!
    String accountNumber; // 멤버 변수(필드) : 객체가 생성되면 객체 내 사용할 변수 뜻
    String ownerName;
    int balance;
    // 생성자란? 객체(인스턴스) 생성할 때 초기값 대입
    // 매개변수? 외부로부터 생성자/메소드에게 전달되는 값(인수) 저장하는 변수
    // 관례적으로 생성자의 매개변수는 멤버변수명과 동일하며 this 구분
    BankAccount(){}

    BankAccount( String accountNumber , String ownerName , int balance ){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    // 입금 메소드
    void deposit(int money) {
        balance += money;
    }
    // 출금 메소드
    void withdraw(int money) {
        balance -= money;
    }
}
// [4]
class Goods{
    String name4;
    int price4;

    Goods(){
        this.name4 = "미정";
        this.price4 = 0;
    }

    Goods( String name4 , int price4 ){
        this.name4 = name4;
        this.price4 = price4;
    }
}
// [5]
class Member{
    String id;
    boolean isLogin;

    Member(){
        this.id = "guest";
        this.isLogin = false;
    }

    Member( String id , boolean isLogin ){
        this.id = id;
        this.isLogin = isLogin;
    }
}
/*[문제 5] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.

1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.*/