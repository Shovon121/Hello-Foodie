package com.example.moderndashboard.RestaurentDetails.RestauretAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moderndashboard.R;
import com.example.moderndashboard.RestaurentDetails.RestaurentInterface;
import com.example.moderndashboard.RestaurentDetails.RestaurentModel.RestaurentModelOne;
import com.example.moderndashboard.RestaurentDetails.RestaurentModel.RestaurentModelTwo;


import java.util.ArrayList;
import java.util.List;

public class RestaurentAdapterOne extends RecyclerView.Adapter<RestaurentAdapterOne.ViewHolder> {
    List<RestaurentModelOne> items;
    Context context;
    int rowIndex = -1;
    RestaurentInterface resUpdateRececlerView;
    boolean check = true;
    boolean select = true;
    int p;

    public RestaurentAdapterOne(List<RestaurentModelOne> items, Context context, RestaurentInterface resUpdateRececlerView) {
        this.items = items;
        this.context = context;
        this.resUpdateRececlerView = resUpdateRececlerView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestaurentAdapterOne.ViewHolder(LayoutInflater.from(context).inflate(R.layout.rest_one_demo, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        RestaurentModelOne restaurentModelOne = items.get(position);
        holder.text.setText(restaurentModelOne.getText());
        holder.pizzaImage.setImageResource(restaurentModelOne.getImage());
        p=restaurentModelOne.getPos();

        if (check) {

            if (check) {
                if (p==0){
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();

                    items.add(new RestaurentModelTwo("Pizza 1", 200));
                    items.add(new RestaurentModelTwo("Pizza 2", 200));
                    items.add(new RestaurentModelTwo("Pizza 3", 200));
                    items.add(new RestaurentModelTwo("Pizza 4", 200));
                    items.add(new RestaurentModelTwo("Pizza 5", 200));
                    items.add(new RestaurentModelTwo("Pizza 6", 200));
                    items.add(new RestaurentModelTwo("Pizza 7", 200));
                    items.add(new RestaurentModelTwo("Pizza 8", 200));

                    items.add(new RestaurentModelTwo("Pizza 8", 200));

                    resUpdateRececlerView.callBack(position, items);

                }else if (p==1){
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();

                    items.add(new RestaurentModelTwo("Burger 1", 200));
                    items.add(new RestaurentModelTwo("Burger 2", 200));
                    items.add(new RestaurentModelTwo("Burger 3", 200));
                    items.add(new RestaurentModelTwo("Burger 4", 200));
                    items.add(new RestaurentModelTwo("Burger 5", 200));
                    items.add(new RestaurentModelTwo("Burger 6", 200));
                    items.add(new RestaurentModelTwo("Burger 7", 200));
                    items.add(new RestaurentModelTwo("Burger 8", 200));

                    resUpdateRececlerView.callBack(position, items);
                }else if (p==2){
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("French Fries  1", 200));
                    items.add(new RestaurentModelTwo("French Fries  2", 200));
                    items.add(new RestaurentModelTwo("French Fries  3", 200));
                    items.add(new RestaurentModelTwo("French Fries  4", 200));
                    items.add(new RestaurentModelTwo("French Fries  5", 200));
                    items.add(new RestaurentModelTwo("French Fries  6", 200));
                    items.add(new RestaurentModelTwo("French Fries  7", 200));
                    items.add(new RestaurentModelTwo("French Fries  8", 200));
                    resUpdateRececlerView.callBack(position, items);
                }else if (p==3){
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("Sand Witch  1", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  2", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  3",200));
                    items.add(new RestaurentModelTwo("Sand Witch  4", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  5", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  6", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  7", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  8", 200));
                    resUpdateRececlerView.callBack(position, items);
                }else if (p==4){
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("Dessert  1", 200));
                    items.add(new RestaurentModelTwo("Dessert  2", 200));
                    items.add(new RestaurentModelTwo("Dessert  3", 200));
                    items.add(new RestaurentModelTwo("Dessert  4", 200));
                    items.add(new RestaurentModelTwo("Dessert  5", 200));
                    items.add(new RestaurentModelTwo("Dessert  6", 200));
                    items.add(new RestaurentModelTwo("Dessert  7", 200));
                    items.add(new RestaurentModelTwo("Dessert  8", 200));
                    resUpdateRececlerView.callBack(position, items);
                }


            }
            check = false;

        }


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rowIndex = position;

                notifyDataSetChanged();

                if (position == 1) {
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();

                    items.add(new RestaurentModelTwo("Burger 1", 200));
                    items.add(new RestaurentModelTwo("Burger 2", 200));
                    items.add(new RestaurentModelTwo("Burger 3", 200));
                    items.add(new RestaurentModelTwo("Burger 4", 200));
                    items.add(new RestaurentModelTwo("Burger 5", 200));
                    items.add(new RestaurentModelTwo("Burger 6", 200));
                    items.add(new RestaurentModelTwo("Burger 7", 200));
                    items.add(new RestaurentModelTwo("Burger 8", 200));

                    resUpdateRececlerView.callBack(position, items);

                } else if (position == 0) {

                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();

                    items.add(new RestaurentModelTwo("Pizza 1", 200));
                    items.add(new RestaurentModelTwo("Pizza 2", 200));
                    items.add(new RestaurentModelTwo("Pizza 3", 200));
                    items.add(new RestaurentModelTwo("Pizza 4", 200));
                    items.add(new RestaurentModelTwo("Pizza 5", 200));
                    items.add(new RestaurentModelTwo("Pizza 6", 200));
                    items.add(new RestaurentModelTwo("Pizza 7", 200));
                    items.add(new RestaurentModelTwo("Pizza 8", 200));

                    items.add(new RestaurentModelTwo("Pizza 8", 200));

                    resUpdateRececlerView.callBack(position, items);
                } else if (position == 3) {

                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("Sand Witch  1", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  2", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  3",200));
                    items.add(new RestaurentModelTwo("Sand Witch  4", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  5", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  6", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  7", 200));
                    items.add(new RestaurentModelTwo("Sand Witch  8", 200));

                } else if (position == 4) {
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("Dessert  1", 200));
                    items.add(new RestaurentModelTwo("Dessert  2", 200));
                    items.add(new RestaurentModelTwo("Dessert  3", 200));
                    items.add(new RestaurentModelTwo("Dessert  4", 200));
                    items.add(new RestaurentModelTwo("Dessert  5", 200));
                    items.add(new RestaurentModelTwo("Dessert  6", 200));
                    items.add(new RestaurentModelTwo("Dessert  7", 200));
                    items.add(new RestaurentModelTwo("Dessert  8", 200));
                    resUpdateRececlerView.callBack(position, items);
                } else if (position == 2) {
                    ArrayList<RestaurentModelTwo> items = new ArrayList<RestaurentModelTwo>();
                    items.add(new RestaurentModelTwo("French Fries  1", 200));
                    items.add(new RestaurentModelTwo("French Fries  2", 200));
                    items.add(new RestaurentModelTwo("French Fries  3", 200));
                    items.add(new RestaurentModelTwo("French Fries  4", 200));
                    items.add(new RestaurentModelTwo("French Fries  5", 200));
                    items.add(new RestaurentModelTwo("French Fries  6", 200));
                    items.add(new RestaurentModelTwo("French Fries  7", 200));
                    items.add(new RestaurentModelTwo("French Fries  8", 200));
                    resUpdateRececlerView.callBack(position, items);
                }
            }
        });


        if (select) {

                if (rowIndex == position) {
                    holder.linearLayout.setBackgroundResource(R.drawable.rs_rv_select_bg);
                } else {
                    holder.linearLayout.setBackgroundResource(R.drawable.rs_rv_bg);

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
