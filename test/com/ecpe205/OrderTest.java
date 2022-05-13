package com.ecpe205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {




    @Test
    void getAmounts(){
        Order order = new Order();

        //1.
        order.addItem(new Product("111110","bacon",55),10);
        assertEquals(550,order.getItems().get(0).getAmount());

        //2.
        order.addItem(new Product("111110","bacon",55),10);
        order.getItems().get(1).setProduct(new Product("111100", "egg", 10));
        assertEquals(100,order.getItems().get(1).getAmount());

        //3.
        order.addItem(new Product("111000","hotdog",12),5);
        order.getItems().get(2).setQuantity(10);
        assertEquals(10,order.getItems().get(2).getQuantity());

    }
}