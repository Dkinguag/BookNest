package com.booknest.app;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private double price;
    private String imageUrl;


    public Book() {}

    public Book(String title, String author, double price, String imageUrl) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }  // Now returns a double
    public String getImageUrl() { return imageUrl; }
}

