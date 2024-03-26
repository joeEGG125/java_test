package syscom.lingan.To;

import syscom.lingan.entity.Product;

import java.io.Serializable;
import java.util.List;

public class TaxTo implements Serializable {
    private String tag;
    private String content_zh_tw;
    private List<Product> taxOfProduct;

    public TaxTo() {
    }

    public TaxTo(String tag, String content_zh_tw, List<Product> taxOfProduct) {
        this.tag = tag;
        this.content_zh_tw = content_zh_tw;
        this.taxOfProduct = taxOfProduct;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent_zh_tw() {
        return content_zh_tw;
    }

    public void setContent_zh_tw(String content_zh_tw) {
        this.content_zh_tw = content_zh_tw;
    }

    public List<Product> getTaxOfProduct() {
        return taxOfProduct;
    }

    public void setTaxOfProduct(List<Product> taxOfProduct) {
        this.taxOfProduct = taxOfProduct;
    }

    @Override
    public String toString() {
        return "TaxTo{" +
                "tag='" + tag + '\'' +
                ", content_zh_tw='" + content_zh_tw + '\'' +
                ", taxOfProduct=" + taxOfProduct +
                '}';
    }
}
