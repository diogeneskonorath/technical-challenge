package com.diogeneskonorath.technicalchallenge.model;

public class Item {
    private int id, itemQuantity;
    private double itemPrice;

    public Item(int id, int itemQuantity, double itemPrice) {
        this.id = id;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
