package com.example.OOP;

public class Book extends Resource {
    private String author;

    public Book(String title, String author, Integer publicationYear) {
        super(title, publicationYear);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getPublicationYear());
    }

    public String getAuthor() {
        return author;
    }

    
}
