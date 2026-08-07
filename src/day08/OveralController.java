package day08;

import java.util.Scanner;

/*
    OveralController : 입력 Scanner/출력 Print 담당 하는 클래스 용도 (MVC패턴-VIEW) / HTML, JS
    OveralRepository : 자료들의 저장소 및 관리 (MVC패턴-MODEL) / 데이터베이스
    post : 자료들의 모델/타입/형식
*/
public class OveralController { 
    public static void main(String[] args) {


    }

}
class OveralRepository{

    Post[] posts = new Post[100]; // DB 대신에 배열 이용한 여러개 자료 저장 용도

    boolean save( Post post ){ // 1. 저장
        for( int index = 0 ; index <= posts.length -1; index++){
            if(posts[index] == null ){ // 특정한 index번째의 값이 null(비어) 이면
               posts[index] = post; // 입력받은 값 저장한다.
                return true; // 저장 성공했으면 '성공' 의미 갖는 true 반환한다.
            }
        }
        return false;
    }
    // 2. 전체출력
    Post[] findAll(){
        return posts;
    }

}
class Post{
    // 멤버변수
    String content;
    String write;
    // 생성자 - 클래스 내 오른쪽 클릭
    Post(){}
    public Post(String content, String write) {
        this.content = content;
        this.write = write;
    }
}
