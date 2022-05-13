package com.ecpe205;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order ord;
    @BeforeAll
    void setup(){
        ord = new Order();
        ord.addItem(new Product("123", "saging", 5.0), 5);
        ord.addItem(new Product("234", "talong", 5.0), 5);
        ord.addItem(new Product("345", "watermelon", 5.0), 5);
        ord.addItem(new Product("678", "berry", 5.0), 5);
    }

    @ParameterizedTest
    void ShouldAddAndCheckitem(){
        ord.addItem(new Product("222", "banana", 5.0), 5);
        ArrayList<Item> items = ord.getItems();
        assertEquals(5.0, ord.getGrandTotal());
    }

    @ParameterizedTest
    void ShouldAddAndSetProduct(){
        ord.addItem(new Product("222", "banana", 5.0), 5);
        ArrayList<Item> items = ord.getItems();



    }
    @ParameterizedTest
    void ShouldAddAndSetQuantity(){
        ord.addItem(new Product("222", "banana", 5.0), 5);
        ArrayList<Item> items = ord.getItems();


    }
    @ParameterizedTest
    void ShouldGetTotalQuantity(){
        assertEquals(5, ord.getTotalQuantity());

    }
    @ParameterizedTest
    void ShouldRemoveItem(){
        for(int i = 0; i< ord.getItems().size(); i++){
            ord.removeItem(i);
        }

        assertEquals(5, ord.getTotalQuantity());

    }
}