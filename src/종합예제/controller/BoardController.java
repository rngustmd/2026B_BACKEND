package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.BoardDao;
import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }
    
    private IBaseDao ib = BoardDao.getInstance();
    
    public boolean save(BoardDto boardDto) {
        // TODO 1: boardDto 전달받아 DAO의 save()를 호출하고 결과 반환
        boolean result = ib.save(boardDto);
        return result;
    }

    public ArrayList<BoardDto> findAll() {
    // TODO 2: DAO의 findAll() 호출하여 결과 반환

    // DAO에게 게시물 전체 목록을 가져오라고 요청
    // 반환되는 타입은 ArrayList<Object>
    ArrayList<Object> boardList = ib.findAll();
    // 최종적으로 BoardDto만 담을 새로운 리스트 생성
    ArrayList<BoardDto> result = new ArrayList<>();
    // boardList에 들어있는 데이터를 하나씩 꺼냄
    for (Object obj : boardList) {
        // Object 타입을 BoardDto 타입으로 형변환해서 result에 추가
        result.add((BoardDto) obj);
    }
    // BoardDto로 변환한 게시물 목록을 Controller를 호출한 곳에 반환
    return result;
 }
}