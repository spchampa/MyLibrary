package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecyclerView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);


        adapter = new BookRecViewAdapter(this);
        booksRecyclerView = findViewById(R.id.booksRecyclerView);

        booksRecyclerView.setAdapter(adapter);
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "In Search of Lost Time", "Marcel Proust", 1913, "https://thegreatestbooks.org/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbThDIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--8bcf58c245df69c388d3d489072f19918d17bc23/51Wrlbko5QL._SL160_.jpg", "Swann's Way", "Swann's Way, the first part of A la recherche de temps perdu, Marcel Proust's seven-part cycle, was published in 1913. In it, Proust introduces the themes that run through the entire work."));
        books.add(new Book(1, "Ulysses", "James Joyce", 1913, "https://thegreatestbooks.org/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbUVCIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--8c32df0a5153c309f26a937f763439dfc0495bfd/41uosf2H2JL._SL160_.jpg", "Ulysses chronicles the passage of Leopold Bloom", "Ulysses chronicles the passage of Leopold Bloom through Dublin during an ordinary day, June 16, 1904. The title parallels and alludes to Odysseus (Latinised into Ulysses), the hero of Homer's"));
        adapter.setBooks(books);
    }
}