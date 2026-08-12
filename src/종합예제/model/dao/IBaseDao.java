package 종합예제.model.dao;

import java.util.ArrayList;

public interface IBaseDao {
    // [DB 연동 정보 상수 선언] * 추후에 사용 됩니다.
    String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    String DB_ID = "root";
    String DB_PW = "1234";

    boolean save(Object obj);
    ArrayList<Object> findAll();

}
// 인터페이스 사용 BoardDao , ProductDao
// save와 findAll 동일한 목적의 기능을 수행하게끔 == 구조 통일
