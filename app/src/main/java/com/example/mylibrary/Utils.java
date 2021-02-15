package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;



    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> favoriteBooks;

    private Utils() {
        if (null == allBooks) {
            allBooks = new ArrayList<>();
            initData();
        }

        if (null == alreadyReadBooks) {
            alreadyReadBooks = new ArrayList<>();
        }

        if (null == wantToReadBooks) {
            wantToReadBooks = new ArrayList<>();
        }

        if (null == currentlyReadingBooks) {
            currentlyReadingBooks = new ArrayList<>();
        }

        if (null == favoriteBooks) {
            favoriteBooks = new ArrayList<>();
        }

    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    private void initData() {
        //TODO: add initial data.

        allBooks.add(new Book(1, "In Search of Lost Time", "Marcel Proust", 1913, "https://thegreatestbooks.org/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbThDIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--8bcf58c245df69c388d3d489072f19918d17bc23/51Wrlbko5QL._SL160_.jpg", "Swann's Way", "Swann's Way, the first part of A la recherche de temps perdu, Marcel Proust's seven-part cycle, was published in 1913. In it, Proust introduces the themes that run through the entire work."));
        allBooks.add(new Book(1, "Ulysses", "James Joyce", 1913, "https://thegreatestbooks.org/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbUVCIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--8c32df0a5153c309f26a937f763439dfc0495bfd/41uosf2H2JL._SL160_.jpg", "Ulysses chronicles the passage of Leopold Bloom", "Ulysses chronicles the passage of Leopold Bloom through Dublin during an ordinary day, June 16, 1904. The title parallels and alludes to Odysseus (Latinised into Ulysses), the hero of Homer's"));




    }

    public static synchronized Utils getInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new Utils();
            return instance;
        }
    }
}
