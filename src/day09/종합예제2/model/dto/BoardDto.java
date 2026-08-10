package day09.종합예제2.model.dto;

public class BoardDto {
    private String pn;
    private Integer vn;

    public BoardDto() { }
    public BoardDto(String pn, Integer vn) {
        this.pn = pn;
        this.vn = vn;
    }
    public String getPn() {
        return pn;
    }
    public void setPn(String pn) {
        this.pn = pn;
    }
    public Integer getVn() {
        return vn;
    }
    public void setVn(Integer vn) {
        this.vn = vn;
    }
    @Override
    public String toString() {
        return "BoardDto [pn=" + pn + ", vn=" + vn + "]";
    }
    
    
} // CLASS END 