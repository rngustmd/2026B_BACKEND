package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // [1] 
        /*
        new Book();
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "이것이 자바다"; System.out.println( b1.title);
        b1.author = "신용권"; System.out.println(b1.author);
        b1.price = 30000; System.out.println(b1.price);

        b2.title = "자바의 정석"; System.out.println( b2.title);
        b2.author = "남궁성"; System.out.println(b2.author);
        b2.price = 28000; System.out.println(b2.price);
        */
        Book b1 = new Book();
        b1.title = "이것이 자바다"; b1.author = "신용권"; b1.price = 30000; 
        Book b2 = new Book();
        b2.title = "자바의 정석"; b2.author = "남궁성"; b2.price = 28000; 
        System.out.printf("%s, %s, %d \n" , b1.title , b1.author, b1.price );
        System.out.printf("%s, %s, %d \n" , b2.title , b2.author, b2.price );
        // [2]
        new Pet();
        Pet p1 = new Pet();
        p1.name = "초코"; p1.species = "푸들"; p1.age = 3;
        Pet p2 = new Pet();
        p2.name = "나비"; p2.species = "코리안숏헤어"; p2.age = 5; 
        System.out.printf("%s, %s, %d \n" , p1.name , p1.species, p1.age );
        System.out.printf("%s, %s, %d \n" , p2.name , p2.species, p2.age );

        // [3]
        new Rectangle();
        Rectangle r = new Rectangle();
        r.width = 10; r.height = 5;
        System.out.println(  "사각형의 넓이: " + r.width * r.height);

        // [4]
        /*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
        1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
        2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
        3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/
        new BankAccount();
        BankAccount ba1 = new BankAccount();
        ba1.accountNumber = "111-222-3333"; ba1.ownerName = "유재석"; ba1.balance = 10000;
        System.out.printf("%s, %s, %d \n" , ba1.accountNumber , ba1.ownerName , ba1.balance );
        ba1.balance += 5000;
        System.out.println("입금 후 잔액: " + ba1.balance );
        System.out.println("출금 후 잔액: " + ba1.balance);

        // [5]
        /*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
        2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/
        new Product();
        Product pr1 = new Product();
        pr1.name2 = "새우깡"; pr1.price2 = 1500;
        Product pr2 = new Product();
        pr2.name2 = "콜라"; pr2.price2 = 2000;
        if( pr1.price2 > pr2.price2 ){ System.out.println(pr1.name2);}
        else{ System.out.println(pr2.name2);}

        // [6]
        /*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
        1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
        2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
        3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
        4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/
        new Member();
        Member m1 = new Member();
        m1.Id = "admin"; m1.isLogin = false;
        System.out.println( "로그인 전 상태: " + m1.isLogin );
        m1.isLogin = true;
        System.out.println("로그인 후 상태: " + m1.isLogin);

        // [7]
        /*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
        2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/
        new Television();
        Television t = new Television();
        t.channel1 = 7; t.volume = 20;
        System.out.printf( "%d , %d \n" , t.channel1 , t.volume );
        t.channel1 += 4; t.volume -= 2;
        System.out.printf( "%d , %d \n" , t.channel1 , t.volume );

        // [8]
        /*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Player 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
        3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/
        new Player();
        Player pl = new Player();
        pl.name3 = "손흥민"; pl.power = 90; pl.speed = 95;
        Player pl2 = new Player();
        pl2.name3 = "이강인"; pl2.power = 85; pl2.speed = 92;
        if( pl.power + pl.speed > pl2.power + pl2.speed ){
            System.out.println(pl.name3);
        }else{ System.out.println(pl2.name3);}

        // [9]
        /*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
        1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
        2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/
        new MenuItem();
        MenuItem menu1 = new MenuItem();
        menu1.name4 = "김치찌개"; menu1.price3 = 8000; menu1.isSignature = true;
        MenuItem menu2 = new MenuItem();
        menu2.name4 = "된장찌개"; menu2.price3 = 8000; menu2.isSignature = false;
        MenuItem menu3 = new MenuItem();
        menu3.name4 = "계란찜"; menu3.price3 = 3000; menu3.isSignature = false;
        if( menu1.isSignature ){ System.out.println( "[대표메뉴] " + menu1.name4 + ": " + menu1.price3 + "원"); }
        else if( menu2.isSignature ){ System.out.println( "[대표메뉴] " + menu2.name4 + ": " + menu2.price3 + "원"); }
        else if( menu3.isSignature ){ System.out.println( "[대표메뉴] " + menu3.name4 + ": " + menu3.price3 + "원"); }

        // [10]
        Scanner scan = new Scanner( System.in );
        /*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
        1. main 함수에서 UserProfile 객체를 하나 생성하세요.
        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
        3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
        3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/
        new UserProfile();
        UserProfile u1 = new UserProfile();
        System.out.print("이름: "); String na = scan.next();
        System.out.print("나이: "); int ag = scan.nextInt();
        System.out.print("MBTI: "); String mb = scan.next();
        u1.name5 = na; u1.age2 = ag; u1.mbti = mb;
        System.out.println("--- 프로필 ---");
        System.out.println("이름: " + u1.name5 );
        System.out.println("나이: " + u1.age2 );
        System.out.println( "MBTI: " + u1.mbti );

    } // main end

} // class end

// [1]
class Book{
    String title;
    String author;
    int price;
} // class end

class Pet{
    String name;
    String species;
    int age;
}
class Rectangle{
    int width;
    int height;
}
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}
class Product{
    String name2;
    int price2;
}
class Member{
    String Id;
    boolean isLogin;
}
class Television{
    int channel1;
    int volume;
}
class Player{
    String name3;
    int power;
    int speed;
}
class MenuItem{
    String name4;
    int price3;
    boolean isSignature;

}
class UserProfile{
    String name5;
    int age2;
    String mbti;
}
