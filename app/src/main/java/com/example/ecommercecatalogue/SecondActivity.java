package com.example.ecommercecatalogue;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    int imageResourceId;
    String productName;
    double itemPrice;
    int itemQuantity;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        for (int i = 0; i < MainActivity.generateSampleData().size(); i++) {
            // Retrieve product details from the intent
            imageResourceId = getIntent().getIntExtra("imageResourceId", MainActivity.generateSampleData().get(i).getImageResourceId());
            productName = getIntent().getStringExtra(MainActivity.generateSampleData().get(i).getProductName());
            itemPrice = getIntent().getDoubleExtra("itemPrice",  MainActivity.generateSampleData().get(i).getItemPrice());
            itemQuantity = getIntent().getIntExtra("itemQuantity",  MainActivity.generateSampleData().get(i).getItemQuantity());
        }


        // Display the details in the layout
        ImageView imageView = findViewById(R.id.imageView);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView priceTextView = findViewById(R.id.priceTextView);
        TextView quantityTextView = findViewById(R.id.quantityTextView);

        // Check for null values or default values
       /* if (imageResourceId != 0) {
            imageView.setImageResource(imageResourceId);
        } else {
            // Handle the case when the image resource is not found
            //showToast("Invalid image resource ID");
            finish();  // Finish the activity to avoid further processing
            return;
        }

        if (productName != null) {
            nameTextView.setText(productName);
        } else {
            // Handle the case when the product name is null
            finish();  // Finish the activity to avoid further processing
            return;
        }*/

        // Set default values if itemPrice or itemQuantity is not found
        priceTextView.setText(String.format("Price: $%.2f", itemPrice));
        quantityTextView.setText(String.format("Quantity: %d", itemQuantity));
        imageView.setBackgroundResource(imageResourceId);
        nameTextView.setText(productName);
    }
}
