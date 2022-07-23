package me.dio.soccernews.ui.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import me.dio.soccernews.databinding.NewsItemBinding;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

            private final NewsItemBinding binding;

            public ViewHolder(NewsItemBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
    }
}
