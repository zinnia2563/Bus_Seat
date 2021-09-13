package com.example.bus_seat.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bus_seat.R;

public class ViewHolder1 extends RecyclerView.ViewHolder {
    private TextView seat;

    public ViewHolder1(@NonNull View itemView) {
        super(itemView);
        seat = itemView.findViewById(R.id.seatNumber1);
    }

    public void setData(String s) {
        seat.setText(s);
    }
}
