package com.ecpe205;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    @DisplayName("Test if total amount is correct after adding an item")
    void shouldComputeCorrectTotalAmount() {
        Item item1 = new Item(new Product("S001", "Coco Crunch", 50), 3);
        assertEquals(150, item1.getProduct().getPrice() * item1.getQuantity());
    }

    @Test
    @DisplayName("Test if total amount is correct after changing the product of an item")
    void shouldComputeCorrectTotalAfterProductChange() {
        Item item1 = new Item(new Product("S001", "Coco Crunch", 50), 3);
        item1.setProduct(new Product("S002", "Chips", 15));
        assertEquals(45, item1.getProduct().getPrice() * item1.getQuantity());
    }

    @Test
    @DisplayName("Test if total amount is correct after changing item quantity")
    void shouldComputeCorrectTotalAfterQuantityChange() {
        Item item1 = new Item(new Product("S001", "Coco Crunch", 50), 3);
        item1.setQuantity(5);
        assertEquals(250, item1.getProduct().getPrice() * item1.getQuantity());
    }
}