package day13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1.위치찾기 2.입차 3.출차 선택:");
            int ch = scan.nextInt();
            if( ch == 1 ){ } // 위치찾기 구현 
            if( ch == 2 ){ } // 입차 구현 
            if( ch == 3 ){ } // 출차 구현

            // 위치 찾기
            if( ch == 1 ){
                System.out.print("차량번호 입력: "); String carNumber = scan.next();
                String [ ] carList = carParkingList.split("\n"); // 한 대씩 배열에 저장
                boolean find = false; 
                for( String car : carList ){
                    String [] box = car.split(","); // [ 0: 주차위치 1: 차량번호 2: 입차일시 ]
                    String location = box[0]; // 위치
                    String Num = box[1]; // 차량번호
                    if(Num.equals(carNumber)){ // 입력차량과 차량번호 비교
                        System.out.println("차량위치: " + location );
                        find = true; 
                        break;
                    }
                } // for end
                if( find == false ){
                    System.out.println("미등록 차량");
                } 
            
            } // ch == 1 end
            if( ch == 2 ){
                System.out.print("주차위치: "); String location = scan.next();
                System.out.println("차량번호: "); String carNumber = scan.next();
                System.out.println("입차일시: "); String dateTime = scan.next();

                String [ ] carList = carParkingList.split("\n");

                boolean find = false; // 중복X
                for( String car : carList ){
                    String [] box = car.split(",");
                    String parkinglocation = box[0];
                    String Number = box[1];
                    String parkingDate = box[2];
                    if(parkinglocation.equals(location)){
                        find = true;
                        break;
                    }
                } // for end
                if( find == true ){
                    System.out.println( location + "에는 중복 주차할 수 없습니다.");
                }else{ String newCar = location + "," + carNumber + "," + dateTime;
                        carParkingList = carParkingList + "\n" + newCar; }
            } // ch == 2 end
            if( ch == 3 ){

            // 출차할 차량번호 입력
            System.out.print("출차 차량번호: ");
            String carNumber = scan.next();

            // 주차된 차량들을 한 대씩 분리
            String[] carList = carParkingList.split("\n");
            boolean find = false;
            for( String car : carList ){
                // 위치, 차량번호, 입차일시로 분리
                String[] info = car.split(",");

                // 출차할 차량번호와 현재 차량번호 비교
                if( info[1].equals(carNumber) ){
                    find = true;
                    // 입차시간 분리
                    // 202608190930 -> 2026 / 08 / 19 / 09 / 30

                    int year = Integer.parseInt(info[2].substring(0, 4));
                    int month = Integer.parseInt(info[2].substring(4, 6));
                    int day = Integer.parseInt(info[2].substring(6, 8));
                    int hour = Integer.parseInt(info[2].substring(8, 10));
                    int minute = Integer.parseInt(info[2].substring(10, 12));

                    // 현재 시간
                    LocalDateTime now = LocalDateTime.now();
                    // 현재 시간에서 년/월/일/시/분 가져오기
                    int nowYear = now.getYear();
                    int nowMonth = now.getMonthValue();
                    int nowDay = now.getDayOfMonth();
                    int nowHour = now.getHour();
                    int nowMinute = now.getMinute();

                    // 주차시간 계산 , 입차 날짜를 일수로 변환
                    // 입차 시간 객체 생성
                    LocalDateTime inTime = LocalDateTime.of(year, month, day, hour, minute);
                    int inTotalDays = (inTime.getYear() * 365) + inTime.getDayOfYear();

                    int nowTotalDays = (nowYear * 365) + now.getDayOfYear();                 
                    int diffDays = nowTotalDays - inTotalDays;
                    int inMinutes = (hour * 60) + minute;           
                    int nowMinutes = (nowHour * 60) + nowMinute;

                    // 전체 주차시간
                    int totalMinutes = (diffDays * 24 * 60) + (nowMinutes - inMinutes);
                    if( totalMinutes < 0 ){ totalMinutes = 0; }

                    // 요금 계산 , 하루 단위
                    int days = totalMinutes / (24 * 60);
                    // 하루를 제외한 나머지 시간
                    int remainMinutes = totalMinutes % (24 * 60);
                    int fee = 0;
                    // 30분 초과
                    if( remainMinutes > 30 ){
                        int overMinutes = remainMinutes - 30;
                        // 10분 단위 올림
                        int count = (overMinutes + 9) / 10;
                        fee = count * 1000;
                    }
                    // 하루 최대 20,000원
                    if( fee > 20000 ){ fee = 20000; }

                    // 전체 요금
                    int totalFee = (days * 20000) + fee;

                    // 출력
                    System.out.println("====== 출차 안내 ======");
                    System.out.println("차량번호: " + carNumber);
                    System.out.println("입차시간: "
                            + year + "년 "
                            + month + "월 "
                            + day + "일 "
                            + hour + "시 "
                            + minute + "분");

                    System.out.println("출차시간: " + now);
                    System.out.println(
                            "주차시간: "
                            + totalMinutes
                            + "분"
                    );

                    System.out.println(
                            "주차요금: "
                            + totalFee
                            + "원"
                    );

                    System.out.println("======================");

                    // 차량 삭제
                    String deleteCar =
                            info[0] + ","
                            + info[1] + ","
                            + info[2];


                    if( carParkingList.equals(deleteCar) ){
                        carParkingList = "";
                    }else{
                        carParkingList =
                                carParkingList.replace(
                                        deleteCar + "\n",
                                        ""
                                );
                    }
                    break;
                }
            }
            // 차량을 찾지 못한 경우
            if( find == false ){

                System.out.println("미등록 차량");
            } 
        }
     }
    }
}


            


            

            
        

    

/*
[ 문자열 실습 ] 타워 주차 관리 시스템 데이터 처리
1. 문제 개요
주차장 관제 시스템에서 관리 중인 차량 데이터(carParkingList)는 단일 String으로 관리되고 있습니다. 
이 데이터를 기반으로 입차, 출차, 내 차량 위치 찾기 기능을 구현하세요.
단) 새로운 클래스 만들지 않습니다.

2. 데이터 규격
데이터 구분자:
행(객체/차량) 구분: 줄바꿈 문자 (\n)
열(속성) 구분: 쉼표 (,)
컬럼 순서: 위치번호,차량번호,날짜시간(YYYYMMDDhhmm)

초기 데이터 예시:
String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";

3. 구현 요구사항
다음 세 기능 구현하세요. 
① 차량 위치 찾기 (findCarLocation)
기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
입력: carNumber (찾을 차량번호)
출력/반환:
차량이 존재할 경우: 주차 위치 번호 (예: "3")
차량이 없을 경우: "미등록 차량" 또는 -1 반환

② 입차 처리
기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
조건:
이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
출력/반환:
차량이 입차한 경우 : 주차 위치 번호 (예: "3")
차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)

③ 출차 처리
기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
입력: carNumber (출차할 차량번호)
반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
예: 31분 ~ 40분 주차 -> 1,000원   
예: 41분 ~ 50분 주차 -> 2,000원
일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.

*/