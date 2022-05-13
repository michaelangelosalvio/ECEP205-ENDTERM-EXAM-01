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
        Item item_data = new Item(new Product("001", "Jackfruit", 10.0), 3);
        items.add(item_data); //done
        //edit ends here
    }


    /**
     * Remove an item from a given index.
     * @param index
     */
    public void removeItem(int index){
        //edit starts here
        this.items.remove(index); //done
        //edit ends here
    }


    /**
     * Return the total quantity within an order
     * @return Total Quantity
     */
    public double getTotalQuantity() {
        //edit starts here
        double total=0;
        for (int i=0; i<this.items.size(); i++){
            total += items.get(i).getQuantity();
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
        double grandTotal=0;
        for (int i=0; i<items.size();i++){
            grandTotal += items.get(i).getAmount();
        }
        return grandTotal;
        //edit ends here
    }


    @BeforeAll
    void setup(){
        ord = new Order();
        ord.addItem(new Product("623", "frost", 5.0), 1);
        ord.addItem(new Product("334", "bleed", 3.0), 5);
        ord.addItem(new Product("145", "dead", 2.0), 2);
        ord.addItem(new Product("633", "sad", 1.0), 4);
    }
}
