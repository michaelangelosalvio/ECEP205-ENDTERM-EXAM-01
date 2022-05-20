package com.ecpe205;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ItemUnitTest {
    @Test
    void getAmount(){

        // 6-1.
        Item item = new Item(new Product("11111","wagyu beef",2500),1);
        assertEquals(2500, item.getAmount());
        //6-2.
        Item item2 = new Item(new Product("22222","spaghetti",100),10);
        assertEquals(1000, item2.getAmount());
        item2.setProduct(new Product("22222", "pancit", 40));
        assertEquals(400, item2.getAmount());

        //6-3.
        Item item3 = new Item(new Product("33333","lumpia",25),2);
        assertEquals(2,item3.getQuantity());
        item3.setQuantity(50);
        assertEquals(50, item3.getQuantity());

    }

}