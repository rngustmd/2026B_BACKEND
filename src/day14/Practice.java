package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {

        // [1] 
        Box< String > sBox = new Box();
        sBox.content = "안녕하세요";
        System.out.println( "[문자] " + sBox.content );

        Box< Integer > iBox = new Box();
        iBox.content = 100;
        System.out.println("[숫자] " + iBox.content );

        // [2]
        List<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("강호동");
        list.add("서장훈");
        list.add("신동엽");
        list.add("유재석");

        System.out.println( "[contains] " + list.contains("서장훈") );
        System.out.println( "[indexOf] " + list.indexOf("서장훈") );

        list.remove(list.indexOf("서장훈") );
        System.out.println( list );

        // [3]

        int[] draw = {1,3,3,7,9,9,2,10,10,8,4,4,6,6,5};
        Set<Integer> lottoSet = new HashSet<>();
        for( int i = 0 ; i <= draw.length -1 ; i++ ){
            lottoSet.add(draw[i]); 
        }
        System.out.println( "[추첨결과] " + lottoSet );
        System.out.println( "[개수] " + lottoSet.size( ) );
        System.out.println( "[contains 7] " + lottoSet.contains(7));

        // [4]
        Map<String,Integer> map = new HashMap<>();


        
        


        

    } // main end
} // class end
// [1]
class Box<T>{
    public T content;
}

/*-------------------------------------------

[문제 4] Map 점수 관리 CRUD (put/get/remove/size)
상황: 학생 이름(key)과 점수(value)를 Map으로 관리한다.
요구사항(구현):
- Map<String,Integer> map = new HashMap<>();
- put:
  유재석=95, 강호동=100, 신동엽=78, 유재석=67(키 중복 시 값 변경 확인), 서장훈=100
- get("유재석") 출력
- size() 출력
- remove("유재석") 후 map 전체 출력
- containsKey("강호동") 결과 출력
- containsValue(65) 결과 출력
- keySet() 반복문으로 key=value 전체 출력
출력 예시(순서는 달라도 됨):
[get 유재석] 67
[size] 4
[remove 후 map] {서장훈=100, 강호동=100, 신동엽=78}
[containsKey 강호동] true
[containsValue 65] false
[all]
서장훈=100
강호동=100
신동엽=78

-------------------------------------------*/

/*-------------------------------------------

[문제 5] ArrayList<StockDto> → ArrayList<Map<String,Object>> 구조로 구현
상황: 기존에는 StockDto 클래스를 만들어 주식 데이터를 저장했지만, 이번에는 DTO 없이 Map 구조로 데이터를 관리한다.
기존 DTO 개념 (참고):
class StockDto {
    String name;
    int price;
    int volume;
}
변경 목표: ArrayList<Map<String,Object>> 구조로 동일 데이터 표현
요구사항(구현):
1) ArrayList<Map<String,Object>> stockList 생성
2) 아래 3개의 주식 데이터를 Map으로 생성 후 stockList에 add
   (1)
   name = "삼성전자"
   price = 72000
   volume = 1500000
   (2)
   name = "카카오"
   price = 52000
   volume = 800000
   (3)
   name = "네이버"
   price = 210000
   volume = 300000
3) 전체 리스트 출력
4) 반복문을 사용하여 아래 형식으로 출력:
   종목명: 삼성전자 / 가격: 72000 / 거래량: 1500000
   종목명: 카카오 / 가격: 52000 / 거래량: 800000
   종목명: 네이버 / 가격: 210000 / 거래량: 300000
출력 예시:
[stockList] [{...},{...},{...}]
종목명: 삼성전자 / 가격: 72000 / 거래량: 1500000
종목명: 카카오 / 가격: 52000 / 거래량: 800000
종목명: 네이버 / 가격: 210000 / 거래량: 300000

-------------------------------------------*/