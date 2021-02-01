package com.example.moderndashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.ViewHolder> {


    List<StaticRvModel> items;
    Context context;
    int rowIndex = -1;
    UpdateRececlerView updateRececlerView;
    boolean check = true;
    boolean select = true;


    public StaticRvAdapter(List<StaticRvModel> items, Context context, UpdateRececlerView updateRececlerView) {
        this.items = items;
        this.context = context;
        this.updateRececlerView = updateRececlerView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.static_rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        StaticRvModel staticRvModel = items.get(position);
        holder.text.setText(staticRvModel.getText());
        holder.pizzaImage.setImageResource(staticRvModel.getImage());

        if (check) {

            ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

            items.add(new DynamicRvModel("Burger 1", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 2", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 3", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 4", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 5", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 6", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 7", R.drawable.ic_burger, 0));
            items.add(new DynamicRvModel("Burger 8", R.drawable.ic_burger, 0));

            updateRececlerView.callBack(position, items);
            check = false;

        }


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rowIndex = position;
                notifyDataSetChanged();
                if (position == 0) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

                    items.add(new DynamicRvModel("Pizza 1", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 2", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 3", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 4", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 5", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 6", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 7", R.drawable.ic_pizza_slice, 0));
                    items.add(new DynamicRvModel("Pizza 8", R.drawable.ic_pizza_slice, 0));


                    updateRececlerView.callBack(position, items);
                } else if (position == 1) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

                    items.add(new DynamicRvModel("Burger 1", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 2", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 3", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 4", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 5", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 6", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 7", R.drawable.ic_burger, 1));
                    items.add(new DynamicRvModel("Burger 8", R.drawable.ic_burger, 1));

                    updateRececlerView.callBack(position, items);

                } else if (position == 2) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

                    items.add(new DynamicRvModel("French Fries 1", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 2", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 3", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 4", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 5", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 6", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 7", R.drawable.ic_french_fries, 2));
                    items.add(new DynamicRvModel("French Fries 8", R.drawable.ic_french_fries, 2));


                    updateRececlerView.callBack(position, items);
                } else if (position == 3) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

                    items.add(new DynamicRvModel("Sand Witch 1", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 2", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 3", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 4", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 5", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 6", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 7", R.drawable.ic_sandwich, 3));
                    items.add(new DynamicRvModel("Sand Witch 8", R.drawable.ic_sandwich, 3));


                    updateRececlerView.callBack(position, items);
                } else if (position == 4) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();

                    items.add(new DynamicRvModel("Dessert 1", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 2", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 3", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 4", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 5", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 6", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 7", R.drawable.ic_cupcake, 4));
                    items.add(new DynamicRvModel("Dessert 8", R.drawable.ic_cupcake, 4));


                    updateRececlerView.callBack(position, items);
                }
            }
        });

        if (select) {
            if (rowIndex == position) {
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
            } else {
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
            }
        }


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView pizzaImage;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pizzaImage = itemView.findViewById(R.id.pizzaImgae);
            text = itemView.findViewById(R.id.textTV);
            linearLayout = itemView.findViewById(R.id.linearlayout);
        }
    }
}
