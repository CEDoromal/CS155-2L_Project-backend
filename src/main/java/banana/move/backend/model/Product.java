package banana.move.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="product")
public class Product {
    @Id
    @GeneratedValue
    private int prod_id;
    private String name;
    private int price;
    private String image;

    public Product() {
    }

    public Product(int prod_id, String name, int price, String image) {
        this.prod_id = prod_id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
