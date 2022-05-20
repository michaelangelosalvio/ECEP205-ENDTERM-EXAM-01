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
        ord.addItem(new Product("1", "ItemA", 10 , 10);
        ord.addItem(new Product("2", "ItemB", 20), 20);
        ord.addItem(new Product("3", "ItemC", 15), 15);
        ord.addItem(new Product("4", "ItemD", 30), 30);
    }

    @ParameterizedTest
    void ShouldAddAndCheckitem(){
        ord.addItem(new Product("1", "ItemA", 10), 10);
        ArrayList<Item> items = ord.getItems();
        assertEquals(10, ord.getGrandTotal());
    }

    @ParameterizedTest
    void ShouldAddAndSetProduct(){
        ord.addItem(new Product("2", "ItemB", 20, 60);
        ArrayList<Item> items = ord.getItems();
        assertEquals(60, ord.getTotalQuantity());



    }
    @ParameterizedTest
    void ShouldAddAndSetQuantity(){
        ord.addItem(new Product("3", "Item C", 15, 30);
        ArrayList<Item> items = ord.getItems();
        assertEquals(30, ord.getTotalQuantity());

    }
    @ParameterizedTest
    void ShouldGetTotalQuantity(){
        ord.addItem(new Product("4", "Item D", 30, 150);
        assertEquals(150, ord.getTotalQuantity());

    }
    @ParameterizedTest
    void ShouldRemoveItem(){
        for(int i = 0; i< ord.getItems().size(); i++){
            ord.removeItem(i);
        }

        assertEquals(5, ord.getTotalQuantity());

    }
}