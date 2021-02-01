package com.example.moderndashboard.RestaurentDetails.RestauretAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moderndashboard.ConfirmOrder.ApplicationMain;
import com.example.moderndashboard.ConfirmOrder.UpdateSelectedItem;
import com.example.moderndashboard.DynamicRvModel;
import com.example.moderndashboard.R;
import com.example.moderndashboard.RestaurentDetails.RestaurentModel.RestaurentModelTwo;

import java.util.ArrayList;

public class RestaurentAdapterTwo extends RecyclerView.Adapter<RestaurentAdapterTwo.ViewHolder> {

    public ArrayList<RestaurentModelTwo> restaurentModelTwos;

    String name ;
    int price;

    UpdateSelectedItem updateSelectedItem;

    public RestaurentAdapterTwo(ArrayList<RestaurentModelTwo> dynamicRvModels ,UpdateSelectedItem updateSelectedItem) {
        this.restaurentModelTwos = dynamicRvModels;
        this.updateSelectedItem= updateSelectedItem;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_demo_two, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RestaurentModelTwo restaurentModelTwo = restaurentModelTwos.get(position);
        holder.name.setText(restaurentModelTwo.getName());

        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = restaurentModelTwo.getName();
                price = restaurentModelTwo.getPrice();

                ((UpdateSelectedItem) ApplicationMain.getContext()).addItem(name,price);
                holder.add.setVisibility(View.INVISIBLE);
                holder.check.setVisibility(View.VISIBLE);


            }
        });



    }

    @Override
    public int getItemCount() {
        return restaurentModelTwos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        LinearLayout linearLayout;
        ImageView add,check;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.dynamicName);
            linearLayout = itemView.findViewById(R.id.itemLinerLayout);
            add = itemView.findViewById(R.id.add_cart);
            check = itemView.findViewById(R.id.done);
        }
    }
}
