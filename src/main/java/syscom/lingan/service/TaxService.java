package syscom.lingan.service;

import org.apache.ibatis.annotations.Param;
import syscom.lingan.To.TaxTo;

public interface TaxService {
    TaxTo queryProductByTax(String tax);
}
