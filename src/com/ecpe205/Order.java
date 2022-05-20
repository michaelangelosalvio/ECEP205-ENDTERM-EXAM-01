package com.ecpe205;

import java.util.List;

public class Order {
    private Item[] items;

    /**
     * Allocated an Order to exactly 5 Items.
     * Note: All 5 location by default are null
     */
    public Order() {
        this.items = new Item[5];
    }

    public Item[] getItems() {
        return items;
    }

    /**
     * Set the item on the given index
     * @param product
     * @param quantity
     * @param index
     */

    public void setItem(Product product, double quantity, int index) {
        //edit starts here
        this.items[index] = new Item(product, quantity);

        //edit ends here
    }


    /**
     * Sets the given index to null
     * @param index
     */
    public void removeItem(int index){
        //edit starts here
        List.of(this.items[index]).remove(index);


        //edit ends here
    }


    /**
     * Return the total quantity within an order
     * @return Total Quantity
     */
    public double getTotalQuantity() {
        //edit starts here
        double total = 0;
        for (int i = 0; i< items.length; i++){
            double a = this.items[i].getQuantity();
            total +=a;
        }

        return total;
        //edit ends here
    }

    /**
     * Returns the overall total of all the items
     * @return Overall Total
     */
    public double getGrandTotal() {
        //edit starts here
        double total = 0;
        for (int i = 0; i< items.length; i++){
            double a = this.items[i].getAmount();
            total +=a;
        }

        return getGrandTotal();
        //edit ends here
    }
}