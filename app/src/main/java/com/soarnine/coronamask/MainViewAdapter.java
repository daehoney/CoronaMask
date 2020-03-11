package com.soarnine.coronamask;

import android.graphics.Color;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewAdapter {

    @BindingAdapter("bindMainRecyclerAdapter")
    public static void bindMainRecyclerAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter("remainStatColor")
    public static void remainStatColor(TextView view, String text) {
        if ("plenty".equals(text)) {
            view.setText("재고많음(100 개 이상)");
            view.setTextColor(Color.parseColor("#318f34"));
        } else if ("some".equals(text)) {
            view.setText("재고있음(30 ~ 99 개)");
            view.setTextColor(Color.parseColor("#e6cb22"));
        } else if ("few".equals(text)) {
            view.setText("재고부족(2 ~ 29 개)");
            view.setTextColor(Color.parseColor("#d13c26"));
        } else {
            view.setText("재고없음");
            view.setTextColor(Color.parseColor("#53555c"));
        }
    }
}
