package com.example.bus_seat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bus_seat.R;
import com.example.bus_seat.holder.ViewHolder4;

import java.util.List;

public class ViewAdapter4 extends RecyclerView.Adapter<ViewHolder4> {

    private List<String> objectList;

    public ViewAdapter4(List<String> objectList) {
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public ViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_4, parent, false);
        return new ViewHolder4(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder4 holder, int position) {
        String s = objectList.get(position);
        holder.setData(s);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }
}
