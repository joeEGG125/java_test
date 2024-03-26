package syscom.lingan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syscom.lingan.To.ProductTo;
import syscom.lingan.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("productListAndTax")
    public List<ProductTo> productListAndTax(){
        return productService.productListAndTax();
    }
}
