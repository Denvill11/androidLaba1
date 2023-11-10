package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView titleView;

    public void SetTitle(String title) {
        titleView.setText(title);
    }

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.elementTitle);
    }

}