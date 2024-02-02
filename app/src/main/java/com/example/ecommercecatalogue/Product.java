package com.example.ecommercecatalogue;

// 'Product' class for storing image resource ID and product name
public class Product {

    private int ID;
    private int imageResourceId;
    private String productName;

    private String productDescription;

    private double itemPrice; // Add Item Price
    private int itemQuantity; // Add Item Quantity

    // initialize 'imageResourceId' & 'productName' class properties

    public Product(int imageResourceId, String productName, double itemPrice, int itemQuantity, String productDescription, int ID) {
        this.ID = ID;
        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    // end 'Product' constructor


    public String getProductDescription() {
        return productDescription;
    }

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
