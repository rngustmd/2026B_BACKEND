package day09.종합예제2.controller;

import java.util.ArrayList;

import day09.종합예제2.model.dao.BoardDao;
import day09.종합예제2.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }
    private BoardDao bd = BoardDao.getInstance();

    public boolean save( BoardDto boardDto ){
        boolean result = bd.save( boardDto );
        return result;
    } 

    public ArrayList<BoardDto> findAll( ){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
    // 수정
    public boolean update( String pn , Integer vn ){
        boolean result = bd.update( pn , vn );
        return result;
    }

    // 삭제
    public boolean delete( String pn ){
        boolean result = bd.delete( pn );
        return result;
    }

} // class end 