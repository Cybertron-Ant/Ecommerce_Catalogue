package com.example.ecommercecatalogue;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// 'ProductAdapter' class for RecyclerView, displaying images & names
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> productList;
    private Context context;

    // initialize chaos... I mean, initialize the adapter with the 'product list' and 'context'
    public ProductAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }// end 'ProductAdapter' constructor

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate the layout for the products
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }// end 'ViewHolder' method

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // summon a pretty product from the list and set its image & name
        Product product = productList.get(position);
        holder.productImage.setImageResource(product.getImageResourceId());
        holder.productName.setText(product.getProductName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, product.getProductName(), Toast.LENGTH_SHORT).show();
            }
        });

    }// end 'onBindViewHolder' method

    @Override
    public int getItemCount() {
        // counting the items in the product stash
        return productList.size();
    }// end 'getItemCount' method

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;  // visual representation of the product's essence
        TextView productName;    // glimpse into the mysterious name of the product

        // construct the portal to another dimension... I mean, construct the ViewHolder
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
        }// end 'ViewHolder' method
    }// end static 'ViewHolder' class

}// end 'ProductAdapter' class
