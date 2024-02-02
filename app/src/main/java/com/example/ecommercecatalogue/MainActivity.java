package com.example.ecommercecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    int imageResourceId;
    String productName;
    double itemPrice;
    int itemQuantity;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        productAdapter = new ProductAdapter(generateSampleData(), this, this);
        recyclerView.setAdapter(productAdapter);





    }
    public static List<Product> generateSampleData () {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.photo1, "Product 1", 19.99, 50, "Product 1 Description",1, "Product 1 Specification"));
        productList.add(new Product(R.drawable.photo2, "Product 2", 29.99, 30, "Product 2 Description",2, "Product 2 Specification"));
        productList.add(new Product(R.drawable.photo3, "Product 3", 39.99, 20, "Product 3 Description",3, "Product 3 Specification"));
        productList.add(new Product(R.drawable.photo4, "Product 4", 49.99, 10, "Product 4 Description",4, "Product 4 Specification"));
        productList.add(new Product(R.drawable.photo5, "Product 5", 59.99, 5, "Product 5 Description",5, "Product 5 Specification"));
        productList.add(new Product(R.drawable.photo6, "Product 6", 69.99, 25, "Product 6 Description",6, "Product 6 Specification"));
        productList.add(new Product(R.drawable.photo7, "Product 7", 79.99, 15, "Product 7 Description",7, "Product 7 Specification"));
        productList.add(new Product(R.drawable.photo8, "Product 8", 89.99, 12, "Product 8 Description",8, "Product 8 Specification"));

        return productList;
    }

    @Override
    public void onItemClick ( int position){
        // Handle item click, open SecondActivity
       /* Product selectedProduct = generateSampleData().get(position);*/



        // Pass the ID to SecondActivity
       /* intent.putExtra("productID",MainActivity.generateSampleData().get().getID());*/

        /*intent.putExtra("imageResourceId", selectedProduct.getImageResourceId());
        intent.putExtra("productName", selectedProduct.getProductName());
        intent.putExtra("itemPrice", selectedProduct.getItemPrice());
        intent.putExtra("itemQuantity", selectedProduct.getItemQuantity());*/

        Product selectedProduct = generateSampleData().get(position);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("productID", selectedProduct.getID());
        startActivity(intent);


        // Display the details in the layout
        /*ImageView imageView = findViewById(R.id.imageView);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView priceTextView = findViewById(R.id.priceTextView);
        TextView quantityTextView = findViewById(R.id.quantityTextView);*/

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



        // Optional: Show a toast for the clicked product name
        //Toast.makeText(MainActivity.this, selectedProduct.getProductName(), Toast.LENGTH_SHORT).show();
    }

}
