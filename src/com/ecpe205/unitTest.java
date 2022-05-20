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
        order.addItem(new Product("111111","fish",101),3);
        order.addItem(new Product("222222","pork",102),5);
        order.addItem(new Product("333333","salami",103),8);
        order.addItem(new Product("444444","chicken",104),6);
        order.addItem(new Product("555555","beef",105),3);
    }

    @Test
    void add5Items(){
        order.addItem(new Product("211111","lotion",100),13);
        order.addItem(new Product("222220","shampoo",200),6);
        order.addItem(new Product("233333","conditioner",300),4);
        order.addItem(new Product("244444","soap",400),2);
        order.addItem(new Product("255555","shampoo",500),14);
        assertEquals(77,order.getTotalQuantity());
        assertEquals(2142,order.getGrandTotal());

    }

    @Test
    void remove5Items(){
        for (int i = order.getItems().length; i<5; i--){
            order.removeItem(i);
        }
        assertEquals(38,order.getTotalQuantity());
        assertEquals(1356,order.getGrandTotal());
    }



    @Test
    void getAmounts(){
        Order order = new Order();

        //1.
        order.addItem(new Product("555555","beef",105),3);
        assertEquals(550,order.getItems().get(0).getAmount());

        //2.
        order.addItem(new Product("555555","beef",105),3);
        order.getItems().get(1).setProduct(new Product("444444", "chicken", 104));
        assertEquals(100,order.getItems().get(1).getAmount());

        //3.
        order.addItem(new Product("222222","pork",102),5);
        order.getItems().get(2).setQuantity(10);
        assertEquals(10,order.getItems().get(2).getQuantity());

    }
//Gwynneth Gonzaga
    // github link : https://github.com/gwynnethg/ECEP205-ENDTERM-EXAM-01.git

}
