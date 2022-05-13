
package com.ecpe205;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderTest {
    Order order;

    @BeforeAll
    void setup(){
        order = new Order();
        order.addItem(new Product("00001","Mil0",6),2);
        order.addItem(new Product("00002","Noodles",7),5);
        order.addItem(new Product("00003","Ballpen",20),1);
        order.addItem(new Product("00004","Coffee",8),6);
        order.addItem(new Product("00005","Tissue",24),5);
    }

    @Test
    void add5Items(){
        order.addItem(new Product("00006","Toothbrush",75),2);
        order.addItem(new Product("00007","Toothpaste",102),2);
        order.addItem(new Product("00008","Sugar",30),1);
        order.addItem(new Product("00009","Eggs",7),12);
        order.addItem(new Product("00010","Chips",15),4);
        assertEquals(21,order.getTotalQuantity());
        assertEquals(528,order.getGrandTotal());

    }

    @Test
    void remove5Items(){
        for (int i = order.getItems().size(); i<5; i--){
            order.removeItem(i);
        }
        assertEquals(21,order.getTotalQuantity());
        assertEquals(528,order.getGrandTotal());
    }



    @Test
    void getAmounts(){
        Order order = new Order();

        //1.
        order.addItem(new Product("00001","Milo",6),2);
        assertEquals(12,order.getItems().get(0).getAmount());

        //2.
        order.addItem(new Product("00002","Noodles",7),5);
        order.getItems().get(1).setProduct(new Product("111100", "egg", 7));
        assertEquals(35,order.getItems().get(1).getAmount());

        //3.
        order.addItem(new Product("00003","Ballpen",20),1);
        order.getItems().get(1).setQuantity(7);
        assertEquals(20,order.getItems().get(2).getQuantity());

    }
}