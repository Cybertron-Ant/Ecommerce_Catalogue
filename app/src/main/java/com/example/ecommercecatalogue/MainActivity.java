package com.example.ecommercecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productAdapter = new ProductAdapter(generateSampleData(), this, this);
        recyclerView.setAdapter(productAdapter);





    }
    private List<Product> generateSampleData () {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.photo1, "Product 1", 19.99, 50));
        productList.add(new Product(R.drawable.photo2, "Product 2", 29.99, 30));
        productList.add(new Product(R.drawable.photo3, "Product 3", 39.99, 20));
        productList.add(new Product(R.drawable.photo4, "Product 4", 49.99, 10));
        productList.add(new Product(R.drawable.photo5, "Product 5", 59.99, 5));
        productList.add(new Product(R.drawable.photo6, "Product 6", 69.99, 25));
        productList.add(new Product(R.drawable.photo7, "Product 7", 79.99, 15));
        productList.add(new Product(R.drawable.photo8, "Product 8", 89.99, 12));

        return productList;
    }

    @Override
    public void onItemClick ( int position){
        // Handle item click, open SecondActivity
       /* Product selectedProduct = generateSampleData().get(position);*/

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        /*intent.putExtra("imageResourceId", selectedProduct.getImageResourceId());
        intent.putExtra("productName", selectedProduct.getProductName());
        intent.putExtra("itemPrice", selectedProduct.getItemPrice());
        intent.putExtra("itemQuantity", selectedProduct.getItemQuantity());*/
        startActivity(intent);

        // Optional: Show a toast for the clicked product name
        //Toast.makeText(MainActivity.this, selectedProduct.getProductName(), Toast.LENGTH_SHORT).show();
    }

}
