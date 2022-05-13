package com.ecpe205;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


class OrderTest {
    Order order;

    @BeforeAll
    void setup(){
        order = new Order();
        order.addItem(new Product("111", "apple", 10.0), 5);
        order.addItem(new Product("222", "banana", 10.0), 5);
        order.addItem(new Product("333", "cherry", 10.0), 5);
        order.addItem(new Product("444", "coconut", 10.0), 5);
        order.addItem(new Product("555", "strawberry", 10.0), 5);
    }
}

