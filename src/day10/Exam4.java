package day10;

public class Exam4 {
    public static void main(String[] args) {
        // 1. 상위객체
        Car myCar = new Car();
        // 2. 다형성
        myCar.tire = new Tire(); 
        myCar.run(); // 부모
        myCar.tire = new HankookTire(); 
        myCar.run(); // 자식1
        myCar.tire = new KumhoTire();
        myCar.run(); // 자식2
        // 타입확인
        System.out.println( myCar.tire instanceof Tire ); // true
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false
      
    } // main
} // class end
class Car{ // 자동차
 Tire tire;
 void run() { this.tire.roll(); }
}
class Tire{ // 타이어
 void roll(){
 System.out.println("[일반] 타이어가 회전");
 }
}
// 오버라이딩
class HankookTire extends Tire{
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
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