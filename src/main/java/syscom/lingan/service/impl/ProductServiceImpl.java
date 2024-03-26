package syscom.lingan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syscom.lingan.To.ProductTo;
import syscom.lingan.dao.ProductMapper;
import syscom.lingan.service.ProductService;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    public List<ProductTo> productListAndTax() {
        return productMapper.productListAndTax();
    }
}
