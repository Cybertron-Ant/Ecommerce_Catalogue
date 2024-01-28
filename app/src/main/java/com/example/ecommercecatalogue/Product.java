package com.example.ecommercecatalogue;

// 'Product' class for storing image resource ID and product name
public class Product {
    private int imageResourceId;
    private String productName;

    // initialize 'imageResourceId' & 'productName' class properties
    public Product(int imageResourceId, String productName) {
        this.imageResourceId = imageResourceId;
        this.productName = productName;
    }// end 'Product' constructor

    public int getImageResourceId() {
        return imageResourceId;
    }// end 'getImageResourceId' method

    public String getProductName() {
        return productName;
    }// end 'getProductName' method

}// end 'Product' class
