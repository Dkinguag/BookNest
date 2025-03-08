package com.booknest.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddBookActivity extends AppCompatActivity {
    private EditText editTitle, editAuthor, editPrice;
    private Button buttonSave;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        db = FirebaseFirestore.getInstance();

        editTitle = findViewById(R.id.editTextTitle);
        editAuthor = findViewById(R.id.editTextAuthor);
        editPrice = findViewById(R.id.editTextPrice);
        buttonSave = findViewById(R.id.buttonAddBook);

        buttonSave.setOnClickListener(v -> {
            String title = editTitle.getText().toString();
            String author = editAuthor.getText().toString();
            double price = Double.parseDouble(editPrice.getText().toString());


            if (title.isEmpty() || author.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            Book book = new Book(title, author, price, "");  // No image for now

            db.collection("books").add(book)
                    .addOnSuccessListener(documentReference -> {
                        Toast.makeText(this, "Book Added!", Toast.LENGTH_SHORT).show();
                        finish();
                    })
                    .addOnFailureListener(e -> Log.e("Firestore", "Error adding book", e));
        });
    }
}


