package 종합예제.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BaseTime {
    private String cdate;

    public BaseTime() {
        this.cdate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public BaseTime(String cdate) {
        this.cdate = cdate;
    }

    public String getCdate() { return cdate; }
    public void setCdate(String cdate) { this.cdate = cdate; }
}

// BoardDto와 ProductDto를 상속
// 두 Dto는 등록 날짜가 필요하기 때문
// 상속을 통해 기능의 재사용이 가능하여 날짜 코드의 반복성 감소
