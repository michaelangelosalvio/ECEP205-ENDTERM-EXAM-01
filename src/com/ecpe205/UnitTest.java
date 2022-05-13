package com.ecpe205;

public class UnitTest {
    public static void main(String[] args) {

        //1.
        Order order = new Order();
        order.addItem(new Product("11011", "bacon",55 ),10);
        System.out.println(order.getItems().get(0).getAmount());

        //2.
        order.addItem(new Product("11011", "bacon",55 ),10);
        System.out.println(order.getItems().get(1).getProduct().getName());
        System.out.println(order.getItems().get(1).getAmount());
        order.getItems().get(1).setProduct(new Product("11100", "egg", 10));
        System.out.println(order.getItems().get(1).getProduct().getName());
        System.out.println(order.getItems().get(1).getAmount());

        //3.
        order.addItem(new Product("11111", "hotdog",12 ),5);
        System.out.println(order.getItems().get(2).getQuantity());
        order.getItems().get(2).setQuantity(10);
        System.out.println(order.getItems().get(2).getQuantity());
    }
}
