package dbapp.model;

import java.sql.Timestamp;

public class Product {
    private int id;
    private String name;
    private int price;
    private int qty;
    private Timestamp createdAt;

    public Product(int id, String name, int price, int qty, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}