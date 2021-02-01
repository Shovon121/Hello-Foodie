package com.example.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.moderndashboard.RestaurentDetails.RestaurentDetailsActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements UpdateRececlerView {

    private RecyclerView recyclerViewOne, recyclerViewTwo;
    private StaticRvAdapter adapter;

    private ArrayList<DynamicRvModel> items;
    private DynamicRvAdapter dynamicRvAdapter;

    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        List<StaticRvModel> list = new ArrayList<>();
        list.add(new StaticRvModel(R.drawable.ic_pizza_slice, "Pizza"));
        list.add(new StaticRvModel(R.drawable.ic_burger, "Burger"));
        list.add(new StaticRvModel(R.drawable.ic_french_fries, "French Fries"));
        list.add(new StaticRvModel(R.drawable.ic_sandwich, "Sandwich"));
        list.add(new StaticRvModel(R.drawable.ic_cupcake, "Dessert"));


        adapter = new StaticRvAdapter(list, this, this);
        recyclerViewOne.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewOne.setAdapter(adapter);


        dynamicRvAdapter = new DynamicRvAdapter(items);
        recyclerViewTwo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerViewTwo.setAdapter(dynamicRvAdapter);


    }

    private void init() {

        recyclerViewOne = findViewById(R.id.horizantalRecyclerView);
        recyclerViewTwo = findViewById(R.id.varticalRecyclerView);
        items = new ArrayList<>();
    }

    @Override
    public void callBack(int positions, ArrayList<DynamicRvModel> items) {

        dynamicRvAdapter = new DynamicRvAdapter(items);
        dynamicRvAdapter.notifyDataSetChanged();
        recyclerViewTwo.setAdapter(dynamicRvAdapter);

        dynamicRvAdapter.setOnItemClickListner(new DynamicRvAdapter.OnItemClickListner() {
            @Override
            public void onItemClick(int position) {
                pos= items.get(position).getPos();

                Intent intent = new Intent(MainActivity.this, RestaurentDetailsActivity.class);
                intent.putExtra("pos",pos);
                startActivity(intent);
            }
        });
    }
}