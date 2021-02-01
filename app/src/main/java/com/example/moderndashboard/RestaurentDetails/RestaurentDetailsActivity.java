package com.example.moderndashboard.RestaurentDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.moderndashboard.ConfirmOrder.ConfirmOrderActivity;
import com.example.moderndashboard.ConfirmOrder.UpdateSelectedItem;
import com.example.moderndashboard.R;
import com.example.moderndashboard.RestaurentDetails.RestaurentModel.RestaurentModelOne;
import com.example.moderndashboard.RestaurentDetails.RestaurentModel.RestaurentModelTwo;
import com.example.moderndashboard.RestaurentDetails.RestauretAdapter.RestaurentAdapterOne;
import com.example.moderndashboard.RestaurentDetails.RestauretAdapter.RestaurentAdapterTwo;


import java.util.ArrayList;
import java.util.List;

public class RestaurentDetailsActivity extends AppCompatActivity implements RestaurentInterface {

    private RecyclerView recyclerViewOne, recyclerViewTwo;
    private ImageView cart;
    private RestaurentAdapterOne adapter;

    private ArrayList<RestaurentModelTwo> items;
    private RestaurentAdapterTwo restaurentAdapterTwo;
    int pos;
    UpdateSelectedItem updateSelectedItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent_details);
        init();

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);


        List<RestaurentModelOne> list = new ArrayList<>();
        list.add(new RestaurentModelOne("Pizza", R.drawable.ic_pizza_slice, pos));
        list.add(new RestaurentModelOne("Burger", R.drawable.ic_burger, pos));
        list.add(new RestaurentModelOne("French Fries", R.drawable.ic_french_fries, pos));
        list.add(new RestaurentModelOne("Sandwich", R.drawable.ic_sandwich, pos));
        list.add(new RestaurentModelOne("Dessert", R.drawable.ic_cupcake, pos));


        adapter = new RestaurentAdapterOne(list, this, this);
        recyclerViewOne.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewOne.setAdapter(adapter);


        restaurentAdapterTwo = new RestaurentAdapterTwo(items,updateSelectedItem);
        recyclerViewTwo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerViewTwo.setAdapter(restaurentAdapterTwo);


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RestaurentDetailsActivity.this, ConfirmOrderActivity.class);
                startActivity(intent1);
            }
        });

    }

    private void init() {
        cart = findViewById(R.id.cartRes);
        recyclerViewOne = findViewById(R.id.res_recyclerView_One);
        recyclerViewTwo = findViewById(R.id.res_recyclerView_Tow);
        items = new ArrayList<>();

    }


    @Override
    public void callBack(int positions, ArrayList<RestaurentModelTwo> items) {

        restaurentAdapterTwo = new RestaurentAdapterTwo(items,updateSelectedItem);
        restaurentAdapterTwo.notifyDataSetChanged();
        recyclerViewTwo.setAdapter(restaurentAdapterTwo);


    }
}