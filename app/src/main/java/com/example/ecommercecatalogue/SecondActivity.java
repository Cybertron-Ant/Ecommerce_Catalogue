package com.example.ecommercecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements OnItemClickListener {

    /*public static int imageResourceId;
    public static String  productName;
    public static double itemPrice;
    public static int itemQuantity;*/
    int imageResourceId;
    String productName;
    double itemPrice;
    int itemQuantity;

    public static ImageView imageView;

    public static TextView nameTextView;

    public static TextView priceTextView;
    public static TextView quantityTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        int productId = getIntent().getIntExtra("productID", -1);

        if (productId != -1) {
            // Find the product with the matching ID
            Product selectedProduct = findProductById(productId);

            if (selectedProduct != null) {
                // Display the details in the layout
                ImageView imageView = findViewById(R.id.imageView);
                TextView nameTextView = findViewById(R.id.nameTextView);
                TextView priceTextView = findViewById(R.id.priceTextView);
                TextView quantityTextView = findViewById(R.id.quantityTextView);

                imageResourceId = selectedProduct.getImageResourceId();
                productName = selectedProduct.getProductName();
                itemPrice = selectedProduct.getItemPrice();
                itemQuantity = selectedProduct.getItemQuantity();

                imageView.setImageResource(imageResourceId);
                nameTextView.setText(productName);
                priceTextView.setText(String.format("Price: $%.2f", itemPrice));
                quantityTextView.setText(String.format("Quantity: %d", itemQuantity));
            } else {
                // Handle the case when the product with the given ID is not found
                // You may want to show a Toast or handle it in some other way
            }
        } else {
            // Handle the case when the productID extra is not provided
            // You may want to show a Toast or handle it in some other way
        }
    }

    private Product findProductById(int productId) {
        for (Product product : MainActivity.generateSampleData()) {
            if (product.getID() == productId) {
                return product;
            }
        }
        return null; // Return null if the product with the given ID is not found

    }

    @Override
    public void onItemClick(int position) {
        // get position of all elements in 'product' array
        Product product = MainActivity.generateSampleData().get(position);

        // navigate to ProductView from SecondActivity.java
        Intent intent = new Intent(SecondActivity.this, ProductView.class);
    }
}
