package banana.move.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="order")
public class Order {
    @Id
    @GeneratedValue
    private int order_id;
    private int acct_id;
    private String fullName;
    private String products;
    private String address;
    private int total_price;
    private String status;

    public Order() {
    }

    public Order(int order_id, int acct_id, String fullName, String products, String address, int total_price, String status) {
        this.order_id = order_id;
        this.acct_id = acct_id;
        this.fullName = fullName;
        this.products = products;
        this.address = address;
        this.total_price = total_price;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
