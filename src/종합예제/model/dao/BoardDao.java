package 종합예제.model.dao;

import java.util.ArrayList;

public class BoardDao implements IBaseDao {
    private BoardDao() {}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance() { return instance; }

    private ArrayList<Object> boardList = new ArrayList<>();

    // TODO 1: IBaseDao의 save() 메서드를 오버라이딩하여 boardList 저장하는 로직 작성
    public boolean save( Object object ){
        // controller 로 부터 저장할 정보 객체 받기
        // 리스트에 저장
        boardList.add( object);
        // 성공 반환
        return true;
        
    }
    // TODO 2: IBaseDao의 findAll() 메서드를 오버라이딩하여 boardList를 반환하는 로직 작성
    public ArrayList<Object> findAll(){
        // controller에게 매개변수 받기
        // 리스트 전체 반환
        return boardList;
    }
}