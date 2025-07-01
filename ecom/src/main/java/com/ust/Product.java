package com.ust;

public class Product {
    private int productId;
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public void displayProductDetails() {
        System.out.println("\tProduct ID: " + productId + ", Name: " + name  + ", Price: " + price);
    }

}
