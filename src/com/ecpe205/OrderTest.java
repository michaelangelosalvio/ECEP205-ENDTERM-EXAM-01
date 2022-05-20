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
        order.setItem(new Product("11111","wagyu beef",2500),2,0);
        order.setItem(new Product("22222","spaghetti",100),12,1);
        order.setItem(new Product("33333","lumpia",25),2,2);

    }

    @Test
    void addItems(){
        // 8-3.
        order.setItem(new Product("12121","milk",45),4,3);
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
