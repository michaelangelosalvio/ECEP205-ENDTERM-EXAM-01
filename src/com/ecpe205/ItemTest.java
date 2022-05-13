package com.ecpe205;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ItemTest {
    Item item;

    @BeforeAll
    void setup(){
        item = new Item();
    }

    //check amount
    @Test
    void shouldCheckAmount(){
        assertEquals("12.00", item.getAmount());
    }

    @ParameterizedTest
    @MethodSource("solveAmount")
    void shouldSolveAmount (double quantity, double price) { assertEquals(quantity*price);}
}