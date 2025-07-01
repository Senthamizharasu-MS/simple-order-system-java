package com.ust;

public class User {
    private int userId;
    private String name;
    private Order[] orders;
    private int orderCount;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public User(int userId, String name, int maxOrder) {
        this.userId = userId;
        this.name = name;
        this.orders = new Order[maxOrder];
        this.orderCount = 0;
    }

    public User() {
    }

    public void placeOrder(Product[] products){
        if (orderCount>=orders.length){
            System.out.println("Max order reached.");
            return;
        }
        int newId = orderCount+1;
        Order order = new Order(newId,products);
        orders[orderCount++] = order;
        System.out.println("Order placed successfully!");
    }

    public void viewOrder(){
        System.out.println("Orders for " + name);
        for (int i = 0; i < orderCount; i++) {
            orders[i].displayOrderDetails();
        }
    }
}
