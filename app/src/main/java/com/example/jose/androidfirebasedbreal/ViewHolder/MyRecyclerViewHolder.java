package com.example.jose.androidfirebasedbreal.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jose.androidfirebasedbreal.Interface.ItemClickListener;
import com.example.jose.androidfirebasedbreal.R;

public class MyRecyclerViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txt_title, txt_comment;
    ItemClickListener itemClickListener;


    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_title = (TextView) itemView.findViewById(R.id.txtTitle);
        txt_comment = (TextView) itemView.findViewById(R.id.txtContent);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());
    }

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
