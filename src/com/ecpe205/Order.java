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
        //product.add();
        Item item= new Item(product,quantity);
        this.items.add(item);

        //edit ends here
    }


    /**
     * Sets the given index to null
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
