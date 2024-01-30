package com.example.ecommercecatalogue;

// 'Product' class for storing image resource ID and product name
public class Product {

    private int ID;
    private int imageResourceId;
    private String productName;

    private double itemPrice; // Add Item Price
    private int itemQuantity; // Add Item Quantity

    // initialize 'imageResourceId' & 'productName' class properties
    public Product(int imageResourceId, String productName, double itemPrice, int itemQuantity, int ID) {
        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.ID = ID;
    }// end 'Product' constructor

    public int getID() {
        return ID;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }// end 'getImageResourceId' method

    public String getProductName() {
        return productName;
    }// end 'getProductName' method

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

}// end 'Product' class
