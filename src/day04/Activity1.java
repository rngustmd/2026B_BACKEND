package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int[] arry = new int[0];
        /* 
        while (true) {
            System.out.println( "-----------------------------------------------");

            System.out.print("현재 배열 [크기: " + arry.length + "]: ");
            if (arry.length == 0) {
                System.out.println("비어 있음");
            } else {
                System.out.print("[ ");
                for (int i = 0; i <= arry.length -1; i++){
                    System.out.print(arry[i]);
                    if (i != arry.length - 1){
                        System.out.print(", ");
                    }
                }
                System.out.println(" ]");
            }
            System.out.println("1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scan.nextInt();
            System.out.print( "추가할 정수 값을 입력하세요: ");
            int 정수 = scan.nextInt();
            System.out.println(정수 + "값이 성공적으로 추가되었습니다.");
            arry[0] = 10 ; System.out.println( arry[0] );
        }
        */
       // [2] 배열 내 꼬리( 마지막 인덱스 )에 요소 추가,
       arry[ arry.length -1 ] = 30;

       // [3] 현재 배열 내 +1 증가한 새로운 배열 만들기 , 추가 +1 , 삭제 -1
       int[] newArray = new int[ arry.length+1];

       // [*] 기존배열내 요소들의 값들을 새로운 배열에 복사 -> 이동 , 삭제: 삭제할 인덱스를 제외하고 대입
       for( int index = 0 ; index <= arry.length -1 ; index ++ ){
        newArray[index] = arry[index]; // 오른쪽 기존배열 index 값을 왼쪽 새로운 배열 index 에 대입 
       }

       // [4] [2] 반복 
       newArray[newArray.length-1] = 30;

       // [5] 기존배열변수에 새로운 배열 대입
       arry = newArray;

       // [*]
       System.out.println( Arrays.toString( arry ));















    }
    }




