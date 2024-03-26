package syscom.lingan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syscom.lingan.To.TaxTo;
import syscom.lingan.dao.TaxMapper;
import syscom.lingan.service.TaxService;
@Service
public class TaxServiceImpl implements TaxService {
    @Autowired
    private TaxMapper taxMapper;
    public TaxTo queryProductByTax(String tax) {
        return taxMapper.queryProductByTax(tax);
    }
}
