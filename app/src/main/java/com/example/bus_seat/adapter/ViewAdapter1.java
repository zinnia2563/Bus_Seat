package com.example.bus_seat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bus_seat.R;
import com.example.bus_seat.holder.ViewHolder1;

import java.util.List;

public class ViewAdapter1 extends RecyclerView.Adapter<ViewHolder1> {

    private List<String> objectList;

    public ViewAdapter1(List<String> objectList) {
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_1, parent, false);
        return new ViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {
        String s = objectList.get(position);
        holder.setData(s);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }
}
