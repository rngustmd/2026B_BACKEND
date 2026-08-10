package day09.종합예제2.model.dao;

import java.util.ArrayList;
import day09.종합예제2.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }
    private ArrayList< BoardDto > boardList = new ArrayList<>(); 

    public boolean save( BoardDto boardDto ){
        boardList.add( boardDto );
        return true;
    }
    
    public ArrayList<BoardDto> findAll( ){
        return boardList;
    }
    // 대기명단 수정
    public boolean update(String pn, Integer vn){
    for(BoardDto board : boardList){
        if(board.getPn( ).equals( pn )){
            board.setVn( vn );
            return true;
        }
    }
    return false;
    }
    // 대기명단 삭제
    public boolean delete( String pn ){
    for( BoardDto board : boardList ){
        if(board.getPn( ).equals( pn ) ){
            boardList.remove( board );
            return true;
        }
    }
    return false;
    }
    
} // class end 