package com.example.ecommercecatalogue;

// 'Product' class for storing image resource ID and product name
public class Product {
    private int imageResourceId;
    private String productName;

    private double price;

    // initialize 'imageResourceId' & 'productName' class properties
    public Product(int imageResourceId, String productName, double price) {
        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.price = price;
    }// end 'Product' constructor

    public int getImageResourceId() {
        return imageResourceId;
    }// end 'getImageResourceId' method

    public String getProductName() {
        return productName;
    }// end 'getProductName' method

    public double getPrice() {
        return price;
    }// end 'getPrice' getter method

}// end 'Product' class
