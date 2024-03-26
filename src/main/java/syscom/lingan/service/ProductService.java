package syscom.lingan.service;

import syscom.lingan.To.ProductTo;

import java.util.List;

public interface ProductService {
    List<ProductTo> productListAndTax();
}
