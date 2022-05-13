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
}