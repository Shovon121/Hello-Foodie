package com.example.moderndashboard.ConfirmOrder;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

public class ApplicationMain extends Application implements UpdateSelectedItem {
    private static Context context;
    ArrayList<OrderListModel> orderList ;

    @Override
    public void onCreate() {
        super.onCreate();
        
        context = getApplicationContext();
        orderList = new ArrayList<>();

        
    }

    public static Context getContext(){
        return context;
    }

    @Override
    public void addItem(String name, int price) {

        orderList.add(new OrderListModel(name,price));


    }

    @Override
    public ArrayList<OrderListModel> getItems() {
        return orderList;
    }
}
