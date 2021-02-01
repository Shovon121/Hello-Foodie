package com.example.moderndashboard;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DynamicRvAdapter extends RecyclerView.Adapter<DynamicRvAdapter.DynamicViewHolder> {

    public ArrayList<DynamicRvModel> dynamicRvModels;
    private OnItemClickListner mListner;
    public interface OnItemClickListner {
        void onItemClick(int position);
    }

    public void setOnItemClickListner(OnItemClickListner mListner) {
        this.mListner = mListner;
    }


    public DynamicRvAdapter(ArrayList<DynamicRvModel> dynamicRvModels) {
        this.dynamicRvModels = dynamicRvModels;
    }

    @NonNull
    @Override
    public DynamicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_rv_item_layout, parent, false);
        DynamicViewHolder viewHolder = new DynamicViewHolder(view,mListner);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DynamicViewHolder holder, int position) {

        DynamicRvModel dynamicRvModel = dynamicRvModels.get(position);
        holder.name.setText(dynamicRvModel.getName());
        holder.imageView.setImageResource(dynamicRvModel.getImage());



    }

    @Override
    public int getItemCount() {
        return dynamicRvModels.size();
    }

    public class DynamicViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        LinearLayout linearLayout;

        public DynamicViewHolder(@NonNull View itemView, final OnItemClickListner mListner) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_of_image);
            name = itemView.findViewById(R.id.dynamicName);
            linearLayout = itemView.findViewById(R.id.itemLinerLayout);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mListner!=null){
                        int position = getAdapterPosition();
                        if (position!= RecyclerView.NO_POSITION){
                            mListner.onItemClick(position);
                        }
                    }

                }
            });
        }
    }
}

