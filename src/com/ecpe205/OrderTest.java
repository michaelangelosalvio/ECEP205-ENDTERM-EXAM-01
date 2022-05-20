package com.ecpe205;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderTest {
    Order order = new Order();
    @BeforeAll
    void setup() {

        Product[] product = new Product[5];
        Item[] item = new Item[5];

        product[0] = new Product("123", "I1", 10);
        product[1] = new Product("456", "I2", 20);
        product[2] = new Product("789", "I3", 30);
        product[4] = new Product("654", "I5", 50);
        order.setItem(product[0], 1, 0);
        order.setItem(product[1], 2, 1);
        order.setItem(product[2], 3, 2);

    }
    @Test
    void addnewitem(){
        Product product3 = new Product("987", "I4", 40);
        Product product4 = new Product("654", "I5", 50);
        order.setItem(product3,1,3);
        order.setItem(product4,0,4);
        assertEquals(7,order.getTotalQuantity());
        assertEquals(180,order.getGrandTotal());
    }
    @Test
    void removetem(){
        Product product3 = new Product("987", "I4", 40);
        Product product4 = new Product("654", "I5", 50);
        order.setItem(product3,0,3);
        order.setItem(product4,0,4);
        for (int i = 0; i<2; i++){
            order.removeItem(i);
        }
        assertEquals(3,order.getTotalQuantity());
        assertEquals(90,order.getGrandTotal());
    }

}
