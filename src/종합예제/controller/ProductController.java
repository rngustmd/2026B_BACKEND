package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dao.ProductDao;
import 종합예제.model.dto.ProductDto;

public class ProductController {
    private ProductController() {}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance() { return instance; }

    private IBaseDao ib = ProductDao.getInstance();
    // 다형성 사용
    public boolean save(ProductDto productDto) {
        // TODO 1: productDto 전달받아 DAO의 save()를 호출하고 결과 반환
        boolean result = ib.save(productDto);

        return result;
    }

    public ArrayList<ProductDto> findAll() {
        // TODO 2: DAO의 findAll() 호출하여 결과 반환
        // DAO에게 게시물 전체 목록 가져오라고 요청
        // 반환되는 타입은 ArrayList<Object>
        ArrayList<Object> boardList = ib.findAll();
        ArrayList<ProductDto> result = new ArrayList<>();
        for( Object obj : boardList ){ 
            ProductDto productDto = (ProductDto) obj;
            result.add(productDto);
        }
        return result;
    }
}