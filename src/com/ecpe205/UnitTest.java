package com.ecpe205;

public class UnitTest {
    public static void main(String[] args) {

        //1. Create an item and check if the amount computed coincides with your expected computation
        Order order = new Order();
        order.addItem(new Product("12345", "wagyu beef",2500 ),2);

        System.out.println(order.getItems().get(0).getAmount());

        //2. Create an item, then use setProduct to change the product, then check if the amount computed coincides with your expected computation
        order.addItem(new Product("12345", "Spaghetti",100 ),5);
        System.out.println(order.getItems().get(1).getProduct().getName());

        System.out.println(order.getItems().get(1).getAmount());

        order.getItems().get(1).setProduct(new Product("22134", "lumpia", 25));
        System.out.println(order.getItems().get(1).getProduct().getName());

        System.out.println(order.getItems().get(1).getAmount());

        //3.Create an item, then use setQuantity to change the quantity, then check if the amount computed coincides with your expected computation
        order.addItem(new Product("22134", "lumpia",25 ),12);
        System.out.println(order.getItems().get(2).getQuantity());

        order.getItems().get(2).setQuantity(50);

        System.out.println(order.getItems().get(2).getQuantity());
    }
}