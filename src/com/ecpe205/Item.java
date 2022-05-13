/*
Kristel C. Casalda  ENCE4A
GitHub Link: https://github.com/C-Kristel/ECEP205-ENDTERM-EXAM-01.git
 */

package com.ecpe205;

public class Item {
    private Product product;
    private double quantity, amount;

    public Item(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;

        //1. Compute for the amount based on the price of the product multiply with quantity
        //Edit starts here
        this.amount = quantity * getProduct().getPrice();
        //Edit ends here
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        Order order = new Order();
        this.product = product;

        //2. Compute amount when the quantity changes
        //Edit starts here

        this.amount = getQuantity() - order.getTotalQuantity();
        //Edit ends here
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        Order order = new Order();

        //3. Compute amount when the quantity changes
        //Edit starts here
        this.amount = getQuantity() * order.getTotalQuantity();
        //Edit ends here
    }

    public double getAmount() {
        return amount;
    }

}
