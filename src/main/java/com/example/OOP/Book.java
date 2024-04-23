package com.example.OOP;

public class Book extends Resource {

    public Book(String title, String author, Integer publicationYear) {
        super(title, author, publicationYear);
    }

    public Book() {
        super();
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getPublicationYear());
    }
}
