package day10;

public class Exam4 {
    public static void main(String[] args) {
        // 1. 상위객체
        Car myCar = new Car();
        System.out.println( myCar );    // day10.Car@372f7a8d
        Car yourCar = new Car();        // 동일한 클래스로 서로 다른 인스턴스 생성
        System.out.println( yourCar );  // day10.Car@2f92e0f4

        // 2. 다형성
        myCar.tire = new Tire();        // myCar에 tire 대입
        myCar.run(); // 부모            // myCar에 [일반] 타이어가 회전
            // yourCar.run();           // 오류 , tire 없는 상태 , "this.tire" is null
        yourCar.tire = new Tire();
            yourCar.run();              // yourCar에 [일반] 타이어가 회전

        myCar.tire = new HankookTire(); // myCar에 새로운 tire 대입했다.
        myCar.run();                    // [한국] 타이어가 회전(업그레이드)
            yourCar.run();              // [일반] 타이어가 회전

        myCar.tire = new KumhoTire();   // *** 변수란? 하나의 자료(값/인스턴스) 저장/참조 한다. ***
        myCar.run();                    // [금호] 타이어가 회전 (업그레이드)

        System.out.println( myCar.tire instanceof Tire );        // 금호TIRE --> 일반TIRE  true
        System.out.println( myCar.tire instanceof KumhoTire );   // 금호TIRE --> 일반TIRE  true
        System.out.println( myCar.tire instanceof HankookTire ); // 금호TIRE --> 일반TIRE  false
      
        // 즉] 인스턴스 1개당 멤버변수( tire ) 각각 생성한다. ( 상태 ) '아이디' 상태는 회원마다 제공할 필요가 있다.
        // 즉] 인스턴스 여러개는 하나의 메소드( run() ) 공유한다. ( 행위 ) '로그인' 기능은 회원마다 제공할 필요가 없다.
        // 상속의 다형성이란? 타입변환은 호환성

    } // main
} // class end
class Car{ // 클래스는 인스턴스 만들기 위한 설계도
    Tire tire; // 멤버변수 , 초기(처음) 값이 없다.
    // Tire frontRighttire;  
    // Tire frontLefttire; 
    // Tire backRighttire;  
    // Tire backLefttire;  
    void run() { this.tire.roll(); } // 메소드, this(해당 메소드 호출한 인스턴스뜻)
}
class Tire{ 
    void roll(){ // 메소드 
        System.out.println("[일반] 타이어가 회전");
    }
}
class HankookTire extends Tire{ // extends 상속/확장 , Tire 로 부터 상속받는다.
    void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
    @Override // 오버라이딩: extends 클래스로 부터 물려받은 메소드 재정의!
    void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}
/*
            < 가계도 >
                |
                차
                |
              타이어
                |
        ________|________
        |               |
        |               |
    한국타이어      금호타이어

- 오버로딩   : 같은 클래스에서 같은 이름의 메소드를 여러 개 만드는 것. 단, 매개변수가 달라야 한다.
- 오버라이딩 : 부모 클래스의 메소드를 자식 클래스가 물려받은 후, 같은 형태로 다시 만드는 것.
*/