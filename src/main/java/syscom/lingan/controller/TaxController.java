package syscom.lingan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import syscom.lingan.To.TaxTo;
import syscom.lingan.service.TaxService;

@RestController
public class TaxController {
    @Autowired
    private TaxService taxService;

    @RequestMapping("queryProductByTax")
    public TaxTo queryProductByTax(@RequestParam("tax") String tax){
        return taxService.queryProductByTax(tax);
    }
}
