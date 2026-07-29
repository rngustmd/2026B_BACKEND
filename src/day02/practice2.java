package day02;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        // 1. 
        byte a = 10; int b = 200;
        long result = a + b;
        System.out.println( result );
        

        // 2.
        double dvalue = 3.141592;
        float fvalue = (float)dvalue;          
        long lvalue = (long)fvalue;            
        int ivalue = (int)lvalue;
        System.out.println( ivalue );

        /*
        double z = 3.141592;    int result2 = ( int )z;  3.141592 -> 3
        System.out.println( result2 );
        */

        // 3. 
        Scanner scan = new Scanner( System.in );
        System.out.print( "키를 입력하세요: "); double 키 = scan.nextDouble();
        System.out.println("당신의 키는 약 "+(int)키 + "cm 이군요.");
        
        // 4. int+int+int/double => double 입력객체는 클래스 내 1개만 존재해도 입력함수 사용가능!
        System.out.print( "첫 번째 정수 입력: "); int 정수1 = scan.nextInt();
        System.out.print( "두 번째 정수 입력: "); int 정수2 = scan.nextInt();
        System.out.print( "세 번째 정수 입력: "); int 정수3 = scan.nextInt();
        double result4 = ( 정수1 + 정수2 + 정수3 )/ 3.0; // 3으로 나누면 소수점 사라진다. 3.0 으로 하여금 자동 double 타입변환
        System.out.println( result4 );

    }

}

/*문제 1: a 와 b 두 변수의 합을 long 타입의 변수에 저장하여 그 결과를 출력하시오.
선언 코드 :
byte a = 10;
int b = 200;
출력 예시:
결과: 210 */

/*문제 2: 실수 3.141592를 double 타입 변수에 저장한 뒤, 이 변수를 int 타입으로 강제 변환하여 정수 부분만 출력하시오.
선언 코드 :
double z = 3.141592;
출력 예시:
원본 double 값: 3.141592
변환된 int 값: 3 */

/*문제 3: Scanner를 이용해 사용자의 키를 double 타입(예: 178.5)으로 입력받은 후, 
이 값을 int 타입으로 강제 변환하여 "당신의 키는 약 OOOcm 이군요." 라고 정수 부분만 출력하시오.
입력 예시:
키를 입력하세요: 178.5
출력 예시:
당신의 키는 약 178cm 이군요. */


/*문제 4: Scanner를 이용해 서로 다른 3개의 정수를 입력받아, 이 값들의 합을 3으로 나눈 평균을 구하시오. 단, 결과는 소수점이 포함되도록 출력되어야 한다.
입력 예시:
첫 번째 정수 입력: 11
두 번째 정수 입력: 21
세 번째 정수 입력: 21
출력 예시:
평균 결과: 17.666666666666668 */