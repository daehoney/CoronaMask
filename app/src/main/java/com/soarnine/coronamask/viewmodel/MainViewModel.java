package com.soarnine.coronamask.viewmodel;

import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;

import com.soarnine.coronamask.MainRecyclerViewAdapter;
import com.soarnine.coronamask.model.GeoStore;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel {

    private List<GeoStore.StoresBean> stores;
    private MainRecyclerViewAdapter adapter;

    public MainViewModel() {
        if(stores == null) {
            stores = new ArrayList<>();
        }

        if(adapter == null) {
            adapter = new MainRecyclerViewAdapter(this);
        }
    }

    public MainRecyclerViewAdapter getAdapter() {
        return adapter;
    }

    public List<GeoStore.StoresBean> getStores() {
        return stores;
    }

    public void setStores(List<GeoStore.StoresBean> stores) {
        this.stores = stores;
    }

    public String getAddress(int pos) {
        return stores.get(pos).getAddr();
    }

    public String getName(int pos) {
        return stores.get(pos).getName();
    }

    public String getRemain_stat(int pos) {
        return stores.get(pos).getRemain_stat();
    }
}
