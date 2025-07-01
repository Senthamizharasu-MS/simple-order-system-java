package com.ust;


public class  ECommerceSystem {

    public static void main(String[] args){
        Product[] oArr = {
                new Product(1,"lap",1000),
                new Product(1,"phone",100)
        };
        User user = new User(1,"tamil",5);

        user.placeOrder(oArr);
        user.viewOrder();
    }
}