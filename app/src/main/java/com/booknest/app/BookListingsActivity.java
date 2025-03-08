package com.booknest.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class BookListingsActivity extends AppCompatActivity {
    private ImageView imageViewBook;
    private TextView textViewTitle, textViewAuthor, textViewPrice;
    private Button buttonRent, buttonBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_listings);

        imageViewBook = findViewById(R.id.imageViewBook);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewAuthor = findViewById(R.id.textViewAuthor);
        textViewPrice = findViewById(R.id.textViewPrice);
        buttonRent = findViewById(R.id.buttonRent);
        buttonBuy = findViewById(R.id.buttonBuy);

        Book book = (Book) getIntent().getSerializableExtra("book");
        if (book != null) {
            textViewTitle.setText(book.getTitle());
            textViewAuthor.setText("by " + book.getAuthor());
            textViewPrice.setText("$" + book.getPrice());
            if (book.getImageUrl() != null && !book.getImageUrl().isEmpty()) {
                Glide.with(this).load(book.getImageUrl()).into(imageViewBook);
            }

        }

        buttonRent.setOnClickListener(v ->
                Toast.makeText(this, "Renting Feature Coming Soon", Toast.LENGTH_SHORT).show()
        );

        buttonBuy.setOnClickListener(v ->
                Toast.makeText(this, "Buying Feature Coming Soon", Toast.LENGTH_SHORT).show()
        );
    }
}

