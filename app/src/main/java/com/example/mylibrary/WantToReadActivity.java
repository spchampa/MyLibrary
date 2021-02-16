package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class WantToReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_to_read);

        RecyclerView recyclerView = findViewById(R.id.booksRecView);

        BookRecViewAdapter adapter = new BookRecViewAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setBooks(Utils.getInstance().getWantToReadBooks());
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed(); // some functionality didnt work. To fix create an intent and navigate the user back to main activity.
        Intent intent = new Intent(this, MainActivity.class); //this is the context and main activity is the destination.
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // clears the backstack then this navigation happens.
        startActivity(intent);
    }
}