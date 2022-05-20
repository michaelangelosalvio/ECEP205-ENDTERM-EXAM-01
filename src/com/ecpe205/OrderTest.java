/*
 * Colleen Ann Benedicto
 * https://github.com/colesprojects/ECEP205-ENDTERM-EXAM-01
 **/

package com.ecpe205;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class OrderTest {

    Order order1;

//    @BeforeAll //array of Items (order1) declared in @BeforeAll is modified by all @Tests
    @BeforeEach //resets order1 before each @Test to allow for isolated testing
    void setup() {
        order1 = new Order();
        order1.setItem(new Product("D001", "Fresh Milk", 100), 3, 0);
        order1.setItem(new Product("D002", "Juice", 75), 2, 1);
        order1.setItem(new Product("D003", "Yakult", 55), 1, 2);
    }

    @Test
    @DisplayName("Test if Grand Total and Quantity is correct after adding an item")
    void shouldComputeTotalAndQuantityAfterAddingItem() {
        order1.setItem(new Product("D004", "Kombucha", 200), 1, 3);
        assertEquals(705, order1.getGrandTotal());
        assertEquals(7, order1.getTotalQuantity());
    }

    @Test
    @DisplayName("Test if Grand Total and Quantity is correct after removing items")
    void shouldComputeTotalAndQuantityAfterRemovingItems() {
        order1.removeItem(0);
        order1.removeItem(1);
        assertEquals(55, order1.getGrandTotal());
        assertEquals(1, order1.getTotalQuantity());
    }
}