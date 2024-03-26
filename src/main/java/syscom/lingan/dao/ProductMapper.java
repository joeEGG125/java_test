package syscom.lingan.dao;

import org.apache.ibatis.annotations.Mapper;
import syscom.lingan.To.ProductTo;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductTo> productListAndTax();
}
