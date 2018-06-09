package com.leentantu.stackoverflowers.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.leentantu.stackoverflowers.model.StackoverflowUser;

import java.util.List;

public class StackoverflowUserAdapter extends RecyclerView.Adapter<StackoverflowUserAdapter.BindingHolder>{

    private List<StackoverflowUser> stackoverflowUsers;
    private Context context;

    public StackoverflowUserAdapter(List<StackoverflowUser> users, Context context) {
        this.stackoverflowUsers = users;
        this.context = context;

    }
    @Override
    public BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        StackoverflowUserBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.user_list_item, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StackoverflowUserAdapter.BindingHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class BindingHolder extends RecyclerView.ViewHolder {
        private StackoverflowUserBinding binding;

        public BindingHolder(StackoverflowUserBinding binding) {
            super(binding);
            this.binding = binding;
        }
}
