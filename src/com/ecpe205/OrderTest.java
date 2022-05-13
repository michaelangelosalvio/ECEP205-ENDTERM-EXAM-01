package com.ecpe205;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderTest {
    Order order;

    @BeforeAll
    void list(){
        order = new Order();
        order.addItem(new Product("11111","wagyu beef",2500),2);
        order.addItem(new Product("22222","spaghetti",100),12);
        order.addItem(new Product("33333","lumpia",25),2);
        order.addItem(new Product("44444","bolognia",150),4);
        order.addItem(new Product("55555","pie",80),5);
    }

    @Test
    void addItems(){
        order.addItem(new Product("12121","milk",45),4);
        order.addItem(new Product("13131","butter",25),12);
        order.addItem(new Product("14141","flour",30),6);
        order.addItem(new Product("15151","sugar",50),8);
        order.addItem(new Product("16161","vanilla",12),2);
        assertEquals(57,order.getTotalQuantity());
        assertEquals(8334,order.getGrandTotal());

    }



    @Test
    void getAmounts(){
        Order order = new Order();

        //1.
        order.addItem(new Product("11111","wagyu beef",2500),2);
        assertEquals(5000,order.getItems().get(0).getAmount());

        //2.
        order.addItem(new Product("22222","spaghetti",100),10);
        order.getItems().get(1).setProduct(new Product("22222", "pancit", 40));
        assertEquals(400,order.getItems().get(1).getAmount());

        //3.
        order.addItem(new Product("33333","lumpia",25),2);
        order.getItems().get(2).setQuantity(50);
        assertEquals(50,order.getItems().get(2).getQuantity());

    }
}
