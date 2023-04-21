package banana.move.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="product")
public class Product {
    @Id
    @GeneratedValue
    private int prodId;
    private String name;
    private int price;
    private String image;

    public Product() {
    }

    public Product(int prodId, String name, int price, String image) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
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
