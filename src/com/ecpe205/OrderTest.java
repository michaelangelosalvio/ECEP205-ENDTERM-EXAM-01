package com.ecpe205;
// Argie Donio ---> https://github.com/argied/ECEP205-ENDTERM-EXAM-01

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;

    void setup(){
        order = new Order();
        order.setItem(new Product("101010","stake",10),10, 0);
        order.setItem(new Product("101000","burger",20),5, 1);
        order.setItem(new Product("010101","salad",15),2, 2);

    }

    @Test
    void setItems(){
        order.setItem(new Product("222220","blouse",100),10, 3);
        order.setItem(new Product("222200","shoe",345),4,4);
        order.setItem(new Product("222000","mirror",78),4,5);

        assertEquals(18,order.getTotalQuantity());
        assertEquals(2692,order.getGrandTotal());

    }

    @Test
    void removeItems(){
        for (int i = order.getItems().length; i<2; i--){
            order.removeItem(i);
        }
        assertEquals(20,order.getTotalQuantity());
        assertEquals(2712,order.getGrandTotal());
    }



}