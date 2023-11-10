package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private String[] elements;

    public Adapter(String[] elements) {
        this.elements = elements;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_item, parent, false);
        view.findViewById(R.id.elementTitle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(parent).navigate(R.id.action_navigation_home_to_navigation_dashboard);
//                Button btn = (Button) view.findViewById(R.id.elementTitle);
//                Log.i("test", btn.getText().toString());
//                com.example.myapplication.ui.dashboard.DashboardFragment.Companion.setIndexToLoad(btn.getText().toString());
            }
        });

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.SetTitle(elements[position]);
    }

    @Override
    public int getItemCount() {
        return elements.length;
    }
}
