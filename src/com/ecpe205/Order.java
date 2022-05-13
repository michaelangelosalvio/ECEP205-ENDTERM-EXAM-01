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
        //product.add();
        Item item= new Item(product,quantity);
        this.items.add(item);

        //edit ends here
    }


    /**
     * Remove an item from a given index.
     * @param index
     */
    public void removeItem(int index){
        //edit starts here
        //index.remove();
        this.items.remove(index);

        //edit ends here
    }


    /**
     * Return the total quantity within an order
     * @return Total Quantity
     */
    public double getTotalQuantity() {
        //edit starts here
        double totalQuantity=0;
        for(int i=0;i<items.size();i++){
            totalQuantity+=items.get(i).getQuantity();
        }return totalQuantity;
        //edit ends here
    }

    /**
     * Returns the overall total of all the items
     * @return Overall Total
     */
    public double getGrandTotal() {
        //edit starts here
        double overall=0;
        for(int i=0;i<items.size();i++){
            overall +=items.get(i).getAmount();
        }return  overall;
        //edit ends here
    }
}
