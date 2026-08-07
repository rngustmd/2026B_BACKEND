package day07;

public class Practice9 {
    public static void main(String[] args) {
        
        Printer p1 = new Printer();
        // [1]
        p1.powerOn();

        // [2]
        Greeter g1 = new Greeter();
        g1.printSum("안녕하세요," , " [이름]님!");

        // [3]
        SimpleCalculator sc = new SimpleCalculator();
        int result = sc.add( 5 , 6);
        System.out.println(result);

        // [4]
        Checker c1 = new Checker();
        boolean result2 = c1.isEven(10);

        if(result2){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

        // [5]
        Lamp l1 = new Lamp();
        l1.turnOn(); System.out.println(l1.isOn);
        l1.turnOff(); System.out.println(l1.isOn);
        
        // [6]
        Product p2 = new Product();
        p2.name = "콜라"; p2.stock = 10;
        boolean result6 = p2.sell( 11);
        System.out.println(result);
        System.out.println(result6);

        // [7]
        Visualizer v1 = new Visualizer();
        String result7 = v1.getStars(5);
        System.out.println(result7);

        // [8]
        ParkingLot car1 = new ParkingLot();
        ParkingLot car2 = new ParkingLot();
        int result8 = car1.calculateFee(65); 
        int result9 = car2.calculateFee(140); 
        System.out.println(result8);
        System.out.println(result9);
    }

}
// [1]
class Printer {
        void powerOn(){
        System.out.println("안녕하세요, 메소드입니다.");
        return; // 리턴값 생략
    }
}
class Greeter {
    void printSum( String x , String y ){
        System.out.println( x + y );
    }
}
class SimpleCalculator {
    int add ( int x , int y ){
        return x + y ;
    }
}
class Checker {
     boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}

// [5]
class Lamp {
    boolean isOn;
    void turnOn(){ isOn = true; }
    void turnOff(){ isOn = false; }
    }


// [6]
class Product {
    String name;
    int stock;

    boolean sell(int qty){
        if( stock >= qty){
            stock -= qty ; return true; 
            }else{ 
                System.out.println("재고부족");
                return false;
            }
        }
    }

// [7]
class Visualizer {
    String getStars( int count ){
        String stars = "";
        for( int index = 0 ; index <= count -1 ; index ++){
                stars += "★ ";
        }
        return stars;
    }
}

// [8] 
class ParkingLot {
        int calculateFee(int min){
        int fee = 0;
        if( min <= 30 ){ fee = 1000;
        } else {
        min -= 30;
        fee = 1000 + 500 * ( min / 10 );
        }
        if (fee > 20000) { fee = 20000; }
        return fee;
        }
    }

/*[문제 8] ParkingLot 클래스를 만드세요.

1. 주차 시간(분)을 매개변수로 받아, 요금 규정에 따라 계산된 최종 주차 요금을 반환하는 calculateFee 메소드를 정의하세요.

2. 요금 규정:

기본 요금: 최초 30분까지 1,000원

추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가

일일 최대 요금: 20,000원

3. main 함수에서 calculateFee 메소드에 65, 140을 각각 인자로 전달하여 반환된 요금을 출력하세요.*/
