package com.example.ecommercecatalogue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

// ItemDetailFragment.java
public class ItemDetailFragment extends Fragment {

    private ImageView itemImageView;
    private TextView itemNameTextView;
    private TextView itemPriceTextView;
    private TextView itemQuantityTextView;

    // Required empty public constructor
    public ItemDetailFragment() {
    }
    // ... Fragment code ...

    // Method to set item details
    public void setItemDetails(String itemName, int itemImageResourceId, double itemPrice, int itemQuantity) {
        // Update the fragment UI with the provided item details
        // You can find views in the layout and set their values accordingly
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        // Handle back press to pop the fragment from the back stack
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                requireActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_detail, container, false);

        // Initialize views
        itemImageView = view.findViewById(R.id.itemImageView);
        itemNameTextView = view.findViewById(R.id.itemNameTextView);
        itemPriceTextView = view.findViewById(R.id.itemPriceTextView);
        itemQuantityTextView = view.findViewById(R.id.itemQuantityTextView);

        return view;
    }

    // Method to set item details
    public void setItemDetails(String itemName, int itemImageResourceId, double itemPrice, int itemQuantity) {
        // Update the fragment UI with the provided item details
        itemImageView.setImageResource(itemImageResourceId);
        itemNameTextView.setText(itemName);
        itemPriceTextView.setText(getString(R.string.price_format, itemPrice));
        itemQuantityTextView.setText(getString(R.string.quantity_format, itemQuantity));
    }

}

