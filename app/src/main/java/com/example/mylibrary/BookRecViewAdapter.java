package com.example.mylibrary;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BookRecViewAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView imgBook;
        private TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
