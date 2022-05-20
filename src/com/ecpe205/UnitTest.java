package com.ecpe205;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void add5Items(){

        Item item = new Item(new Product("123","item1", 10),1);
        assertEquals(10,item.getAmount());
        item.setProduct(new Product("456","item 2", 20));
        assertEquals(20,item.getAmount());
        item.setQuantity(5);
        assertEquals(100,item.getAmount());

    }
}