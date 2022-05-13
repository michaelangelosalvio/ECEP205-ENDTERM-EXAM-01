package com.ecpe205;

public class Item {
    private Product product;
    private double quantity, amount;

    public Item(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;

        //1. Compute for the amount based on the price of the product multiply with quantity
        //Edit starts here
        //this.amount =

        this.amount = this.product.getPrice() * this.quantity;
        //Edit ends here
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) { //done
        this.product = product;

        //2. Compute amount when the quantity changes
        //Edit starts here

        this.product = product;
        Order orderlist = new Order();

        this.amount =  getQuantity() - orderlist.getTotalQuantity();



        //Edit ends here
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) { //done
        this.quantity = quantity;

        //3. Compute amount when the quantity changes
        //Edit starts here

        this.quantity = quantity;
        Order orderlist = new Order();
        this.amount =  this.quantity - orderlist.getTotalQuantity();

        //Edit ends here
    }

    public double getAmount() {
        return amount;
    }

}
