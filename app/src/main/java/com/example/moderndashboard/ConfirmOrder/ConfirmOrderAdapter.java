package com.example.moderndashboard.ConfirmOrder;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moderndashboard.R;

import java.util.ArrayList;

public class ConfirmOrderAdapter extends RecyclerView.Adapter<ConfirmOrderAdapter.ViewHolder> {

    private ArrayList<OrderListModel> orderListModels;
    private Context context;

    public ConfirmOrderAdapter(Context context) {
        this.context = context;
        orderListModels = ((UpdateSelectedItem) ApplicationMain.getContext()).getItems();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        OrderListModel orderListModel = orderListModels.get(position);
        holder.name.setText(orderListModel.getName());
        holder.price.setText(String.valueOf(orderListModel.getPrice()));

    }

    @Override
    public int getItemCount() {
        return orderListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);

        }
    }
}
