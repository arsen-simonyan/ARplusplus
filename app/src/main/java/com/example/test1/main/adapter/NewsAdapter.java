package com.example.test1.main.adapter;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test1.R;
import com.example.test1.main.main_data.Items;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<Items> news_items;

    private OnItemClickListener click;

    public NewsAdapter(final List<Items> news_items) {
        this.news_items = news_items;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setList(final List<Items> news_items) {
        Log.e("########", Integer.toString(news_items.size()));
        this.news_items = news_items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.bind(news_items.get(position));
    }

    @Override
    public int getItemCount() {
        return news_items.size();
    }

    public
    interface OnItemClickListener {
        void OnItemClick(Items assort);
    }

    public void setOnItemClickListener(OnItemClickListener click) {
        this.click = click;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        Items items;
        final TextView textTitle;
        final TextView categoryName;
        final ImageView imageFavorite;
        final SimpleDraweeView picture;
        final RatingBar rating;

        ViewHolder(@NonNull final View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.textTitle);
            categoryName = itemView.findViewById(R.id.categoryName);
            imageFavorite = itemView.findViewById(R.id.imageFavorite);
            picture = itemView.findViewById(R.id.imagePicture);
            rating = itemView.findViewById(R.id.ratingBar);

            itemView.setOnClickListener(v -> {
                if (click != null)
                    click.OnItemClick(items);
            });
        }

        void bind(Items items) {
            this.items = items;

            float dRating = Float.parseFloat(items.getFields().getStarRating());

            textTitle.setText(items.getFields().getHeadline());
            categoryName.setText(items.getSectionName());
            picture.setImageURI(Uri.parse(items.getFields().getThumbnail()));
            rating.setRating(dRating);
        }
    }
}
