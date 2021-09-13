package com.example.bus_seat.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bus_seat.R;

public class ViewHolder4 extends RecyclerView.ViewHolder {
    private TextView seat;

    public ViewHolder4(@NonNull View itemView) {
        super(itemView);
        seat = itemView.findViewById(R.id.seatNumber4);
    }

    public void setData(String s) {
        seat.setText(s);
    }
}
