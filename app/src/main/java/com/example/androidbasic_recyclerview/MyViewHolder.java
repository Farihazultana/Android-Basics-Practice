package com.example.androidbasic_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidbasic_recyclerview.databinding.RowItemBinding;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView cityName;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        cityName = (TextView)itemView.findViewById(R.id.cityID);
    }
}
