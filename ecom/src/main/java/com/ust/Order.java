package com.ust;

public class Order {
    private int orderId;
    private Product[] products;
    private double totalAmount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    public Order() {
    }

    public double calculateTotal(){
        double total  = 0.0;
        for (Product product : products) {
            total = total + product.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println( "\tTotal Amount: "+ calculateTotal());
    }
}
