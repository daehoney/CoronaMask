package com.soarnine.coronamask;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.soarnine.coronamask.databinding.ListItemBinding;
import com.soarnine.coronamask.viewmodel.MainViewModel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private MainViewModel viewModel;

    public MainRecyclerViewAdapter(MainViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bind(viewModel, position);
        }
    }

    @Override
    public int getItemCount() {
        return viewModel.getStores() == null ? 0 : viewModel.getStores().size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ListItemBinding binding;

        public ItemViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(MainViewModel viewModel, int pos) {
            binding.setViewModel(viewModel);
            binding.setPos(pos);
            binding.executePendingBindings();
        }
    }
}
