package com.example.moderndashboard.ConfirmOrder;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moderndashboard.R;

public class ConfirmOrderActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView orderrecyclerView;
    private Button order_Confirm_Button;
    private ConfirmOrderAdapter confirmOrderAdapter;
    private UpdateSelectedItem updateSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        init();

        toolbar.setTitle("Confirm Order");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        confirmOrderAdapter = new ConfirmOrderAdapter(getApplicationContext());
        orderrecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        orderrecyclerView.setAdapter(confirmOrderAdapter);

    }

    private void init() {

        toolbar = findViewById(R.id.toolbar);
        orderrecyclerView = findViewById(R.id.order_confirm_recyclerView);
        order_Confirm_Button = findViewById(R.id.orderConfirmButton);
    }
}