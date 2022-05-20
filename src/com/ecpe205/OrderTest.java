package com.ecpe205;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

// 8-1.
class OrderTest {

    Order order;
    @BeforeAll
    void list(){

        // 8-2.
        order = new Order();
        order.setItem(new Product("12121","Belo",2500),1,0);
        order.setItem(new Product("13131","Celeteque",100),6,1);
        order.setItem(new Product("15151","Ponds",400),3,2);

    }
    @Test
    void addItems(){
        // 8-3.
        order.setItem(new Product("20202","Garnier",450),4,3);
        assertEquals(4 , order.getGrandTotal());
        assertEquals(4 ,order.getGrandTotal());

    }
    @Test
    void removeItems(){
        // 8-4.
        order.removeItem(0);
        order.removeItem(1);
        assertEquals(0 ,order.getTotalQuantity());
        assertEquals(0 ,order.getGrandTotal());
    }





}
