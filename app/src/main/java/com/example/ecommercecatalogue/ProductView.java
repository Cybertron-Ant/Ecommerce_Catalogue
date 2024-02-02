package com.example.ecommercecatalogue;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductView extends AppCompatActivity {

    private ImageView productViewImage;
    private TextView descriptionText;
    private TextView specificationTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.product_view);

        // initialize variables with references to the XML elements
        productViewImage = findViewById(R.id.productViewImage);
        descriptionText = findViewById(R.id.descriptionText);
        specificationTextView = findViewById(R.id.specificationTextView);

    }
}// end 'ProductView' class
