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
        Item item = new Item(new Product("12121","Belo",2500),1);
        assertEquals(2500, item.getAmount());
        //6-2.
        Item item2 = new Item(new Product("13131","Celeteque",100),10);
        assertEquals(1000, item2.getAmount());
        item2.setProduct(new Product("22222", "Ponds", 40));
        assertEquals(400, item2.getAmount());

        //6-3.
        Item item3 = new Item(new Product("14141","Cetaphil",25),2);
        assertEquals(2,item3.getQuantity());
        item3.setQuantity(50);
        assertEquals(50, item3.getQuantity());


    }

}