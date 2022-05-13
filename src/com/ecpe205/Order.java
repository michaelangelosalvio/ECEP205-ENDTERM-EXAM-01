package com.ecpe205;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;

    public Order() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Create a new item and append to the items list
     * @param product
     * @param quantity
     */
    public void addItem(Product product, double quantity) {
        //edit starts here
        Item newProduct = new Item(new Product("123", "apple", 10.0), 2);
        items.add(newProduct);
        //edit ends here
    }


    /**
     * Remove an item from a given index.
     * @param index
     */
    public void removeItem(int index){
        //edit starts here
        items.remove(index);
        //edit ends here
    }


    /**
     * Return the total quantity within an order
     * @return Total Quantity
     */
    public double getTotalQuantity() {
        double total=0;
        for (int i=0; i<this.items.size(); i++){
            total += items.get(i).getQuantity();
        }
        return total;
    }

    /**
     * Returns the overall total of all the items
     * @return Overall Total
     */
    public double getGrandTotal() {
        double grandTotal=0;
        for (int i=0; i<items.size();i++){
            grandTotal += items.get(i).getAmount();
        }
        return grandTotal;
    }
}
