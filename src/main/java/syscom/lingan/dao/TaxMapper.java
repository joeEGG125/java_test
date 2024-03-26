package syscom.lingan.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import syscom.lingan.To.TaxTo;

@Mapper
public interface TaxMapper {
    TaxTo queryProductByTax(@Param("searchTax") String tax);
}
