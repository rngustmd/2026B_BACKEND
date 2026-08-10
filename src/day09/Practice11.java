package day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
    // [1]
    ArrayList< String > nameList = new ArrayList<>();
    nameList.add( "유재석" ); nameList.add("강호동"); nameList.add("신동엽");
    System.out.println( nameList );

    // [2]
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
    for( int index = 0 ; index <= fruits.size() -1 ; index ++ ){
        System.out.println("인덱스" + index + ": " + fruits.get(index));
    }

    // [3]
    for( String str : fruits ){
        System.out.println( str );
    }
    // [4]
    ArrayList<String> alphabet = new ArrayList<>();
    alphabet.add("A"); alphabet.add("B"); alphabet.add("C"); alphabet.add("D"); alphabet.add("E");
    alphabet.remove(2);
    System.out.println(alphabet);
    // [5]
    ArrayList<String> jpc = new ArrayList<>();
    jpc.add("자바"); jpc.add("파이썬"); jpc.add("C++"); 
    jpc.add(1, "자바스크립트");
    System.out.println( jpc );

    // [6]
    ArrayList< Book > bookList = new ArrayList<>();
    bookList.add(new Book("책1", "저1"));
    bookList.add(new Book("책2", "저2"));
    bookList.add(new Book("책3", "저3"));
    for( Book book : bookList ){ System.out.println( book.getTitle() + " : " + book.getAuthor() );}

    // [7]
    Scanner scan = new Scanner(System.in);
    ArrayList<String> text = new ArrayList<>();
    for( ; ; ){
        System.out.print("입력: "); String t = scan.next();
        if(t.equals("종료")){
            break;
        }
        text.add(t);
    }
    for( String str : text){
        System.out.println( str );
    }
    // [8]
    ArrayList<String> subject = new ArrayList<>();
    subject.add("국어"); subject.add("수학"); subject.add("사회"); subject.add("과학"); 
    subject.set(1, "영어");
    System.out.println(subject);

    


    } // main end

} // class end
// [6]
class Book{
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "book [title=" + title + ", author=" + author + "]";
    }
    
}



/*[문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
1. Book 객체를 저장할 수 있는 ArrayList를 library 라는 이름으로 생성하세요.
2. new Book(...)을 사용하여 3권의 책 객체를 생성하고 library 리스트에 추가하세요.
3. 향상된 for문을 사용하여 library에 저장된 모든 책의 제목과 저자를 출력하세요.*/

/*[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.*/

/*[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.*/
