package day09.종합예제2.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.종합예제2.controller.BoardController;
import day09.종합예제2.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} 
    private static final BoardView instance = new BoardView(); 
    public static BoardView getInstance( ){ return instance; } 
    private BoardController bc = BoardController.getInstance(); 
    private Scanner scan = new Scanner( System.in);  
    
    public void run(){
        while(true){ 
            System.out.print("1.대기명단등록 2.대기명단조회 3.대기명단수정 4.대기명단삭제: " );
            int ch = scan.nextInt();
            if( ch == 1 ) { save(); }
            else if( ch == 2 ) { findAll(); }
            else if( ch == 3 ){ update(); }
            else if( ch == 4 ){ delete(); }
        }
    }

    public void save( ){
        System.out.print("연락처(전화번호): ");     
        String 연락처 = scan.next();
        System.out.print("방문인원: ");   
        Integer 방문인원 = scan.nextInt();
        BoardDto boardDto = new BoardDto( 연락처 , 방문인원 );
        boolean result = bc.save( boardDto );
        if( result ){ System.out.println("등록성공"); }
        else{ System.out.println("등록실패"); }
    }

    public void findAll( ){
        ArrayList<BoardDto> result = bc.findAll();
        for( BoardDto board : result ){
            System.out.println( 
                " 연락처: " +
                board.getPn() + " 방문인원: " +
                board.getVn());
        }
    } // f end 

    public void update(){
        System.out.print( "수정할 연락처: ");
        String 연락처 = scan.next();
        System.out.print("수정할 방문인원: ");
        Integer 방문인원 = scan.nextInt();
        boolean result = bc.update(연락처, 방문인원);
        if( result ){ System.out.println( "수정성공");}
        else{ System.out.println("수정실패");}
    }
    public void delete(){
        System.out.println("삭제할 연락처: ");
        String 연락처 = scan.next();
        boolean result = bc.delete(연락처);
        if( result ){ System.out.println("삭제성공");}
        else{ System.out.println("삭제실패");}
    }
    
} // class end 