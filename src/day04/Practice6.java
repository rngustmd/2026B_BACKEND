package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        // [1]
        int[] numbers1 = {10, 20, 30, 40, 50};
        System.out.println(numbers1[2]);

        // [2]
        String[] season = new String[ 3 ];
        season[0] = "봄"; season[1] = "여름"; season[2] = "가을";
        System.out.println( Arrays.toString(season));

        // [3] for문 [vs] 향상된for문
        String[] fruits = {"사과", "바나나", "포도", "딸기"};
        for( int index = 0 ; index <= fruits.length -1; index++ ){ System.out.println( fruits[index]); }
        // vs
        for( String str : fruits ){ System.out.println( str ); }

        // [4] 배열변수명.length : 배열 내 요소총길이 , 자동타입변환 : 연산 시 두 항의 자료타입 중 더 큰 타입으로 결과
        int[] scores1 = {85 , 92 , 78 , 65 , 95};
        int 합계4 = 0;
        for( int score : scores1 ){ //: 콜론 기준으로 오른쪽에 배열 , 왼쪽에는 타입 반복변수명 
            합계4 += score;    
        }
        System.out.printf("합계: %d , 평균: %f \n" , 합계4 , 합계4 / (double)scores1.length );

        // [5]
        int[] scores2 = {77, 82, 100, 54, 96};
        for( int score : scores2){
            if( score == 100 ){ System.out.println("100점 만점자를 찾았습니다."); break;}
        }

        // [6]
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};

        int count = 0;
        // for( String Str : bloodTypes ){ if( str.equals( "a") ){count++;} } System.out.println( count );
        for(int i = 0; i < bloodTypes.length; i++){
            if(bloodTypes[i].equals("A")){
                count++;
            }
        }
        System.out.println("A형 : " + count + "명");  
        
        // [7]
        int[] numbers2 = {23, 5, 67, 12, 88, 34};
        int max = numbers2[0];  // 첫번째 값을 max 정하고 , 만약에 max보다 i번쨰 요소값이 더 크면
        for( int number : numbers2 ){ if (max < number ) max = number; }
        System.out.println( max );
            
        // [8]
        String[] products = {"볼펜", "노트", "지우개"}; int[] stock = {10, 5, 20};
        System.out.print("구매할 상품명: "); String 상품명 = scan.next();
        System.out.print("구매할 수량: "); int 수량 = scan.nextInt();
        
        boolean find = false;
        for( int index = 0 ; index <= products.length -1 ; index ++ ){
            if( 상품명.equals(products[index] ) ){ // 입력받은 상품명과 index번째 상품명과 같으면
                find = true; // 동일한 제품명 찾음 기
                if( 수량 <= stock[index] ){        // 입력받은 수량과 index번째 수량보다 이하이면
                    stock[index] -= 수량;          // 수량 차감
                    System.out.println("구매 완료!");
                }else{
                    System.out.println( "재고가 부족합니다.");
                }
            }
        }
        if( find == false ) System.out.println("없는 제품명입니다.");
        // [9]
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"}; int[] movieRatings = {8, 4, 7, 6};
        for( int index = 0 ; index <= movieNames.length -1 ; index++ ){
            // 1. 영화 이름들을 하나씩 출력
            String name = movieNames[index];
            System.out.print( name );
            // 2. 별점 출력
            for( int star = 1 ; star <= 10 ; star ++ ){
                // * 현재 별 보다 index 번째 평점이 더 크면
                if( star <= movieRatings[index] ){
                    System.out.print( "★ ");
                }else{
                    System.out.print("☆ ");
                }
            }
            // [*] 줄바꿈
            System.out.println();
        }
        
        // [10]
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
        int[] usageMinutes = {65, 30, 140, 420};

        // [1] 차량번호 출력 
        for( int index = 0 ; index <= carNumbers.length-1; index++ ){
            System.out.print( carNumbers[index] +": ");
            // [2] 주차분 출력 
            System.out.print( usageMinutes[index]+"분 " );
            // [3] 주차요금 출력 
            int fee = 1000;
            if( usageMinutes[index] >= 30 ){
                // 30분 제외하고 나누기 10 ( 일단위 제거 ) 곱하기 500원 
                fee += ( usageMinutes[index]-30 ) / 10 * 500 ;
                // 만약에 2만원 넘어가면 2만원으로 고정 아니면 그대로
                fee = fee >= 20000 ? 20000 : fee; 
            }
            System.out.println( fee + "원" );
        }


    }
}



