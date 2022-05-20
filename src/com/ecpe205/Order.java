package com.ecpe205;



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
        items[index].setQuantity(0);
        //edit ends here
    }


    /**
     * Return the total quantity within an order
     * @return Total Quantity
     */
    public double getTotalQuantity() {
        //edit starts here
        double quantity = 0;
        for (int i = 0; i< items.length; i++){

            quantity += this.items[i].getQuantity();
        }

        return quantity;
        //edit ends here
    }

    /**
     * Returns the overall total of all the items
     * @return Overall Total
     */
    public double getGrandTotal() {
        //edit starts here
        double price = 0;
        for(int i = 0; i < items.length; i++) {
            price += items[i].getAmount();
        }
        return price;
        //edit ends here
    }
}
//github.com/username248568/ECEP205-ENDTERM-EXAM-01