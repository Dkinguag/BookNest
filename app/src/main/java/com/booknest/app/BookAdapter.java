package com.booknest.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.bumptech.glide.Glide;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book> bookList;
    private OnBookClickListener onBookClickListener;

    public interface OnBookClickListener {
        void onBookClick(Book book);
    }

    // Constructor
    public BookAdapter(List<Book> bookList, OnBookClickListener listener) {
        this.bookList = bookList;
        this.onBookClickListener = listener;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = bookList.get(position);

        // Ensure textTitle is not null before calling setText()
        if (holder.textTitle != null) {
            holder.textTitle.setText(book.getTitle());
        }

        // Load image safely with Glide
        if (book.getImageUrl() != null && !book.getImageUrl().isEmpty()) {
            Glide.with(holder.itemView.getContext())
                    .load(book.getImageUrl())
                    .into(holder.imageViewBookCover);
        } else {
            // Load a placeholder image if URL is missing
            holder.imageViewBookCover.setImageResource(R.drawable.placeholder_image);
        }

        // Handle book click
        holder.itemView.setOnClickListener(v -> {
            if (onBookClickListener != null) {
                onBookClickListener.onBookClick(book);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle;
        ImageView imageViewBookCover;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textViewTitle);
            imageViewBookCover = itemView.findViewById(R.id.imageViewBookCover);
        }
    }

}

