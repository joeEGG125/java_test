package syscom.lingan.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private String item_no;
    private String item_name;
    private String price;
    private String eff_date_from;
    private String eff_date_to;
    private String tax;
    private String creator;
    private String create_time;
    private String updater;
    private String update_time;

    public Product() {
    }

    public Product(String item_no, String item_name, String price, String eff_date_from, String eff_date_to, String tax, String creator, String create_time, String updater, String update_time) {
        this.item_no = item_no;
        this.item_name = item_name;
        this.price = price;
        this.eff_date_from = eff_date_from;
        this.eff_date_to = eff_date_to;
        this.tax = tax;
        this.creator = creator;
        this.create_time = create_time;
        this.updater = updater;
        this.update_time = update_time;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEff_date_from() {
        return eff_date_from;
    }

    public void setEff_date_from(String eff_date_from) {
        this.eff_date_from = eff_date_from;
    }

    public String getEff_date_to() {
        return eff_date_to;
    }

    public void setEff_date_to(String eff_date_to) {
        this.eff_date_to = eff_date_to;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item_no='" + item_no + '\'' +
                ", item_name='" + item_name + '\'' +
                ", price='" + price + '\'' +
                ", eff_date_from='" + eff_date_from + '\'' +
                ", eff_date_to='" + eff_date_to + '\'' +
                ", tax='" + tax + '\'' +
                ", creator='" + creator + '\'' +
                ", create_time='" + create_time + '\'' +
                ", updater='" + updater + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
