package com.ecpe205;

public class Item {
    private Product product;
    private double quantity, amount, price;

    public Item(Product product, double quantity, double amount, double price) {
        this.product = product;
        this.quantity = quantity;
        this.amount=product.getPrice()*getQuantity();
        //1. Compute for the amount based on the price of the product multiply with quantity
        //Edit starts here
        //this.amount =
        //Edit ends here
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;

        //2. Compute amount when the quantity changes
        //Edit starts here
        //this.amount =
        //Edit ends here
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;

        //3. Compute amount when the quantity changes
        //Edit starts here
        //this.amount =
        //Edit ends here
    }

    public double getAmount() {
        return amount;
    }

}
