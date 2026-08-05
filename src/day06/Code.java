package day06;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner scan = new Scanner( System.in );

        for( ; ; ){
            System.out.println(" ============ My Community ============ ");
            System.out.println(" 1. 게시물 작성 2. 게시물 출력 ");
            System.out.println(" 선택> ");
            System.out.println(" ====================================== ");
            int ch = scan.nextInt();

            if( ch == 1 ){
                scan.nextLine();
                System.out.println( " 내용 : " );
                String content = scan.next();
                System.out.println( " 작성자 : ");
                String writer = scan.next();
                Post post = new Post(content , writer);
                boolean result = false;

                for( int index = 0 ; index <= posts.length -1 ; index ++){
                    if(posts[index] == null ){
                        posts[index] = post;
                        result = true;
                        break;
                    }
                }
                if (result) {
                    System.out.println("[안내] 글쓰기 성공");
                } else { 
                    System.out.println("[안내] 글쓰기 실패");
                }
            }else if( ch == 2 ){
                for(Post post : posts){
                    if( post !=null ){
                    System.out.printf( " 작성자 : %s , 내용 : %s " , post.writer , post.content);
                    }
                }
            }
        }
        
    } // main end

} // class end

class Post{
    String content;
    String writer;

    Post(){}
    Post( String content , String writer ){
        this.content = content;
        this.writer = writer;
    }
}